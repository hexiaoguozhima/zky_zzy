(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/shop-order-confirm/shop-order-confirm"],{"066c":function(e,r,t){"use strict";var a=t("c180"),o=t.n(a);o.a},1920:function(e,r,t){"use strict";(function(e,r){var a=t("4ea4");t("8037");a(t("66fd"));var o=a(t("d11b"));e.__webpack_require_UNI_MP_PLUGIN__=t,r(o.default)}).call(this,t("bc2e")["default"],t("543d")["createPage"])},2129:function(e,r,t){"use strict";t.r(r);var a=t("70c7"),o=t.n(a);for(var n in a)["default"].indexOf(n)<0&&function(e){t.d(r,e,(function(){return a[e]}))}(n);r["default"]=o.a},"70c7":function(e,r,t){"use strict";(function(e){var a=t("4ea4");Object.defineProperty(r,"__esModule",{value:!0}),r.default=void 0;var o=a(t("2eee")),n=a(t("c973")),s={data:function(){return{user:{},orderGoods:{},address:{},total:0,type:1,seat:0,remark:""}},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(r){var t=this;return(0,n.default)(o.default.mark((function a(){var n;return o.default.wrap((function(a){while(1)switch(a.prev=a.next){case 0:if(t.type=r.type,t.seat=r.seat,t.orderGoods=e.getStorageSync("orderGoods"),1!=t.seat)for(n=0;n<t.orderGoods.length;n++)0==t.total?t.total=parseFloat(t.orderGoods[n].price)*t.orderGoods[n].buynumber:t.total=parseFloat(t.total)+parseFloat(t.orderGoods[n].price)*t.orderGoods[n].buynumber;else t.total=parseFloat(t.orderGoods[0].total),t.address=t.orderGoods[0].address;t.total=t.total.toFixed(2);case 5:case"end":return a.stop()}}),a)})))()},onShow:function(){var r=this;return(0,n.default)(o.default.mark((function t(){var a,n,s;return o.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return a=e.getStorageSync("nowTable"),t.next=3,r.$api.session(a);case 3:if(n=t.sent,r.user=n.data,1==r.seat){t.next=15;break}if(s=e.getStorageSync("address"),!s||r.user.id!=s.userid){t.next=11;break}r.address=e.getStorageSync("address"),t.next=15;break;case 11:return t.next=13,r.$api.defaultAddress(r.user.id);case 13:n=t.sent,r.address=n.data;case 15:case"end":return t.stop()}}),t)})))()},methods:{onSubmitTap:function(){var r=this;return(0,n.default)(o.default.mark((function t(){var a,s;return o.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(a=r,1==a.seat||a.address.address){t.next=4;break}return a.$utils.msg("请选择地址"),t.abrupt("return");case 4:s=e.getStorageSync("nowTable"),e.showModal({title:"提示",content:"是否确认支付",success:function(){var r=(0,n.default)(o.default.mark((function r(t){var n,d,u,i,c,l,p;return o.default.wrap((function(r){while(1)switch(r.prev=r.next){case 0:if(!t.confirm){r.next=65;break}if(n=a.type,d=!0,u="已支付",1!=n){r.next=8;break}a.user.money-a.total<0&&(a.$utils.msg("余额不足，请先充值"),d=!1,u="未支付"),r.next=13;break;case 8:if(2!=n){r.next=13;break}if(!(a.user.jf-a.total<0)){r.next=13;break}return a.$utils.msg("积分不足，兑换商品失败"),d=!1,r.abrupt("return");case 13:i=0;case 14:if(!(i<a.orderGoods.length)){r.next=51;break}if("pintuanshangpin"!=a.orderGoods[i].tablename){r.next=40;break}return r.next=18,a.$api.info("pintuanshangpin",a.orderGoods[i].goodid);case 18:if(c=r.sent,!(c.data.onelimittimes>0)){r.next=24;break}if(!(a.orderGoods[i].buynumber>c.data.onelimittimes)){r.next=24;break}return a.$utils.msg("".concat(a.orderGoods[i].goodname,"超过可购买数量")),d=!1,r.abrupt("break",51);case 24:if(!(c.data.alllimittimes<a.orderGoods[i].buynumber)){r.next=30;break}return a.$utils.msg("".concat(a.orderGoods[i].goodname,"已售罄")),d=!1,r.abrupt("break",51);case 30:if(1==a.seat){r.next=36;break}return c.data.alllimittimes=c.data.alllimittimes-a.orderGoods[i].buynumber,r.next=34,a.$api.update("pintuanshangpin",c.data);case 34:r.next=40;break;case 36:if(c.data.selected=c.data.selected+","+a.orderGoods[i].activeSeat,!d){r.next=40;break}return r.next=40,a.$api.update("pintuanshangpin",c.data);case 40:return l={orderid:a.$utils.genTradeNo(),tablename:a.orderGoods[i].tablename,userid:a.user.id,goodid:a.orderGoods[i].goodid,goodname:a.orderGoods[i].goodname,picture:a.orderGoods[i].picture,buynumber:a.orderGoods[i].buynumber,discountprice:a.orderGoods[i].price,price:a.orderGoods[i].price,total:a.orderGoods[i].price*a.orderGoods[i].buynumber,discounttotal:a.orderGoods[i].price*a.orderGoods[i].buynumber,type:n,remark:a.remark,address:a.address.address,tel:a.address.phone,consignee:a.address.name,status:u},1==a.seat&&(l["address"]=a.address,p=a.address.split(",").length,l["buynumber"]=p,l["total"]=a.orderGoods[i].price*p,l["discounttotal"]=a.orderGoods[i].price*p),r.next=44,a.$api.add("orders",l);case 44:if(!a.orderGoods[i].id){r.next=48;break}return r.next=47,a.$api.del("cart",JSON.stringify([a.orderGoods[i].id]));case 47:e.removeStorageSync("cart".concat(a.orderGoods[i].goodid).concat(a.user.id));case 48:i++,r.next=14;break;case 51:if(!d){r.next=65;break}if(1!=n){r.next=60;break}return a.$utils.msgBack("支付成功"),a.user.money=a.user.money-a.total,(a.user.jf||0==a.user.jf)&&(a.user.jf=parseFloat(a.user.jf)+parseFloat(a.total)),r.next=58,a.$api.update(s,a.user);case 58:r.next=65;break;case 60:if(2!=n){r.next=65;break}return a.$utils.msgBack("兑换成功"),a.user.jf=a.user.jf-a.total,r.next=65,a.$api.update(s,a.user);case 65:case"end":return r.stop()}}),r)})));return function(e){return r.apply(this,arguments)}}()});case 6:case"end":return t.stop()}}),t)})))()},onGroupSubmitTap:function(){var r=this;return(0,n.default)(o.default.mark((function t(){var a,s;return o.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(a=r,a.address){t.next=4;break}return a.$utils.msg("请选择地址"),t.abrupt("return");case 4:s=e.getStorageSync("nowTable"),e.showModal({title:"提示",content:"是否确认支付",success:function(){var e=(0,n.default)(o.default.mark((function e(r){var t,n,d,u,i,c,l;return o.default.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(!r.confirm){e.next=38;break}if(t=a.type,n=!0,!(a.user.money-a.total<0)){e.next=7;break}return a.$utils.msg("余额不足，请先充值"),n=!1,e.abrupt("return");case 7:d=0,u="",i=0;case 10:if(!(i<a.orderGoods.length)){e.next=32;break}if("pintuanshangpin"!=a.orderGoods[i].tablename){e.next=21;break}return e.next=14,a.$api.info("pintuanshangpin",a.orderGoods[i].goodid);case 14:if(c=e.sent,d=c.data.curpeople,c.data.curpeople=Number(c.data.curpeople)+1,c.data.curpeople>=c.data.grouppeople&&(u=a.$utils.genTradeNo(),c.data.curpeople=0),!n){e.next=21;break}return e.next=21,a.$api.update("pintuanshangpin",c.data);case 21:return l={orderid:a.$utils.genTradeNo(),tablename:a.orderGoods[i].tablename,userid:a.user.id,goodid:a.orderGoods[i].goodid,goodname:a.orderGoods[i].goodname,picture:a.orderGoods[i].picture,buynumber:a.orderGoods[i].buynumber,price:a.orderGoods[i].price,total:a.orderGoods[i].price*a.orderGoods[i].buynumber,type:t,address:a.address.address,tel:a.address.phone,consignee:a.address.name,status:"拼团中"},e.next=24,a.$api.add("orders",l);case 24:if(!u){e.next=29;break}return l.groupno=u,l.id=0,e.next=29,a.$api.update("orders",l);case 29:i++,e.next=10;break;case 32:if(!n){e.next=38;break}return u?a.$utils.msgBack("拼团成功啦"):0==d?a.$utils.msgBack("开团成功"):a.$utils.msgBack("参团成功"),a.user.money=a.user.money-a.total,(a.user.jf||0==a.user.jf)&&(a.user.jf=parseFloat(a.user.jf)+parseFloat(a.total)),e.next=38,a.$api.update(s,a.user);case 38:case"end":return e.stop()}}),e)})));return function(r){return e.apply(this,arguments)}}()});case 6:case"end":return t.stop()}}),t)})))()},onAddressTap:function(){this.$utils.jump("../shop-address/shop-address")}}};r.default=s}).call(this,t("543d")["default"])},c180:function(e,r,t){},d11b:function(e,r,t){"use strict";t.r(r);var a=t("d6c0"),o=t("2129");for(var n in o)["default"].indexOf(n)<0&&function(e){t.d(r,e,(function(){return o[e]}))}(n);t("066c");var s=t("f0c5"),d=Object(s["a"])(o["default"],a["b"],a["c"],!1,null,null,null,!1,a["a"],void 0);r["default"]=d.exports},d6c0:function(e,r,t){"use strict";t.d(r,"b",(function(){return a})),t.d(r,"c",(function(){return o})),t.d(r,"a",(function(){}));var a=function(){var e=this.$createElement;this._self._c},o=[]}},[["1920","common/runtime","common/vendor"]]]);