(function(){function createissueTypePicker(context){context.find(".issuetype-field").each(function(){var $select=jQuery(this);$select.bind("reset",function(){$select.find("option[value='']").remove()}).trigger("reset");new AJS.SingleSelect({element:this,revertOnInvalid:true})})}JIRA.bind(JIRA.Events.NEW_CONTENT_ADDED,function(e,context,reason){if(reason!==JIRA.CONTENT_ADDED_REASON.panelRefreshed){createissueTypePicker(context)}})})();