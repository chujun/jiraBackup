AJS.test.require("jira.webresources:dialogs");
AJS.test.require("com.atlassian.jira.dev.func-test-plugin:sinon");

(function($) {
    module("JIRA.SmartAjax.showWebSudoDialog", {
        teardown: function() {
            this.sandbox.restore();
            JIRA.FormDialog = this.fd;
        },
        setup: function() {
            this.sandbox = sinon.sandbox.create();
            this.fd = JIRA.FormDialog;
            var test = this;

            AJS.reloadViaWindowLocation = test.sandbox.spy();

            JIRA.FormDialog = function(options) {
                this.show = test.sandbox.spy();
                this.hide = test.sandbox.spy();
                this._setContent = test.sandbox.spy();
                this.options = options;
                this.triggerHide = function(reason) {
                    $(this).trigger("Dialog.hide", [{
                        find: function() {
                            return {
                                attr: function() {
                                    return test.href;
                                }
                            }
                        }
                    }, reason]);
                };

                JIRA.FormDialog.last = this;
            }
        }
    });

    function assertWebSudoDialogSuccess(success) {

        var dialog = JIRA.FormDialog.last;
        ok(dialog.show.calledOnce, "Dialog was shown.");

        //This is the main thing we want to test.
        var handler = dialog.options.submitHandler;
        var event = jQuery.Event();
        event.target = jQuery("<form></form>").attr("action", "url").append("<input name='jack' value='jill'/>");

        var closeCallback = this.sandbox.spy();
        var makeRequest = this.sandbox.stub(JIRA.SmartAjax, "makeRequest");

        //Call the handler and made some assertions.
        handler(event, closeCallback);
        ok(event.isDefaultPrevented(), "Default operation prevented.");
        ok(makeRequest.calledOnce, "Made the request for the websudo dialog.");

        //First call first argument is the AJAX options.
        var callArguments = makeRequest.args[0][0];
        equal(callArguments.url, event.target.attr("action"), "Correct Action");
        equal(callArguments.data, event.target.serialize(), "Correct Data");
        equal(callArguments.type, "POST", "Correct type");

        //Complete handler.
        var completeHandler = callArguments.complete;
        var xhr = {
            getResponseHeader: this.sandbox.stub(),
            responseText: "callback"
        };

        //Lets do a failed request.
        completeHandler(xhr);
        ok(!closeCallback.called, "Close callback should not be called.");
        ok(!dialog.hide.called, "Dialog should not be closed.");
        if (success) {
            ok(!success.called, "Success function should not have been called.");
        }
        ok(dialog._setContent.calledWith(xhr.responseText, true), "Dialog content reset.");

        //Lets simulate success.
        xhr.getResponseHeader.withArgs("X-Atlassian-WebSudo").returns("Has-Authentication");

        completeHandler(xhr);

        if (success) {
            ok(success.calledOnce, "Success called.");
            ok(!closeCallback.called, "Close callback should not be called.");
            ok(!dialog.hide.called, "Dialog should not be closed.");

            success.args[0][0]();
        }

        ok(closeCallback.calledOnce, "Close callback should be called.");
        ok(dialog.hide.calledOnce, "Dialog should be closed.");
    }


    test("not success callback", function() {
        //Check with no callbacks.
        JIRA.SmartAjax.showWebSudoDialog({});
        assertWebSudoDialogSuccess.call(this);
    });

    test("success callback", function() {
        //Check with no callbacks.
        var successCallback = this.sandbox.spy();
        var context = {};
        JIRA.SmartAjax.showWebSudoDialog({
            success: successCallback,
            context: context
        });

        assertWebSudoDialogSuccess.call(this, successCallback);
        ok(successCallback.alwaysCalledOn(context), "Right context set?");
    });

    test("aborted no cancel", function() {
        JIRA.SmartAjax.showWebSudoDialog({});
        var dialog = JIRA.FormDialog.last;
        ok(dialog.show.calledOnce, "Dialog was shown.");

        dialog.triggerHide(JIRA.Dialog.HIDE_REASON.cancel);
        dialog.triggerHide(JIRA.Dialog.HIDE_REASON.escape);
    });

    var assertWebSudoDialogCancelled =  function(reason) {
        AJS.reloadViaWindowLocation.reset();
        this.href = "i love web sudo";
        var cancel = this.sandbox.spy();
        var context = {};
        JIRA.SmartAjax.showWebSudoDialog({
            cancel: cancel,
            context: context
        });

        var dialog = JIRA.FormDialog.last;
        ok(dialog.show.calledOnce, "Dialog was shown.");

        //Simulate dialog close.
        dialog.triggerHide(reason);

        //We only trigger on the first event.
        ok(cancel.calledOnce, "Cancel trigger should be called once.");
        ok(cancel.alwaysCalledOn(context), "Called on right context.");
        ok(AJS.reloadViaWindowLocation.calledWithExactly(this.href));
    };

    test("aborted with cancel", function() {
        assertWebSudoDialogCancelled.call(this, JIRA.Dialog.HIDE_REASON.cancel);
    });

    test("aborted with escape", function() {
        assertWebSudoDialogCancelled.call(this, JIRA.Dialog.HIDE_REASON.escape);
    });

    test("can prevent redirect by e.preventDefault()", function() {
        AJS.reloadViaWindowLocation.reset();
        JIRA.SmartAjax.showWebSudoDialog({
            cancel: function(e) {
                e.preventDefault();
            }
        });
        ok(!AJS.reloadViaWindowLocation.called);
    });

    test("can prevent redirect by returning false", function() {
        AJS.reloadViaWindowLocation.reset();
        JIRA.SmartAjax.showWebSudoDialog({
            cancel: function() {
                return false;
            }
        });
        ok(!AJS.reloadViaWindowLocation.called);
    });

    module("JIRA.SmartAjax.handleWebSudoError", {
        teardown: function() {
            this.sandbox.restore();
        },
        setup: function() {
            this.sandbox = sinon.sandbox.create();
            this.dialog = this.sandbox.stub(JIRA.SmartAjax, "showWebSudoDialog");
            this.makeRequest = this.sandbox.stub(JIRA.SmartAjax, "makeRequest");
        }
    });

    test("success without delegating handler", function() {

        var options = {};
        var xhr = {};
        var status = "something";
        var result = {};

        JIRA.SmartAjax.handleWebSudoError(options, undefined, xhr, status, result);
        ok(this.dialog.calledOnce, "Delgate to showWebSudoDialog");

        var dialogOptions = this.dialog.args[0][0];
        ok($.isFunction(dialogOptions.success), "Provided success.");
        ok($.isFunction(dialogOptions.cancel), "Provided cancel.");

        //Check the default success callback.
        var callback = this.sandbox.spy();
        dialogOptions.success.call(undefined, callback);

        ok(callback.calledOnce, "Make sure we close the dialog by default.");
        ok(this.makeRequest.calledOnce, "Make the request again, it might just work this time.");
        ok(this.makeRequest.calledWithExactly(options), "Make the request again, it might just work this time.");

    });

    test("success with delegating handler", function() {
        var success = this.sandbox.spy();
        var options = {};
        var xhr = {};
        var status = "something";
        var result = {};

        JIRA.SmartAjax.handleWebSudoError(options, {success: success}, xhr, status, result);
        ok(this.dialog.calledOnce, "Delgate to showWebSudoDialog");

        var dialogOptions = this.dialog.args[0][0];
        ok($.isFunction(dialogOptions.success), "Provided success.");
        ok($.isFunction(dialogOptions.cancel), "Provided cancel.");

        //Check the default success callback.
        var callback = this.sandbox.spy();
        dialogOptions.success.call(undefined, callback);

        ok(!callback.calledOnce, "With a callback we don't close the dialog.");
        ok(this.makeRequest.calledOnce, "Make the request again, it might just work this time.");
        ok(this.makeRequest.calledWithExactly(options), "Make the request again, it might just work this time.");
        ok(success.calledOnce, "The success handler should have been called.");

        //Close the dialog.
        success.args[0][0]();
        ok(callback.calledOnce, "The callback has now closed the dialog.");
    });

    test("cancel wihtout handler", function() {
        var options = {};
        var xhr = {};
        var status = "something";
        var result = {};

        JIRA.SmartAjax.handleWebSudoError(options, undefined, xhr, status, result);
        ok(this.dialog.calledOnce, "Delgate to showWebSudoDialog");

        var dialogOptions = this.dialog.args[0][0];
        ok($.isFunction(dialogOptions.success), "Provided success.");
        ok($.isFunction(dialogOptions.cancel), "Provided cancel.");

        //Check the default success callback.
        dialogOptions.cancel.call(undefined);
    });

    test("cancel with dialog Handler", function() {
        var cancel = this.sandbox.spy();
        var options = {};
        var xhr = {};
        var status = "something";
        var result = {};
        var context = {};

        JIRA.SmartAjax.handleWebSudoError(options, {cancel: cancel}, xhr, status, result);
        ok(this.dialog.calledOnce, "Delgate to showWebSudoDialog");

        var dialogOptions = this.dialog.args[0][0];
        ok($.isFunction(dialogOptions.success), "Provided success.");
        ok($.isFunction(dialogOptions.cancel), "Provided cancel.");

        //Check the default success callback.
        dialogOptions.cancel.call(context);
        ok(cancel.calledOnce, "Cancel called on the dialog options.");
        ok(cancel.alwaysCalledOn(context), "Called with the right context.");
    });

    test("cancel with ajax handler Handler", function() {
        var cancel = this.sandbox.spy();
        var options = {
            complete: cancel
        };
        var xhr = {};
        var status = "something";
        var result = {};
        var context = {};

        JIRA.SmartAjax.handleWebSudoError(options, {cancel: ""}, xhr, status, result);
        ok(this.dialog.calledOnce, "Delgate to showWebSudoDialog");

        var dialogOptions = this.dialog.args[0][0];
        ok($.isFunction(dialogOptions.success), "Provided success.");
        ok($.isFunction(dialogOptions.cancel), "Provided cancel.");

        //Check the default success callback.
        dialogOptions.cancel.call(context);
        ok(cancel.calledOnce, "Cancel called on the dialog options.");
        ok(cancel.alwaysCalledOn(context), "Called with the right context.");
        ok(cancel.alwaysCalledWithExactly(xhr, status, result), "Called with right arguments.");
    });

    module("JIRA.SmartAjax.makeWebSudoRequest", {
        teardown: function() {
            this.sandbox.restore();
        },
        setup: function() {
            this.sandbox = sinon.sandbox.create();
        }
    });

    test("makeWebSudoRequest with non 401 status code.", function() {
        var makeRequest = this.sandbox.stub(JIRA.SmartAjax, "makeRequest");
        var error = this.sandbox.spy();
        var promiseError = this.sandbox.spy();

        //make the request.
        var promise = JIRA.SmartAjax.makeWebSudoRequest({
            error: error,
            copy: "me"
        });

        promise.fail(promiseError);

        ok(makeRequest.calledOnce, "makeRequest called.");

        //First time through we get an error.
        var newArgs = makeRequest.getCall(0).args;
        equal(newArgs.length, 1, "makeRequest called with 1 argument.");
        var newOptions = newArgs[0];
        equal(newOptions.copy, "me", "Make sure non-error options copied.");

        var xhr = {status: 38, responseText: "ignored"};
        var statusText = "sjdjakdjakda";
        var errorThrown = "4897589475893754983";
        var result = "rehsjfhdskjfhsdkhgtiu4y4";

        newOptions.error(xhr, statusText, errorThrown, result);

        ok(error.calledOnce, "Called Original Error");
        ok(error.getCall(0).calledWithExactly(xhr, statusText, errorThrown, result), "Called error with correct arguments.");

        ok(promiseError.calledOnce, "Called Original Error");
        ok(promiseError.getCall(0).calledWithExactly(xhr, statusText, errorThrown, result), "Called error with correct arguments.");
    });

    test("makeWebSudoRequest with 401 status code but not WebSudo failure.", function() {
        var makeRequest = this.sandbox.stub(JIRA.SmartAjax, "makeRequest");
        var error = this.sandbox.spy();
        var promiseError = this.sandbox.spy();

        //make the request.
        var promise = JIRA.SmartAjax.makeWebSudoRequest({
            error: error,
            copy: "me"
        });

        promise.fail(promiseError);

        ok(makeRequest.calledOnce, "makeRequest called.");

        //First time through we get an error.
        var newArgs = makeRequest.getCall(0).args;
        equal(newArgs.length, 1, "makeRequest called with 1 argument.");
        var newOptions = newArgs[0];
        equal(newOptions.copy, "me", "Make sure non-error options copied.");

        var xhr = {status: 401, responseText: "ignored"};
        var statusText = "sjdjakdjakda";
        var errorThrown = "4897589475893754983";
        var result = "rehsjfhdskjfhsdkhgtiu4y4";

        newOptions.error(xhr, statusText, errorThrown, result);

        ok(error.calledOnce, "Called Original Error Again");
        ok(error.getCall(0).calledWithExactly(xhr, statusText, errorThrown, result), "Called error.");

        ok(promiseError.calledOnce, "Called Original Error Again");
        ok(promiseError.getCall(0).calledWithExactly(xhr, statusText, errorThrown, result), "Called error.");
    });

    test("makeWebSudoRequest with websudo dialog & success", function() {
        var makeRequest = this.sandbox.stub(JIRA.SmartAjax, "makeRequest");
        var handleWebSudoError = this.sandbox.stub(JIRA.SmartAjax, "handleWebSudoError");

        var success = this.sandbox.spy();
        var promiseSuccess = this.sandbox.spy();
        var complete = this.sandbox.spy();
        var promiseError = this.sandbox.spy();
        var error = this.sandbox.spy();

        //make the request.
        var promise = JIRA.SmartAjax.makeWebSudoRequest({
            error: error,
            success: success,
            complete: complete,
            copy: "me"
        });

        promise.fail(promiseError).done(promiseSuccess);

        ok(makeRequest.calledOnce, "makeRequest called.");

        //First time through we get an error.
        var newArgs = makeRequest.getCall(0).args;
        equal(newArgs.length, 1, "makeRequest called with 1 argument.");
        var newOptions = newArgs[0];
        equal(newOptions.copy, "me", "Make sure non-error options copied.");

        //Simulate a websudo error.
        var xhr = {status: 401, responseText: "websudo"};
        var statusText = "sjdjakdjakda";
        var errorThrown = "4897589475893754983";
        var result = "rehsjfhdskjfhsdkhgtiu4y4";

        //Error - then complete like regular XHR.
        newOptions.error(xhr, statusText, errorThrown, result);
        newOptions.complete();

        ok(!success.called, "Nothing should be called while websudo detected open.");
        ok(!promiseSuccess.called, "Nothing should be called while websudo detected open.");
        ok(!complete.called, "Nothing should be called while websudo detected open.");
        ok(!promiseError.called, "Nothing should be called while websudo detected open.");
        ok(!error.called, "Nothing should be called while websudo detected open.");
        ok(handleWebSudoError.called, "Make sure we open the websudo dialog.");

        var ajaxOptions = handleWebSudoError.args[0][0];

        var randomArgument = {};
        var randomArgument2 = {};
        var context = {};

        //Lets sumulate success to make sure the success handler works.
        ajaxOptions.success.call(context, randomArgument);
        ajaxOptions.complete.call(context, randomArgument2);

        ok(success.called, "Success should now be called.");
        ok(success.alwaysCalledWithExactly(randomArgument), "Called with correct arguments.");
        ok(success.alwaysCalledOn(context, randomArgument), "Called with correct context.");

        ok(promiseSuccess.called, "Promise success should now be called.");
        ok(promiseSuccess.alwaysCalledWithExactly(randomArgument), "Called with correct arguments.");
        ok(promiseSuccess.alwaysCalledOn(context, randomArgument), "Called with correct context.");

        ok(complete.called, "Complete should now be called.");
        ok(complete.alwaysCalledWithExactly(randomArgument2), "Called with correct arguments.");
        ok(complete.alwaysCalledOn(context, randomArgument2), "Called with correct context.");


        ok(!promiseError.called, "Error should never have been called.");
        ok(!error.called, "Error should never have been called.");
    });
})(jQuery);
