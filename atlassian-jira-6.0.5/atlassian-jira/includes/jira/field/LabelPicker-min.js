JIRA.LabelPicker=AJS.MultiSelect.extend({_getDefaultOptions:function(){return AJS.$.extend(true,this._super(),{ajaxOptions:{url:contextPath+"/includes/js/ajs/layer/labeldata.js",query:true,formatResponse:this._formatResponse},removeDuplicates:true,removeOnUnSelect:true,userEnteredOptionsMsg:AJS.I18n.getText("label.new")})},isValidItem:function(itemValue){return !/\s/.test(itemValue)},_handleServerSuggestions:function(data){if(data&&data.token){if(AJS.$.trim(this.$field.val())!==data.token){return }}this._super(data)},_handleSpace:function(){if(AJS.$.trim(this.$field.val())!==""){if(this.handleFreeInput()){this.hideSuggestions()}}},keys:{"Spacebar":function(event){this._handleSpace();event.preventDefault()}},_formatResponse:function(data){var optgroup=new AJS.GroupDescriptor({label:AJS.I18n.getText("common.words.suggestions"),type:"optgroup",styleClass:"labels-suggested"});if(data&&data.suggestions){AJS.$.each(data.suggestions,function(){optgroup.addItem(new AJS.ItemDescriptor({value:this.label,label:this.label,html:this.html,highlighted:true}))})}return[optgroup]},handleFreeInput:function(){var values=AJS.$.trim(this.$field.val()).match(/\S+/g);if(values){for(var value,i=0;value=values[i];i++){this.addItem({value:value,label:value})}this.model.$element.trigger("change")}this.$field.val("")}});AJS.namespace("AJS.LabelPicker",null,JIRA.LabelPicker);