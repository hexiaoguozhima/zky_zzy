(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/shop-address/shop-address"],{"256c":function(e,t,n){"use strict";var a=n("4d30"),r=n.n(a);r.a},3989:function(e,t,n){"use strict";n.d(t,"b",(function(){return a})),n.d(t,"c",(function(){return r})),n.d(t,"a",(function(){}));var a=function(){var e=this.$createElement;this._self._c},r=[]},"4d30":function(e,t,n){},"70c4":function(e,t,n){"use strict";(function(e){var a=n("4ea4");Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0;var r=a(n("2eee")),s=a(n("c973")),u={data:function(){return{source:0,list:[],user:{}}},onLoad:function(t){var n=this;return(0,s.default)(r.default.mark((function t(){var a,s;return r.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return a=e.getStorageSync("nowTable"),t.next=3,n.$api.session(a);case 3:return s=t.sent,n.user=s.data,t.next=7,n.$api.list("address",{userid:n.user.id});case 7:s=t.sent,n.list=s.data.list;case 9:case"end":return t.stop()}}),t)})))()},onShow:function(){var t=this;return(0,s.default)(r.default.mark((function n(){var a,s;return r.default.wrap((function(n){while(1)switch(n.prev=n.next){case 0:return a=e.getStorageSync("nowTable"),n.next=3,t.$api.session(a);case 3:return s=n.sent,t.user=s.data,n.next=7,t.$api.list("address",{userid:t.user.id});case 7:s=n.sent,t.list=s.data.list;case 9:case"end":return n.stop()}}),n)})))()},methods:{onSelectTap:function(t){e.setStorageSync("address",t),e.navigateBack({delta:1})},onAddressDtailTap:function(e){var t="";t=e?"../shop-address-detail/shop-address-detail?id="+e:"../shop-address-detail/shop-address-detail?id=",this.$utils.jump(t)},onDeleteTap:function(t){var n=this;return(0,s.default)(r.default.mark((function a(){var u;return r.default.wrap((function(a){while(1)switch(a.prev=a.next){case 0:u=n,e.showModal({title:"提示",content:"是否确认删除",success:function(){var e=(0,s.default)(r.default.mark((function e(n){var a;return r.default.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(!n.confirm){e.next=9;break}return e.next=3,u.$api.del("address",JSON.stringify([t]));case 3:return a=e.sent,e.next=6,u.$api.list("address",{userid:this.user.id});case 6:a=e.sent,u.list=a.data.list,u.$utils.msg("删除成功");case 9:case"end":return e.stop()}}),e,this)})));return function(t){return e.apply(this,arguments)}}()});case 2:case"end":return a.stop()}}),a)})))()}}};t.default=u}).call(this,n("543d")["default"])},8613:function(e,t,n){"use strict";n.r(t);var a=n("70c4"),r=n.n(a);for(var s in a)["default"].indexOf(s)<0&&function(e){n.d(t,e,(function(){return a[e]}))}(s);t["default"]=r.a},cde7:function(e,t,n){"use strict";n.r(t);var a=n("3989"),r=n("8613");for(var s in r)["default"].indexOf(s)<0&&function(e){n.d(t,e,(function(){return r[e]}))}(s);n("256c");var u=n("f0c5"),i=Object(u["a"])(r["default"],a["b"],a["c"],!1,null,null,null,!1,a["a"],void 0);t["default"]=i.exports},df21:function(e,t,n){"use strict";(function(e,t){var a=n("4ea4");n("8037");a(n("66fd"));var r=a(n("cde7"));e.__webpack_require_UNI_MP_PLUGIN__=n,t(r.default)}).call(this,n("bc2e")["default"],n("543d")["createPage"])}},[["df21","common/runtime","common/vendor"]]]);