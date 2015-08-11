(function($){JIRA.MultiUserListPicker=AJS.MultiSelect.extend({init:function(options){var instance=this,restPath="/rest/api/1.0/users/picker";function formatResponse(response){var ret=[];$(response).each(function(i,suggestions){var groupDescriptor=new AJS.GroupDescriptor({weight:i,label:suggestions.footer});$(suggestions.users).each(function(){groupDescriptor.addItem(new AJS.ItemDescriptor({value:this.name,label:this.displayName,html:this.html,icon:this.avatarUrl,allowDuplicate:false,highlighted:true}))});ret.push(groupDescriptor)});return ret}$.extend(options,{itemAttrDisplayed:"label",userEnteredOptionsMsg:AJS.I18n.getText("common.form.email.label.suffix"),showDropdownButton:false,removeOnUnSelect:true,ajaxOptions:{url:contextPath+restPath,query:true,data:{showAvatar:true},formatResponse:formatResponse},suggestionsHandler:AJS.UserListSuggestHandler,itemGroup:new AJS.Group(),itemBuilder:function(descriptor){return new JIRA.MultiUserListPicker.Item({descriptor:descriptor,container:this.$selectedItemsContainer})}});this._super(options)},_createFurniture:function(disabled){this._super(disabled);if(this.options.description){this._render("description",this.options.description).insertAfter(this.$field)}},updateItemsIndent:$.noop,_renders:{selectedItemsWrapper:function(){return $('<div class="recipients"></div>')},selectedItemsContainer:function(){return $("<ol />")},description:function(description){return $("<div />").addClass("description").text(description)}}})}(AJS.$));