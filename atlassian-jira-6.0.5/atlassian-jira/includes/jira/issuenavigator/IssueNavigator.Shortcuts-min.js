(function($){JIRA.IssueNavigator.Shortcuts={};var $rows,index,$nextPage,$previousPage,helpText,isLoadingNewPage=false;var issueIdToRowIndex={};$(document).ready(function(){if(JIRA.IssueNavigator.isNavigator()){var $focusedRow;var focusedClassName=/(?:^|\s)focused(?!\S)/;var preventFocus=function(){$(this).attr("tabIndex",-1)};$rows=$("#issuetable").find("tr.issuerow");$rows.each(function(i){var $row=$(this);$("a.hidden-link",this).blur(preventFocus);if(!$focusedRow&&focusedClassName.test(this.className)){$focusedRow=$row;index=i}issueIdToRowIndex[$row.attr("rel")]=i});if(!$focusedRow){$focusedRow=$rows.first().addClass("focused")}var jqlHasFocus=jQuery("#jqltext").hasClass("focused");if(!jqlHasFocus){var triggerConfig=new JIRA.setFocus.FocusConfiguration();triggerConfig.focusNow=function(){focusRow(index)};JIRA.setFocus.pushConfiguration(triggerConfig)}$(document).keypress(function(e){if(e.keyCode=="13"&&$("div.aui-blanket").length==0){var target=e.target;if(target===undefined||target.nodeName==="HTML"||target.nodeName==="BODY"||target==document){if(hasResults()&&$rows[index]){window.location=contextPath+"/browse/"+$rows.eq(index).data("issuekey")}}}});var $pager=$("div.pagination").first(),shouldFocusSearch=$("#focusSearch").attr("content")==="true";$nextPage=$pager.find("a.icon-next");$previousPage=$pager.find("a.icon-previous");if(!shouldFocusSearch){var activeElement=AJS.$(document.activeElement);if(activeElement.is(":input")){activeElement.blur()}}if(hasResults()&&!$(document.activeElement).is(":input")){setTimeout(function(){$rows.eq(index).scrollIntoView()},0)}if(hasResults()){JIRA.IssueNavigator.Shortcuts.flashIssueRow()}$(".issue-actions-trigger").click(function(){var $row=$(this).closest("tr");var issueId=$row.attr("rel");if(issueId){JIRA.IssueNavigator.Shortcuts.focusRow(issueId,0,true)}});JIRA.bind("QuickCreateSubtask.sessionComplete",function(e,issues){var lastIssue=issues[issues.length-1],msg=JIRA.Issue.issueCreatedMessage(lastIssue,true);JIRA.IssueNavigator.setIssueUpdatedMsg({issueMsg:msg});JIRA.IssueNavigator.reload()});JIRA.bind("QuickEdit.sessionComplete",function(e,issues){JIRA.IssueNavigator.setIssueUpdatedMsg();JIRA.IssueNavigator.reload()});$(document).bind("dialogContentReady",function(){if(setSelectedIssueAjax.callback){setSelectedIssueAjax.callback()}})}});var inDuration=1200;var flashLifeSpan=10000;var flashTimerId=null;var $flashedIssueRow=null;function clearFlashTimeout(){if(flashTimerId){window.clearTimeout(flashTimerId)}}function removeIssueRowFlash(outDuration){clearFlashTimeout();if($flashedIssueRow){$flashedIssueRow.addClass("issueactioneddissapearing").removeClass("issueactioned");$("td:first-child",$flashedIssueRow).removeClass("issueactioned");$flashedIssueRow.animate({backgroundColor:"#fff"},outDuration,function(){$(this).removeAttr("style");$(this).removeClass("issueactioneddissapearing")})}$flashedIssueRow=null}function flashIssueRowWithId(issueId,selectedIssueMsg,selectedIssueKey){if($flashedIssueRow){removeIssueRowFlash("fast")}$flashedIssueRow=$("#issuerow"+issueId);$flashedIssueRow.animate({backgroundColor:"#ffd"},inDuration,function(){$(this).css({backgroundColor:null});$(this).addClass("issueactioned")});clearFlashTimeout();flashTimerId=window.setTimeout(function(){removeIssueRowFlash("slow");$("#affectedIssueMsg").fadeOut(inDuration)},flashLifeSpan);if(!selectedIssueKey){selectedIssueKey=$flashedIssueRow.data("issuekey")}if(!selectedIssueMsg){selectedIssueMsg="thanks_issue_updated"}var allMsgTexts={"thanks_issue_updated":AJS.I18n.getText("navigator.results.thanks.updated"),"thanks_issue_transitioned":AJS.I18n.getText("navigator.results.thanks.transitioned"),"thanks_issue_assigned":AJS.I18n.getText("navigator.results.thanks.assigned"),"thanks_issue_commented":AJS.I18n.getText("navigator.results.thanks.commented"),"thanks_issue_worklogged":AJS.I18n.getText("navigator.results.thanks.worklogged"),"thanks_issue_voted":AJS.I18n.getText("navigator.results.thanks.voted"),"thanks_issue_watched":AJS.I18n.getText("navigator.results.thanks.watched"),"thanks_issue_moved":AJS.I18n.getText("navigator.results.thanks.moved"),"thanks_issue_linked":AJS.I18n.getText("navigator.results.thanks.linked"),"thanks_issue_cloned":AJS.I18n.getText("navigator.results.thanks.cloned"),"thanks_issue_labelled":AJS.I18n.getText("navigator.results.thanks.labelled"),"thanks_issue_deleted":AJS.I18n.getText("navigator.results.thanks.deleted"),"thanks_issue_attached":AJS.I18n.getText("navigator.results.thanks.attached")};var msgText=allMsgTexts[selectedIssueMsg]||selectedIssueMsg;if(msgText&&selectedIssueKey){msgText=AJS.format(msgText,selectedIssueKey);JIRA.Messages.showSuccessMsg(msgText,{id:"affectedIssueMsg"})}}JIRA.IssueNavigator.Shortcuts.flashIssueRow=function(issueId){var sessionstorage=JIRA.SessionStorage;var selectedIssueMsg=null;var selectedIssueKey=null;if(!issueId){if(!issueId){issueId=sessionstorage.getItem("selectedIssueId")}if(!issueId){var result=/[?&]selectedIssueId=([0-9]+)/.exec(window.location);issueId=result&&result.length==2?result[1]:null}}if(issueId){selectedIssueKey=sessionstorage.getItem("selectedIssueKey");selectedIssueMsg=sessionstorage.getItem("selectedIssueMsg");flashIssueRowWithId(issueId,selectedIssueMsg,selectedIssueKey)}sessionstorage.removeItem("selectedIssueId");sessionstorage.removeItem("selectedIssueKey");sessionstorage.removeItem("selectedIssueMsg")};JIRA.IssueNavigator.Shortcuts.selectNextIssue=function(){if(hasResults()&&!isLoadingNewPage){if(index===$rows.length-1){followLink($nextPage)}else{unselectRow(index++);selectRow(index)}}};JIRA.IssueNavigator.Shortcuts.selectPreviousIssue=function(){if(hasResults()&&!isLoadingNewPage){if(index===0){followLink($previousPage)}else{unselectRow(index--);selectRow(index)}}};JIRA.IssueNavigator.Shortcuts.viewSelectedIssue=function(){if(hasResults()&&$($rows[index]).length){try{window.location=contextPath+"/browse/"+$($rows[index]).data("issuekey")}catch(err){}}};JIRA.IssueNavigator.Shortcuts.focusRow=function(issueId,delay,supressLinkFocus){if(hasResults()){if(issueId){selectRowViaIssueId(issueId,delay,supressLinkFocus)}else{if(!supressLinkFocus){$($rows[index]).find("a:first").focus()}}}};JIRA.IssueNavigator.Shortcuts.focusSearch=function(){var $jqlTextArea=$("#jqltext");$("#jira").scrollIntoView();if($jqlTextArea.length>0){$jqlTextArea.focus()}else{var $issuenav=$("#issuenav");if($issuenav.hasClass("lhc-collapsed")){$(".toggle-lhc").click()}var $textSection=$("#navigator-filter-subheading-textsearch-group");if($textSection.hasClass("collapsed")){$("#searcher-pid").focus()}else{$("#searcher-query").focus()}}};function updateActionTemplateWithIssueId(){if(/id=\{0\}/.test(this.href)){var issueId=JIRA.IssueNavigator.getSelectedIssueId();var url=this.href;url=url.replace(/(id=\{0\})/g,"id="+issueId);url+="?selectedIssueId="+issueId;this.href=url}}function hasResults(){return $rows&&$rows.length>0}function followLink($a){var href=$a.attr("href");if(href){isLoadingNewPage=true;AJS.nextPage("blurSearch",true);window.location=href;setTimeout(function(){isLoadingNewPage=false},5000)}}function unselectRow(i){var $td=$($rows[i]).find("td:first");$($rows[i]).removeClass("focused");helpText=$td.attr("title");$td.removeAttr("title")}function selectRow(i,delay,supressLinkFocus){var $selected=$($rows[i]).addClass("focused").scrollIntoView();$selected.find("td").first().attr("title",helpText);if(!supressLinkFocus){focusRow(i)}setSelectedIssueAjax(delay||250)}function selectRowViaIssueId(issueId,delay,supressLinkFocus){var newIndex=issueIdToRowIndex[issueId];if(newIndex||newIndex===0){unselectRow(index);selectRow(index=newIndex,delay,supressLinkFocus)}}function focusRow(i){var $selected=$($rows[i]);$selected.find(".hidden-link").removeAttr("tabIndex").focus()}function setSelectedIssueAjax(delay){delay=typeof delay==="number"?delay:1000;clearDelayedTimeout();setSelectedIssueAjax.timeout=setTimeout(setSelectedIssueAjax.callback=function(){$.get(contextPath+"/secure/SetSelectedIssue.jspa",{atl_token:atl_token(),selectedIssueId:JIRA.IssueNavigator.getSelectedIssueId(),selectedIssueIndex:JIRA.IssueNavigator.getFocsuedIssueIndex(),nextIssueId:JIRA.IssueNavigator.getNextIssueId()});clearDelayedTimeout()},delay)}setSelectedIssueAjax.callback=null;setSelectedIssueAjax.timeout=null;function clearDelayedTimeout(){clearTimeout(setSelectedIssueAjax.timeout);setSelectedIssueAjax.callback=null;setSelectedIssueAjax.timeout=null}})(AJS.$);AJS.namespace("jira.app.issuenavigator.shortcuts",null,JIRA.IssueNavigator.Shortcuts);