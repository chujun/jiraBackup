AJS.Group=AJS.Control.extend({init:function(){this.items=[];this.index=-1;this._assignEvents("instance",this)},addItem:function(item){this.items.push(item);this._assignEvents("item",item)},_removeItem:function(item){var index=AJS.$.inArray(item,this.items);if(index<0){throw new Error("AJS.Group: item ["+item+"] is not a member of this group")}item.trigger("blur");if(index<this.index){this.index--}this.items.splice(index,1);this._unassignEvents("item",item)},removeItem:function(item){item.trigger("remove")},removeAllItems:function(){while(this.items.length){this.items[0].trigger("remove")}},shiftFocus:function(offset){if(this.index===-1&&offset===1){offset=0}if(this.items.length>0){var i=(Math.max(0,this.index)+this.items.length+offset)%this.items.length;this.items[i].trigger("focus")}},prepareForInput:function(){this._assignEvents("keys",document)},_events:{"instance":{"focus":function(){if(this.items.length===0){return }if(this.index<0){this.items[0].trigger("focus")}else{this._assignEvents("keys",document)}},"blur":function(){if(this.index>=0){this.items[this.index].trigger("blur")}else{this._unassignEvents("keys",document)}}},"keys":{"aui:keydown":function(event){this._handleKeyEvent(event)}},"item":{"focus":function(event){var index=this.index;this.index=AJS.$.inArray(event.target,this.items);if(index<0){this.trigger("focus")}else{if(index!==this.index){this.items[index].trigger("blur")}}},"blur":function(event){if(this.index===AJS.$.inArray(event.target,this.items)){this.index=-1;this.trigger("blur")}},"remove":function(event){this._removeItem(event.target)}}},keys:{}});