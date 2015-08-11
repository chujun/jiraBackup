JIRA.bind("QuickCreateIssue.sessionComplete", function (e, issues) {
    var html;
    if (issues && issues.length === 1) {
        html = JIRA.Issue.issueCreatedMessage(issues[0]);
        JIRA.Messages.showSuccessMsg(html, {
            closeable: true
        });
    } else {
        html = JIRA.Issue.issueCreatedMessage(issues[issues.length-1]);
        JIRA.Messages.showSuccessMsg(html, {
            closeable: true
        });
    }
});