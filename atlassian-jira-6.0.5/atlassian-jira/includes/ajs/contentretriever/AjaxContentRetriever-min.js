AJS.AjaxContentRetriever=AJS.ContentRetriever.extend({init:function(options){var instance=this;this.ajaxOptions=options;if(!this.ajaxOptions.requestDelay&&this.ajaxOptions.requestDelay!==0){this.ajaxOptions.requestDelay=75}},getAjaxOptions:function(){var ajaxOptions,instance=this;if(typeof this.ajaxOptions==="string"){ajaxOptions={url:this.ajaxOptions}}else{if(jQuery.isFunction(this.ajaxOptions)){ajaxOptions=this.ajaxOptions()}else{ajaxOptions=this.ajaxOptions}}ajaxOptions.globalThrobber=false;ajaxOptions.success=function(data,textStatus,xhr){instance._requestComplete(xhr,textStatus,data,true,null)};ajaxOptions.error=function(xhr,textStatus){if(xhr.rc){xhr.status=xhr.rc}instance._requestComplete(xhr,textStatus,null,false,null)};return ajaxOptions},content:function(arg){if(AJS.$.isFunction(arg)){this.callback=arg;this._makeRequest(arg)}else{if(arg){if(this.callback){this.callback(arg);delete this.callback}}}return this.$content},startingRequest:function(callback){if(callback){this.startingCallback=callback}else{if(this.startingCallback){this.locked=true;this.startingCallback()}}},finishedRequest:function(callback){if(callback){this.finishedCallback=callback}else{if(this.finishedCallback){this.locked=false;this.finishedCallback()}}},failedRequest:function(callback){if(callback){this.failedCallback=callback}else{if(this.failedCallback){this.locked=false;this.failedCallback()}}},cache:function(cache){if(typeof cache!=="undefined"){this.getAjaxOptions().cache=cache}return this.getAjaxOptions().cache},isLocked:function(){return this.locked},_requestComplete:function(xhr,statusText,data,successful,errorThrown){if(statusText==="abort"){this.locked=false;return }var $content,smartAjaxResult,ajaxOptions=this.getAjaxOptions();if(JIRA.SmartAjax.SmartAjaxResult){smartAjaxResult=JIRA.SmartAjax.SmartAjaxResult.apply(window,arguments)}if(successful){if(AJS.$.isFunction(ajaxOptions.formatSuccess)){$content=ajaxOptions.formatSuccess(data)}else{$content=AJS.$("<div>"+data+"</div>")}}else{if(AJS.$.isFunction(ajaxOptions.formatError)){$content=ajaxOptions.formatError(data)}else{if(smartAjaxResult){var errorClass=smartAjaxResult.status===401?"warning":"error";$content=AJS.$('<div class="aui-message '+errorClass+'"><span class="aui-icon icon-'+errorClass+'"></span>'+JIRA.SmartAjax.buildSimpleErrorContent(smartAjaxResult)+"</div>")}}this.failedRequest()}this.content($content);this.finishedRequest()},_makeRequest:function(){var instance=this,ajaxOptions=this.getAjaxOptions();if(this.outstandingRequest){this.outstandingRequest.abort();this.outstandingRequest=null}clearTimeout(this._queuedRequest);if(this.isLocked()){this._queuedRequest=setTimeout(function(){instance._makeRequest()},this.ajaxOptions.requestDelay)}else{doRequest()}function doRequest(){instance.startingRequest();instance.outstandingRequest=AJS.$.ajax(instance.getAjaxOptions())}}});