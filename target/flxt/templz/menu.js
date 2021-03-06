/** kitadmin-v2.1.0 MIT License By http://kit.zhengjinfan.cn Author Van Zheng */
;"use strict";
layui.define(["jquery", "utils", "axios"], function (e) {
    var i = layui.jquery, n = layui.utils, t = layui.lodash, a = layui.axios, r = n.localStorage, o = function () {
        this.config = {
            elem: void 0,
            onClicked: void 0,
            dynamicRender: !1,
            data: [],
            remote: {url: void 0, method: "get"},
            cached: !1,
           /* cacheKey: "KITADMINMENU",*/
            cacheKey: !1,
            isJump: !0,
            onlyOne: !0
        }, this.version = "1.0.0"
    }, l = ".kit-menu", s = ".kit-menu-item";
    o.prototype.set = function (e) {
        return i.extend(!0, this.config, e), this
    }, o.prototype.render = function () {
        var e = this, i = e.config;
        if (i.dynamicRender) if (i.data.length > 0) r.setItem(i.cacheKey, t), u.renderHTML(i.elem, i.data, function () {
            e.bind()
        }); else {
            var n = !1;
            if (i.cached) {
                var t = r.getItem(i.cacheKey);
                null !== t && void 0 !== t && (n = !0, u.renderHTML(i.elem, t, function () {
                    e.bind()
                }))
            }
            n || u.loadData(i.remote, function (n) {
                r.setItem(i.cacheKey, n), u.renderHTML(i.elem, n, function () {
                    e.bind()
                })
            })
        } else e.bind();
        return e
    }, o.prototype.bind = function () {
        var e = this.config;
        return i(l).find(s).each(function () {
            var t = i(this), a = t.children("a");
            "kit-menu" === t.parent()[0].className && t.attr("lay-one", !0);
            var r = t.find("ul.kit-menu-child").length > 0;
            r && a.addClass("child");
            var o = t.attr("lay-id");
            "" !== o && void 0 !== o || (o = n.randomCode(), t.attr("lay-id", o)), a.off("click").on("click", function (u) {
                if (layui.stope(u), r ? (t.hasClass("layui-show") ? t.removeClass("layui-show") : t.addClass("layui-show"), e.onlyOne && t.attr("lay-one") && t.siblings().removeClass("layui-show")) : (i(l).find(s).removeClass("layui-this"), t.addClass("layui-this")), n.isFunction(e.onClicked) && e.onClicked({
                    elem: t,
                    hasChild: r,
                    data: {href: a.attr("href"), layid: o}
                }), !e.isJump) return !1
            })
        }), this
    }, o.prototype.removeCache = function (e) {
        var i = this.config;
        e = e || i.cacheKey, n.localStorage.removeItem(e)
    };
    var u = {
        renderHTML: function (e, t, a) {
            var r = ['<ul class="kit-menu">'];
            if (this.recursion(r, t, 0), r.length > 0) {
                r.push("</ul>");
                var o = i(e);
                if (0 === o.length) return void n.error("Menu config error:请配置elem参数.");
                o.html(r.join("")), n.isFunction(a) && a()
            }
        }, recursion: function (e, i, n) {
            var a = this, r = [];
            t.forEach(i, function (e, i) {
                e.pid === n && r.push(e)
            }), r.length > 0 && t.forEach(r, function (i) {
                var n = i.open ? "layui-show" : "";
                e.push('<li class="kit-menu-item ' + n + '">');
                var r = t.isEmpty(i.path) ? "javascript:;" : i.path;
                i.blank ? e.push('<a href="' + r + '" target="_blank">') : e.push('<a href="' + r + '">'), e.push('<i class="layui-icon">' + i.icon + "</i> "), e.push("<span>" + i.title + "</span>"), e.push("</a>");
                var o = i.children;
                void 0 !== o && null !== o && o.length > 0 && (e.push('<ul class="kit-menu-child kit-menu-child layui-anim layui-anim-upbit">'), a.recursion(e, o, i.id), e.push("</ul>")), e.push("</li>")
            })
        }, loadData: function (e, i) {
            a(e).then(function (e) {
                if (500 === e.status) throw new Error(e.statusText);
                return e.data
            }).then(function (e) {
                i(e)
            }).catch(function (e) {
                n.error(e)
            })
        }
    };
    e("menu", new o)
});
//# sourceMappingURL=menu.js.map
