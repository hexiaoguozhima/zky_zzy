(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/storeup/detail"],{1768:function(t,e,n){"use strict";var r=n("c5d0"),a=n.n(r);a.a},"222f":function(t,e,n){"use strict";(function(t){var r=n("4ea4");Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0;var a=r(n("2eee")),i=r(n("c973")),u={data:function(){return{btnColor:["#409eff","#67c23a","#909399","#e6a23c","#f56c6c","#356c6c","#351c6c","#f093a9","#a7c23a","#104eff","#10441f","#a21233","#503319"],id:"",userid:"",detail:{},swiperList:[],commentList:[],mescroll:null,downOption:{auto:!1},upOption:{noMoreSize:3,textNoMore:"~ 没有更多了 ~"},hasNext:!0,user:{},count:0,timer:null}},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(t){var e=this;return(0,i.default)(a.default.mark((function n(){return a.default.wrap((function(n){while(1)switch(n.prev=n.next){case 0:e.id=t.id,t.userid&&(e.userid=t.userid),e.init();case 3:case"end":return n.stop()}}),n)})))()},onUnload:function(){this.timer&&clearInterval(this.timer)},onShow:function(e){var n=this;return(0,i.default)(a.default.mark((function e(){var r,i;return a.default.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return r=t.getStorageSync("nowTable"),e.next=3,n.$api.session(r);case 3:i=e.sent,n.user=i.data,n.btnColor=n.btnColor.sort((function(){return.5-Math.random()}));case 6:case"end":return e.stop()}}),e)})))()},destroyed:function(){},methods:{onPayTap:function(){t.setStorageSync("paytable","storeup"),t.setStorageSync("payObject",this.detail),this.$utils.jump("../pay-confirm/pay-confirm?type=1")},onDetailTap:function(e){t.setStorageSync("useridTag",this.userid),this.$utils.jump("./detail?id=".concat(e.id,"&userid=")+this.userid)},onAcrossTap:function(e,n,r,a,i){if(t.setStorageSync("crossTable","storeup"),t.setStorageSync("crossObj",this.detail),t.setStorageSync("statusColumnName",r),t.setStorageSync("statusColumnValue",i),t.setStorageSync("tips",a),""!=r&&!r.startsWith("[")){var u=t.getStorageSync("crossObj");for(var o in u)if(o==r&&u[o]==i)return void this.$utils.msg(a)}this.$utils.jump("../".concat(e,"/add-or-update?cross=true"))},init:function(){var t=this;return(0,i.default)(a.default.mark((function e(){var n;return a.default.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return t.timer&&clearInterval(t.timer),e.next=3,t.$api.info("storeup",t.id);case 3:n=e.sent,t.detail=n.data;case 5:case"end":return e.stop()}}),e)})))()},mescrollInit:function(t){this.mescroll=t},downCallback:function(t){this.hasNext=!0,t.resetUpScroll()},upCallback:function(t){var e=this;return(0,i.default)(a.default.mark((function n(){return a.default.wrap((function(n){while(1)switch(n.prev=n.next){case 0:t.endSuccess(t.size,e.hasNext);case 1:case"end":return n.stop()}}),n)})))()},download:function(e){var n=this;e=n.$base.url+e,t.downloadFile({url:e,success:function(t){200===t.statusCode&&(n.$utils.msg("下载成功"),window.open(e))}})},onCartTabTap:function(){this.$utils.tab("../shop-cart/shop-cart")},onCommentTap:function(){var t=this;return(0,i.default)(a.default.mark((function e(){return a.default.wrap((function(e){while(1)switch(e.prev=e.next){case 0:t.$utils.jump("../discussstoreup/add-or-update?refid=".concat(t.id));case 1:case"end":return e.stop()}}),e)})))()},onSHTap:function(){this.$refs.popup.open()}}};e.default=u}).call(this,n("543d")["default"])},"284d":function(t,e,n){"use strict";n.r(e);var r=n("eb05"),a=n("dea0");for(var i in a)["default"].indexOf(i)<0&&function(t){n.d(e,t,(function(){return a[t]}))}(i);n("1768");var u=n("f0c5"),o=Object(u["a"])(a["default"],r["b"],r["c"],!1,null,"23418994",null,!1,r["a"],void 0);e["default"]=o.exports},"421a":function(t,e,n){"use strict";(function(t,e){var r=n("4ea4");n("8037");r(n("66fd"));var a=r(n("284d"));t.__webpack_require_UNI_MP_PLUGIN__=n,e(a.default)}).call(this,n("bc2e")["default"],n("543d")["createPage"])},c5d0:function(t,e,n){},dea0:function(t,e,n){"use strict";n.r(e);var r=n("222f"),a=n.n(r);for(var i in r)["default"].indexOf(i)<0&&function(t){n.d(e,t,(function(){return r[t]}))}(i);e["default"]=a.a},eb05:function(t,e,n){"use strict";n.d(e,"b",(function(){return a})),n.d(e,"c",(function(){return i})),n.d(e,"a",(function(){return r}));var r={mescrollUni:function(){return Promise.all([n.e("common/vendor"),n.e("components/mescroll-uni/mescroll-uni")]).then(n.bind(null,"98eb"))}},a=function(){var t=this.$createElement;this._self._c},i=[]}},[["421a","common/runtime","common/vendor"]]]);