(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/pintuanshangpin/add-or-update"],{"03e6":function(e,n,r){},"2cac":function(e,n,r){"use strict";(function(e,n){var t=r("4ea4");r("8037");t(r("66fd"));var i=t(r("9fc5"));e.__webpack_require_UNI_MP_PLUGIN__=r,n(i.default)}).call(this,r("bc2e")["default"],r("543d")["createPage"])},3036:function(e,n,r){"use strict";r.r(n);var t=r("dc2e"),i=r.n(t);for(var a in t)["default"].indexOf(a)<0&&function(e){r.d(n,e,(function(){return t[e]}))}(a);n["default"]=i.a},"5c47":function(e,n,r){"use strict";var t=r("03e6"),i=r.n(t);i.a},"9fc5":function(e,n,r){"use strict";r.r(n);var t=r("eef3"),i=r("3036");for(var a in i)["default"].indexOf(a)<0&&function(e){r.d(n,e,(function(){return i[e]}))}(a);r("5c47");var u=r("f0c5"),o=Object(u["a"])(i["default"],t["b"],t["c"],!1,null,"33633386",null,!1,t["a"],void 0);n["default"]=o.exports},dc2e:function(e,n,r){"use strict";(function(e){var t=r("4ea4");Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var i=t(r("2eee")),a=t(r("c973")),u={data:function(){return{cross:"",ruleForm:{shangpinbianhao:this.getUUID(),shangpinmingcheng:"",shangpinleixing:"",tupian:"",chandi:"",pinpai:"",shangpinxiangqing:"",onelimittimes:"-1",alllimittimes:"-1",price:"",groupprice:"",grouppeople:"",curpeople:""},shangpinleixingOptions:[],shangpinleixingIndex:0,user:{},ro:{shangpinbianhao:!1,shangpinmingcheng:!1,shangpinleixing:!1,tupian:!1,chandi:!1,pinpai:!1,shangpinxiangqing:!1,onelimittimes:!1,alllimittimes:!1,clicktime:!1,clicknum:!1,price:!1,groupprice:!1,grouppeople:!1,curpeople:!1}}},components:{wPicker:function(){Promise.all([r.e("common/vendor"),r.e("components/w-picker/w-picker")]).then(function(){return resolve(r("e087"))}.bind(null,r)).catch(r.oe)},xiaEditor:function(){r.e("components/xia-editor/xia-editor").then(function(){return resolve(r("8e80"))}.bind(null,r)).catch(r.oe)},multipleSelect:function(){r.e("components/momo-multipleSelect/momo-multipleSelect").then(function(){return resolve(r("5751"))}.bind(null,r)).catch(r.oe)}},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(n){var r=this;return(0,a.default)(i.default.mark((function t(){var a,u,o,c;return i.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return a=e.getStorageSync("nowTable"),t.next=3,r.$api.session(a);case 3:return u=t.sent,r.user=u.data,t.next=7,r.$api.option("shangpinleixing","shangpinleixing",{});case 7:if(u=t.sent,r.shangpinleixingOptions=u.data,r.shangpinleixingOptions.unshift("请选择商品类型"),r.ruleForm.userid=e.getStorageSync("userid"),n.refid&&(r.ruleForm.refid=n.refid,r.ruleForm.nickname=e.getStorageSync("nickname")),!n.id){t.next=18;break}return r.ruleForm.id=n.id,t.next=16,r.$api.info("pintuanshangpin",r.ruleForm.id);case 16:u=t.sent,r.ruleForm=u.data;case 18:if(r.cross=n.cross,!n.cross){t.next=86;break}o=e.getStorageSync("crossObj"),t.t0=i.default.keys(o);case 22:if((t.t1=t.t0()).done){t.next=86;break}if(c=t.t1.value,"shangpinbianhao"!=c){t.next=28;break}return r.ruleForm.shangpinbianhao=o[c],r.ro.shangpinbianhao=!0,t.abrupt("continue",22);case 28:if("shangpinmingcheng"!=c){t.next=32;break}return r.ruleForm.shangpinmingcheng=o[c],r.ro.shangpinmingcheng=!0,t.abrupt("continue",22);case 32:if("shangpinleixing"!=c){t.next=36;break}return r.ruleForm.shangpinleixing=o[c],r.ro.shangpinleixing=!0,t.abrupt("continue",22);case 36:if("tupian"!=c){t.next=40;break}return r.ruleForm.tupian=o[c].split(",")[0],r.ro.tupian=!0,t.abrupt("continue",22);case 40:if("chandi"!=c){t.next=44;break}return r.ruleForm.chandi=o[c],r.ro.chandi=!0,t.abrupt("continue",22);case 44:if("pinpai"!=c){t.next=48;break}return r.ruleForm.pinpai=o[c],r.ro.pinpai=!0,t.abrupt("continue",22);case 48:if("shangpinxiangqing"!=c){t.next=52;break}return r.ruleForm.shangpinxiangqing=o[c],r.ro.shangpinxiangqing=!0,t.abrupt("continue",22);case 52:if("onelimittimes"!=c){t.next=56;break}return r.ruleForm.onelimittimes=o[c],r.ro.onelimittimes=!0,t.abrupt("continue",22);case 56:if("alllimittimes"!=c){t.next=60;break}return r.ruleForm.alllimittimes=o[c],r.ro.alllimittimes=!0,t.abrupt("continue",22);case 60:if("clicktime"!=c){t.next=64;break}return r.ruleForm.clicktime=o[c],r.ro.clicktime=!0,t.abrupt("continue",22);case 64:if("clicknum"!=c){t.next=68;break}return r.ruleForm.clicknum=o[c],r.ro.clicknum=!0,t.abrupt("continue",22);case 68:if("price"!=c){t.next=72;break}return r.ruleForm.price=o[c],r.ro.price=!0,t.abrupt("continue",22);case 72:if("groupprice"!=c){t.next=76;break}return r.ruleForm.groupprice=o[c],r.ro.groupprice=!0,t.abrupt("continue",22);case 76:if("grouppeople"!=c){t.next=80;break}return r.ruleForm.grouppeople=o[c],r.ro.grouppeople=!0,t.abrupt("continue",22);case 80:if("curpeople"!=c){t.next=84;break}return r.ruleForm.curpeople=o[c],r.ro.curpeople=!0,t.abrupt("continue",22);case 84:t.next=22;break;case 86:r.styleChange(),r.$forceUpdate();case 88:case"end":return t.stop()}}),t)})))()},methods:{shangpinxiangqingChange:function(e){this.ruleForm.shangpinxiangqing=e},styleChange:function(){this.$nextTick((function(){}))},clicktimeConfirm:function(e){console.log(e),this.ruleForm.clicktime=e.result,this.$forceUpdate()},shangpinleixingChange:function(e){this.shangpinleixingIndex=e.target.value,this.ruleForm.shangpinleixing=this.shangpinleixingOptions[this.shangpinleixingIndex]},tupianTap:function(){var e=this;this.$api.upload((function(n){e.ruleForm.tupian="upload/"+n.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var n=this;return(0,a.default)(i.default.mark((function r(){var t,a,u,o,c,s,l,p,m,g;return i.default.wrap((function(r){while(1)switch(r.prev=r.next){case 0:if(!n.ruleForm.onelimittimes||n.$validate.isIntNumer(n.ruleForm.onelimittimes)){r.next=3;break}return n.$utils.msg("单限应输入整数"),r.abrupt("return");case 3:if(!n.ruleForm.alllimittimes||n.$validate.isIntNumer(n.ruleForm.alllimittimes)){r.next=6;break}return n.$utils.msg("库存应输入整数"),r.abrupt("return");case 6:if(!n.ruleForm.clicknum||n.$validate.isIntNumer(n.ruleForm.clicknum)){r.next=9;break}return n.$utils.msg("点击次数应输入整数"),r.abrupt("return");case 9:if(n.ruleForm.price){r.next=12;break}return n.$utils.msg("价格不能为空"),r.abrupt("return");case 12:if(!n.ruleForm.price||n.$validate.isNumber(n.ruleForm.price)){r.next=15;break}return n.$utils.msg("价格应输入数字"),r.abrupt("return");case 15:if(!n.ruleForm.groupprice||n.$validate.isNumber(n.ruleForm.groupprice)){r.next=18;break}return n.$utils.msg("团购价应输入数字"),r.abrupt("return");case 18:if(!n.ruleForm.grouppeople||n.$validate.isIntNumer(n.ruleForm.grouppeople)){r.next=21;break}return n.$utils.msg("拼团人数应输入整数"),r.abrupt("return");case 21:if(!n.ruleForm.curpeople||n.$validate.isIntNumer(n.ruleForm.curpeople)){r.next=24;break}return n.$utils.msg("当前人数应输入整数"),r.abrupt("return");case 24:if(!n.cross){r.next=40;break}if(c=e.getStorageSync("statusColumnName"),s=e.getStorageSync("statusColumnValue"),""==c){r.next=40;break}if(t||(t=e.getStorageSync("crossObj")),c.startsWith("[")){r.next=36;break}for(l in t)l==c&&(t[l]=s);return p=e.getStorageSync("crossTable"),r.next=34,n.$api.update("".concat(p),t);case 34:r.next=40;break;case 36:a=Number(e.getStorageSync("userid")),u=t["id"],o=e.getStorageSync("statusColumnName"),o=o.replace(/\[/,"").replace(/\]/,"");case 40:if(!u||!a){r.next=62;break}return n.ruleForm.crossuserid=a,n.ruleForm.crossrefid=u,m={page:1,limit:10,crossuserid:a,crossrefid:u},r.next=46,n.$api.list("pintuanshangpin",m);case 46:if(g=r.sent,!(g.data.total>=o)){r.next=52;break}return n.$utils.msg(e.getStorageSync("tips")),r.abrupt("return",!1);case 52:if(!n.ruleForm.id){r.next=57;break}return r.next=55,n.$api.update("pintuanshangpin",n.ruleForm);case 55:r.next=59;break;case 57:return r.next=59,n.$api.add("pintuanshangpin",n.ruleForm);case 59:n.$utils.msgBack("提交成功");case 60:r.next=70;break;case 62:if(!n.ruleForm.id){r.next=67;break}return r.next=65,n.$api.update("pintuanshangpin",n.ruleForm);case 65:r.next=69;break;case 67:return r.next=69,n.$api.add("pintuanshangpin",n.ruleForm);case 69:n.$utils.msgBack("提交成功");case 70:case"end":return r.stop()}}),r)})))()},optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var n=new Date,r=n.getFullYear(),t=n.getMonth()+1,i=n.getDate();return"start"===e?r-=60:"end"===e&&(r+=2),t=t>9?t:"0"+t,i=i>9?i:"0"+i,"".concat(r,"-").concat(t,"-").concat(i)},toggleTab:function(e){this.$refs[e].show()}}};n.default=u}).call(this,r("543d")["default"])},eef3:function(e,n,r){"use strict";r.d(n,"b",(function(){return i})),r.d(n,"c",(function(){return a})),r.d(n,"a",(function(){return t}));var t={xiaEditor:function(){return r.e("components/xia-editor/xia-editor").then(r.bind(null,"8e80"))},wPicker:function(){return Promise.all([r.e("common/vendor"),r.e("components/w-picker/w-picker")]).then(r.bind(null,"e087"))}},i=function(){var e=this.$createElement,n=(this._self._c,this.ruleForm.tupian?this.ruleForm.tupian.split(","):null);this.$mp.data=Object.assign({},{$root:{g0:n}})},a=[]}},[["2cac","common/runtime","common/vendor"]]]);