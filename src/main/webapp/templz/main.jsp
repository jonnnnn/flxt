<%--
  Created by IntelliJ IDEA.
  User: z
  Date: 2019/3/17
  Time: 2:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>返利系统</title>
    <link rel="stylesheet" href="../css/layui.css" id="layui">
    <link rel="stylesheet" href="../css/theme/default.css" id="theme">
    <link rel="stylesheet" href="../css/kitadmin.css" id="kitadmin">
    <script src="../js/jquery-1.8.3.min.js"></script>
    <script>
        function menus() {
            var str = "<%=session.getAttribute("menu") %>";
            console.log(str);
            var arr = str.split(",");
            console.log(arr);
            for(var n = 0;n <= arr.length;n++){
                if(arr[n]==1){
                    $("#ylrz").show();
                }
                if(arr[n]==2){
                    $("#ylrcx").show();
                }
                if(arr[n]==3){
                    $("#ylrsh").show();
                }
                if(arr[n]==4){
                    $("#lrqr").show();
                }
                if(arr[n]==5){
                    $("#lrqrcx").show();
                }
                /*if(arr[n]==6){
                    $("#ksjczl").show();
                }
                if(arr[n]==7){
                    $("#spjczl").show();
                }*/
                if(arr[n]==8){
                    $("#sslr").show();
                }
                if(arr[n]==9){
                    $("#sssh").show();
                }
            }
        }

        function loginout() {
            layer.confirm("确认注销？",function () {
                location.href="loginout";
            });
        }
    </script>
</head>

<body class="layui-layout-body kit-theme-default" onload="menus()">
<div class="layui-layout layui-layout-admin">
    <!-- header -->
    <div class="layui-header">
        <div class="layui-logo">
            <div class="layui-logo-toggle" kit-toggle="side" data-toggle="on">
                <i class="layui-icon">&#xe65a;</i>
            </div>
            <div class="layui-logo-brand">
                <a href="javascript:void(0)">九州通</a>
            </div>
        </div>

        <div class="layui-layout-right">
            <ul class="kit-nav" lay-filter="header_right">
                <li class="kit-item" >
                    <a href="javascript:void(0)">
                        <span>登陆人：<%=session.getAttribute("username") %></span>
                    </a>
                </li>
                <li class="kit-item" onclick="loginout()">
                    <a href="javascript:void(0)">
                        <i class="layui-icon">&#x1006;</i>
                        <span>注销</span>
                    </a>
                </li>
                <li class="kit-nav-line"></li>

            </ul>
        </div>
    </div>
    <!-- silds -->
    <div class="layui-side" kit-side="true">
        <div class="layui-side-scroll">
            <div id="menu-box">
                <ul class="kit-menu">
                    <%--<li class="kit-menu-item">
                        <a href="#/">
                            <i class="layui-icon"></i>
                            <span>首页</span>
                        </a>
                    </li>--%>

                    <li class="kit-menu-item" id="ylr">
                        <a href="#/lz/ylr" >
                            <i class="layui-icon">&#xe62e;</i>
                            <span>首页</span>
                        </a>
                    </li>
                    <li class="kit-menu-item" id="ylrz" hidden>
                        <a href="#/lz/ylrz" >
                            <i class="layui-icon">&#xe62e;</i>
                            <span>预录入</span>
                        </a>
                    </li>

                    <li class="kit-menu-item" id="ylrcx" hidden>
                        <a href="#/lz/ylrquery">
                            <i class="layui-icon">&#xe62e;</i>
                            <span>预录入查询</span>
                        </a>
                    </li>
                        <li class="kit-menu-item" id="ylrsh" hidden>
                            <a href="#/lz/ylrsh">
                                <i class="layui-icon">&#xe62e;</i>
                                <span>预录入审核</span>
                            </a>
                        </li>
                    <li class="kit-menu-item" id="lrqr" hidden>
                        <a href="#/lz/qrlr">
                            <i class="layui-icon">&#xe62e;</i>
                            <span>录入确认</span>
                        </a>
                    </li>
                    <li class="kit-menu-item" id="lrqrcx" hidden>
                        <a href="#/lz/qrlrquery">
                            <i class="layui-icon">&#xe62e;</i>
                            <span>录入确认查询</span>
                        </a>
                    </li>
                    <li class="kit-menu-item" id="ksjczl" hidden>
                        <a href="#/lz/custmain">
                            <i class="layui-icon">&#xe62e;</i>
                            <span>客户基础资料</span>
                        </a>
                    </li>
                    <li class="kit-menu-item" id="spjczl" hidden>
                        <a href="#/lz/prodmain" >
                            <i class="layui-icon">&#xe62e;</i>
                            <span>商品基础资料</span>
                        </a>
                    </li>
                        <li class="kit-menu-item" id="sslr" hidden>
                            <a href="#/lz/sslr">
                                <i class="layui-icon">&#xe62e;</i>
                                <span>实收录入</span>
                            </a>
                        </li>

                        <li class="kit-menu-item" id="sssh" hidden>
                            <a href="#/lz/sssh">
                                <i class="layui-icon">&#xe62e;</i>
                                <span>实收审核</span>
                            </a>
                        </li>
                </ul>
            </div>
        </div>
    </div>
    <!-- main -->
    <div class="layui-body" kit-body="true">
        <router-view>/</router-view>
    </div>
    <!-- footer -->
    <div class="layui-footer" kit-footer="true">
        山西九州通医药有限公司
        <div style="width:400px; height:400px;" class="load-container load1">
            <div class="loader">Loading...</div>
        </div>
    </div>
</div>


<script src="../lay/kit_modules/polyfill.min.js"></script>
<script src="../lay/kit_modules/layui.js"></script>
<script src="../lay/kit_modules/kitadmin.js"></script>
<script>layui.use("admin");</script>

</body>

</html>
