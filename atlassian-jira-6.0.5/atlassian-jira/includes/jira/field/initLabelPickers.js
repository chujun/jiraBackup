(function() {
    function createPicker($fieldset, context) {

        var opts = JIRA.parseOptionsFromFieldset($fieldset),
            $select = AJS.$('#' + opts.id, context),
            issueId = opts.issueId,
            data = {};

        if (/customfield_\d/.test(opts.id)) {
            data.customFieldId = parseInt(opts.id.replace('customfield_', ''), 10);
        }

        new JIRA.LabelPicker({
            element: $select,
            ajaxOptions: {
                url: contextPath + '/rest/api/1.0/labels' + (issueId ? '/' + issueId : '') + '/suggest',
                data: data
            }
        });
    }

    function locateFieldset(parent) {
        var $parent = AJS.$(parent),
            $fieldset;

        if ($parent.is(FIELDSET_SELECTOR)) {
            $fieldset = $parent;
        } else {
            $fieldset = $parent.find(FIELDSET_SELECTOR);
        }

        return $fieldset;
    }

    var FIELDSET_SELECTOR = "fieldset.labelpicker-params";

    function findLabelsFieldsetAndConvertToPicker(context, selector) {
        selector = selector || ".aui-field-labelpicker";

        AJS.$(selector, context).each(function () {
            var $fieldset = locateFieldset(this);

            if ($fieldset.length > 0) {
                createPicker($fieldset, context);
            }
        });
    }

    JIRA.bind(JIRA.Events.NEW_CONTENT_ADDED, function (e, context, reason) {
        if (reason !== JIRA.CONTENT_ADDED_REASON.panelRefreshed) {
            findLabelsFieldsetAndConvertToPicker(context);
        }
    });

})();
