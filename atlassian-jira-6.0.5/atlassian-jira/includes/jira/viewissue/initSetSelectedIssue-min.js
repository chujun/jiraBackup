jQuery(function(){if(AJS.Meta.get("search-pos")){AJS.$.get(contextPath+"/secure/SetSelectedIssue.jspa",{atl_token:atl_token(),selectedIssueId:jQuery("#key-val").attr("rel"),nextIssueId:jQuery("#next-issue").attr("rel"),selectedIssueIndex:AJS.Meta.getNumber("search-pos")})}});