JIRA.CreateProjectField=Class.extend({TIMEOUT_MS:100,projectNames:[],maxNameLength:80,init:function(options){this.$element=options.element;this.$nameElement=this.$element.find("input.text[name='name']");this.$keyElement=this.$element.find("input.text[name='key']");this.$keyEditedElement=this.$element.find("input[name='keyEdited']");this.$avatarElement=this.$element.find(".jira-inline-avatar-picker-trigger");this.eventBus={src:AJS.$(this),trigger:function(name,args){this.src.trigger(name,args)},bind:function(name,func){this.src.bind(name,func)}};var maxKeyLength=this.$keyElement.attr("maxlength");if(!maxKeyLength){maxKeyLength=10}this.keygen=new JIRA.ProjectKeyGenerator({desiredKeyLength:4,maxKeyLength:maxKeyLength});this.lastKeyValidated="";if(AJS.DarkFeatures.isEnabled("addproject.project.sample")){this.sample=new JIRA.ProjectSample({element:this.$element.find("#sample-project-container"),events:this.eventBus})}this.$keyElement.attr("style","text-transform: uppercase");this.initialName=this.$nameElement.val();this.initialKey=this.$keyElement.val();this.$element.find(".error").addClass("description initial-error");this.showInitialError(this.$nameElement);this.showInitialError(this.$keyElement);this.$nameElement.focus(AJS.$.proxy(this._bindNameHook,this));this.$nameElement.blur(AJS.$.proxy(this._unbindHook,this));this.$keyElement.focus(AJS.$.proxy(this._bindKeyHook,this));this.$keyElement.blur(AJS.$.proxy(this._unbindHook,this));this.$keyElement.blur(AJS.$.proxy(this.autofillKeyIfNeeded,this));var $keyHelpElement=this.$keyElement.parent().find("#add-project-key-icon").removeAttr("target data-helplink");if($keyHelpElement.length){new AJS.InlineDialog($keyHelpElement,"project-key-help-popup",function(contents,trigger,show){contents.html(JIRA.Templates.CreateProject.keyHelp());show()},{width:330,offsetX:-30})}if(this.$avatarElement.size()){this.eventBus.trigger("updated.Avatar",this.$avatarElement.attr("src"));this.$avatarElement.bind("AvatarSelected",AJS.$.proxy(function(){this.eventBus.trigger("updated.Avatar",this.$avatarElement.attr("src"))},this))}this._loadExistingProjects()},_loadExistingProjects:function(){var instance=this;AJS.$.ajax({url:contextPath+"/rest/api/latest/project",success:function(projects){for(var x in projects){instance.projectNames.push(projects[x].name.toUpperCase())}}})},_bindNameHook:function(e){this._bindHook(e,this.onNameTimeout)},_bindKeyHook:function(e){var el=AJS.$(e.target);el.data("lastValue",el.val());this._bindHook(e,this.onKeyTimeout)},_bindHook:function(e,func){var instance=this,el=AJS.$(e.target),hook;hook=function(){instance._unbindHook(e);func.apply(instance);if(el.is(":visible")){el.data("checkHook",setTimeout(hook,instance.TIMEOUT_MS))}};if(!el.data("checkHook")){el.data("checkHook",setTimeout(hook,0))}},_unbindHook:function(e){var el=AJS.$(e.target);clearTimeout(el.data("checkHook"));el.removeData("checkHook")},shouldUpdateKey:function(){return(this.$keyEditedElement.val()!="true")},setKeyEdited:function(key){if(this.$keyElement.data("lastValue")!==key){this.$keyEditedElement.val((key)?"true":"false")}this.$keyElement.data("lastValue",key)},updateKey:function(key){this.$keyElement.val(key);this.validateKey(key);this.eventBus.trigger("updated.Key",key)},autofillKeyIfNeeded:function(){if(this.shouldUpdateKey()){var key=this.keygen.generateKey(this.$nameElement.val());if(key.length>1){this.updateKey(key)}else{this.$keyElement.val("")}}},onNameTimeout:function(){var name=this.$nameElement.val();this.validateName(name);this.eventBus.trigger("updated.Name",name);this.autofillKeyIfNeeded()},onKeyTimeout:function(){var key=this.$keyElement.val();this.setKeyEdited(key);this.validateKey(key);this.eventBus.trigger("updated.Key",key)},validateName:function(name){if(name==this.initialName&&this.$nameElement.parent().find(".error").size()){return }else{if(name.length>this.maxNameLength){this.showInlineError(this.$nameElement,this.initialName,AJS.I18n.getText("admin.errors.project.name.too.long",this.maxNameLength));return }var x;for(x in this.projectNames){if(name.toUpperCase()==this.projectNames[x]){this.showInlineError(this.$nameElement,this.initialName,AJS.I18n.getText("admin.errors.project.with.that.name.already.exists"));return }}}this.hideInlineError(this.$nameElement)},validateKey:function(key){var instance=this;var changed=(instance.lastKeyValidated!==key);this.lastKeyValidated=key;if(!changed){return }if(key){AJS.$.ajax({url:contextPath+"/rest/api/latest/projectvalidate/key?key="+key.toUpperCase(),success:function(errors){if(errors.errors&&errors.errors["projectKey"]){instance.showInlineError(instance.$keyElement,instance.initialKey,errors.errors["projectKey"])}else{instance.hideInlineError(instance.$keyElement)}}})}else{instance.hideInlineError(instance.$keyElement)}},showInlineError:function($element,initialVal,msg){var $initialErrorElement=$element.parent().find(".initial-error");if($element.val()===initialVal&&$initialErrorElement.length){this.showInitialError($element)}else{var $errorElement=$element.parent().find(".error.description");if(!$errorElement.length){$errorElement=AJS.$("<div class='error description'></div>");$element.parent().append($errorElement)}$errorElement.text(msg);$element.parent().find(".description").hide();$initialErrorElement.hide();$errorElement.show()}},hideInlineError:function($element){$element.parent().find(".description").show();$element.parent().find(".error.description").hide()},showInitialError:function($element){var $initialErrorElement=$element.parent().find(".initial-error");if($initialErrorElement.length){$element.parent().find(".description").hide();$element.parent().find(".error.description").hide();$initialErrorElement.show()}}});JIRA.bind(JIRA.Events.NEW_CONTENT_ADDED,function(e,context,reason){if(reason!==JIRA.CONTENT_ADDED_REASON.panelRefreshed){context.find("#add-project-fields").each(function(){new JIRA.CreateProjectField({element:AJS.$(this)})})}});