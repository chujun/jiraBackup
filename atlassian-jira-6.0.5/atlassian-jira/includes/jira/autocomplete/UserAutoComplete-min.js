JIRA.UserAutoComplete=function(options){var that=begetObject(JIRA.RESTAutoComplete);that.getAjaxParams=function(){return{url:contextPath+"/rest/api/1.0/users/picker",data:{fieldName:options.fieldID},dataType:"json",type:"GET"}};function fieldsFormHasBeenSubmitted(field){var submitting=false,form=field.closest("form");if(form.length&&form.hasClass("submitting")){submitting=true}return submitting}that.renderSuggestions=function(response){if(fieldsFormHasBeenSubmitted(this.field)||!AJS.isSelenium()&&!AJS.elementIsFocused(this.field)){return false}var resultsContainer,suggestionNodes=[];this.clearResponseContainer();if(response&&response.users&&response.users.length>0){resultsContainer=jQuery("<ul/>").appendTo(this.responseContainer);jQuery(response.users).each(function(){suggestionNodes.push([jQuery("<li/>").html(this.html).appendTo(resultsContainer),this.name])})}if(response.footer){this.responseContainer.append(jQuery("<div/>").addClass("yui-ac-ft").html(response.footer).css("display","block"))}if(suggestionNodes.length>0){that.addSuggestionControls(suggestionNodes);AJS.$(".atlassian-autocomplete div.yad, .atlassian-autocomplete .labels li").textOverflow({autoUpdate:true})}return suggestionNodes};options.minQueryLength=2;options.queryDelay=0.25;that.init(options);return that};JIRA.UserAutoComplete.init=function(parent){AJS.$("fieldset.user-picker-params",parent).each(function(){var params=JIRA.parseOptionsFromFieldset(AJS.$(this)),field=(params.fieldId||params.fieldName),$container=AJS.$("#"+field+"_container");$container.find("a.popup-trigger").click(function(e){var url=contextPath,vWinUsers;e.preventDefault();if(!params.formName){params.formName=$container.find("#"+field).parents("form").attr("name")}if(params.actionToOpen){url=url+params.actionToOpen}else{url=url+"/secure/popups/UserPickerBrowser.jspa"}url+="?formName="+params.formName+"&";url+="multiSelect="+params.multiSelect+"&";url+="decorator=popup&";url+="element="+field;vWinUsers=window.open(url,"UserPicker","status=yes,resizable=yes,top=100,left=100,width=800,height=750,scrollbars=yes");vWinUsers.opener=self;vWinUsers.focus()});if(params.userPickerEnabled===true){JIRA.UserAutoComplete({field:parent?parent.find("#"+field):null,fieldID:field,delimChar:params.multiSelect===false?undefined:",",ajaxData:{fieldName:params.fieldName}})}})};AJS.namespace("jira.widget.autocomplete.Users",null,JIRA.UserAutoComplete);