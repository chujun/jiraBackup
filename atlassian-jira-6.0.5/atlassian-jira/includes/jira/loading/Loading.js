(function($) {
    JIRA.Loading = {
        showLoadingIndicator: function () {
            var heightOfSprite = 440, currentOffsetOfSprite = 0;

            clearInterval(this.loadingTimer);

            _get$loadingIndicator().show();

            this.loadingTimer = window.setInterval(function () {
                if (currentOffsetOfSprite === heightOfSprite) {
                    currentOffsetOfSprite = 0;
                }
                currentOffsetOfSprite = currentOffsetOfSprite + 40;
                _get$loadingIndicator().css("backgroundPosition", "0 -" + currentOffsetOfSprite + "px");
            }, 50);
        },

        hideLoadingIndicator: function () {
            clearInterval(this.loadingTimer);
            _get$loadingIndicator().hide();
        }
    };

    function _get$loadingIndicator() {
        if (!JIRA.Loading.$loadingIndicator) {
            JIRA.Loading.$loadingIndicator = $("<div />").addClass("jira-page-loading-indicator").css("zIndex", 9999).appendTo("body");
        }
        return JIRA.Loading.$loadingIndicator;
    }

})(AJS.$);

