(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/storeup/list"],{"032b":function(e,t,n){"use strict";(function(e){var r=n("4ea4");Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0;var s=r(n("2eee")),a=r(n("c973")),i={data:function(){return{btnColor:["#409eff","#67c23a","#909399","#e6a23c","#f56c6c","#356c6c","#351c6c","#f093a9","#a7c23a","#104eff","#10441f","#a21233","#503319"],queryList:[{queryName:"名称"}],queryIndex:0,list:[],lists:[],userid:"",type:1,mescroll:null,downOption:{auto:!1},upOption:{noMoreSize:5,textNoMore:"~ 没有更多了 ~"},hasNext:!0,searchForm:{},CustomBar:"0"}},computed:{baseUrl:function(){return this.$base.url}},onShow:function(){var e=this;return(0,a.default)(s.default.mark((function t(){return s.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:e.btnColor=e.btnColor.sort((function(){return.5-Math.random()})),e.hasNext=!0,e.mescroll&&e.mescroll.resetUpScroll();case 3:case"end":return t.stop()}}),t)})))()},onLoad:function(e){e.userid?this.userid=e.userid:this.userid="",e.menuJump?this.type=e.menuJump:this.type=1,this.hasNext=!0,this.mescroll&&this.mescroll.resetUpScroll()},methods:{priceChange:function(e){return Number(e).toFixed(2)},preHttp:function(e){return e&&"http"==e.substr(0,4)},queryChange:function(e){this.queryIndex=e.detail.value,this.searchForm.name=""},mescrollInit:function(e){this.mescroll=e},downCallback:function(e){this.hasNext=!0,e.resetUpScroll()},upCallback:function(e){var t=this;return(0,a.default)(s.default.mark((function n(){var r,a,i,u,c;return s.default.wrap((function(n){while(1)switch(n.prev=n.next){case 0:if(r={page:e.num,limit:e.size},t.searchForm.name&&(r["name"]="%"+t.searchForm.name+"%"),r["type"]=t.type,a={},!t.userid){n.next=10;break}return n.next=7,t.$api.page("storeup",r);case 7:a=n.sent,n.next=13;break;case 10:return n.next=12,t.$api.list("storeup",r);case 12:a=n.sent;case 13:for(1==e.num&&(t.list=[]),t.list=t.list.concat(a.data.list),i=Math.ceil(t.list.length/6),u=[],c=0;c<i;c++)u[c]=t.list.slice(6*c,6*(c+1));t.lists=u,0==a.data.list.length&&(t.hasNext=!1),e.endSuccess(e.size,t.hasNext);case 21:case"end":return n.stop()}}),n)})))()},onDetailTap:function(e){this.$utils.jump("../".concat(e.tablename,"/detail?id=").concat(e.refid))},onUpdateTap:function(t){e.setStorageSync("useridTag",this.userid),this.$utils.jump("./add-or-update?id=".concat(t))},onAddTap:function(){e.setStorageSync("useridTag",this.userid),this.$utils.jump("./add-or-update")},onDeleteTap:function(t){var n=this;e.showModal({title:"提示",content:"是否确认删除",success:function(){var e=(0,a.default)(s.default.mark((function e(r){return s.default.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(!r.confirm){e.next=5;break}return e.next=3,n.$api.del("storeup",JSON.stringify([t]));case 3:n.hasNext=!0,n.mescroll.resetUpScroll();case 5:case"end":return e.stop()}}),e)})));return function(t){return e.apply(this,arguments)}}()})},search:function(){var e=this;return(0,a.default)(s.default.mark((function t(){var n,r,a,i,u;return s.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(e.mescroll.num=1,n={page:e.mescroll.num,limit:e.mescroll.size},e.searchForm.name&&(n["name"]="%"+e.searchForm.name+"%"),n["type"]=e.type,r={},!e.userid){t.next=11;break}return t.next=8,e.$api.page("storeup",n);case 8:r=t.sent,t.next=14;break;case 11:return t.next=13,e.$api.list("storeup",n);case 13:r=t.sent;case 14:for(1==e.mescroll.num&&(e.list=[]),e.list=e.list.concat(r.data.list),a=Math.ceil(e.list.length/6),i=[],u=0;u<a;u++)i[u]=e.list.slice(6*u,6*(u+1));e.lists=i,0==r.data.list.length&&(e.hasNext=!1),e.mescroll.endSuccess(e.mescroll.size,e.hasNext);case 22:case"end":return t.stop()}}),t)})))()}}};t.default=i}).call(this,n("543d")["default"])},"2dc1":function(e,t,n){"use strict";n.r(t);var r=n("fc66"),s=n("a9f3");for(var a in s)["default"].indexOf(a)<0&&function(e){n.d(t,e,(function(){return s[e]}))}(a);n("5721");var i=n("f0c5"),u=Object(i["a"])(s["default"],r["b"],r["c"],!1,null,"2517cf36",null,!1,r["a"],void 0);t["default"]=u.exports},5721:function(e,t,n){"use strict";var r=n("a5d7"),s=n.n(r);s.a},a2f8:function(e,t,n){"use strict";(function(e,t){var r=n("4ea4");n("8037");r(n("66fd"));var s=r(n("2dc1"));e.__webpack_require_UNI_MP_PLUGIN__=n,t(s.default)}).call(this,n("bc2e")["default"],n("543d")["createPage"])},a5d7:function(e,t,n){},a9f3:function(e,t,n){"use strict";n.r(t);var r=n("032b"),s=n.n(r);for(var a in r)["default"].indexOf(a)<0&&function(e){n.d(t,e,(function(){return r[e]}))}(a);t["default"]=s.a},fc66:function(e,t,n){"use strict";n.d(t,"b",(function(){return s})),n.d(t,"c",(function(){return a})),n.d(t,"a",(function(){return r}));var r={mescrollUni:function(){return Promise.all([n.e("common/vendor"),n.e("components/mescroll-uni/mescroll-uni")]).then(n.bind(null,"98eb"))}},s=function(){var e=this.$createElement,t=(this._self._c,this.queryList.length),n=this.userid&&this.isAuth("storeup","添加"),r=!this.userid&&this.isAuthFront("storeup","添加");this.$mp.data=Object.assign({},{$root:{g0:t,m0:n,m1:r}})},a=[]}},[["a2f8","common/runtime","common/vendor"]]]);