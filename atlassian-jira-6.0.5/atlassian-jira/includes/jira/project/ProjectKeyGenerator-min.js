(function(){var IGNORED_WORDS=["THE","A","AN","AS","AND","OF","OR"];var CHARACTER_MAP={};CHARACTER_MAP[199]="C";CHARACTER_MAP[231]="c";CHARACTER_MAP[252]="u";CHARACTER_MAP[251]="u";CHARACTER_MAP[250]="u";CHARACTER_MAP[249]="u";CHARACTER_MAP[233]="e";CHARACTER_MAP[234]="e";CHARACTER_MAP[235]="e";CHARACTER_MAP[232]="e";CHARACTER_MAP[226]="a";CHARACTER_MAP[228]="a";CHARACTER_MAP[224]="a";CHARACTER_MAP[229]="a";CHARACTER_MAP[225]="a";CHARACTER_MAP[239]="i";CHARACTER_MAP[238]="i";CHARACTER_MAP[236]="i";CHARACTER_MAP[237]="i";CHARACTER_MAP[196]="A";CHARACTER_MAP[197]="A";CHARACTER_MAP[201]="E";CHARACTER_MAP[230]="ae";CHARACTER_MAP[198]="Ae";CHARACTER_MAP[244]="o";CHARACTER_MAP[246]="o";CHARACTER_MAP[242]="o";CHARACTER_MAP[243]="o";CHARACTER_MAP[220]="U";CHARACTER_MAP[255]="Y";CHARACTER_MAP[214]="O";CHARACTER_MAP[241]="n";CHARACTER_MAP[209]="N";function getTotalLength(words){return words.join("").length}function removeIgnoredWords(words){return _.reject(words,function(word){return AJS.$.inArray(word,IGNORED_WORDS)!==-1})}function createAcronym(words){var result="";AJS.$.each(words,function(i,word){result+=word.charAt(0)});return result}function getFirstSyllable(word){var pastVowel=false;var i;for(i=0;i<word.length;i++){if(isVowelOrY(word[i])){pastVowel=true}else{if(pastVowel){return word.substring(0,i+1)}}}return word}function isVowelOrY(c){return c&&c.length===1&&c.search("[AEIOUY]")!==-1}JIRA.ProjectKeyGenerator=Class.extend({init:function(options){options=jQuery.extend({},options);this.desiredKeyLength=(typeof options.desiredKeyLength=="number")?options.desiredKeyLength:4;this.maxKeyLength=(typeof options.maxKeyLength=="number")?options.maxKeyLength:0},generateKey:function(name){name=AJS.$.trim(name);if(!name){return""}var filtered=[];for(var i=0,ii=name.length;i<ii;i++){var sub=CHARACTER_MAP[name.charCodeAt(i)];filtered.push(sub?sub:name[i])}name=filtered.join("");var words=[];AJS.$.each(name.split(/\s+/),function(i,word){if(word){word=word.replace(/[^a-zA-Z]/g,"");word=word.toUpperCase();word.length&&words.push(word)}});if(this.desiredKeyLength&&getTotalLength(words)>this.desiredKeyLength){words=removeIgnoredWords(words)}var key;if(words.length==0){key=""}else{if(words.length==1){var word=words[0];if(this.desiredKeyLength&&word.length>this.desiredKeyLength){key=getFirstSyllable(word)}else{key=word}}else{key=createAcronym(words)}}if(this.maxKeyLength&&key.length>this.maxKeyLength){key=key.substr(0,this.maxKeyLength)}return key}})})();