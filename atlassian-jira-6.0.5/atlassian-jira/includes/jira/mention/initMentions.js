AJS.$(function() {

    var mentionsCtr = JIRA.Mention;
    var mentionsController;

    function initMentions() {
        if (!mentionsController) {
            mentionsController = new mentionsCtr();
        }
        mentionsController.textarea(this);
    }

    AJS.$(document).delegate(".mentionable", "focus", initMentions);
    AJS.$(".mentionable").each(initMentions);
});
