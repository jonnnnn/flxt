<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta charset="utf-8">
    <title>登录</title>
    <meta name="description" content="particles.js is a lightweight JavaScript library for creating particles.">
    <meta name="author" content="Vincent Garreau"/>
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <link rel="stylesheet" media="screen" href="css/style.css">
    <link rel="stylesheet" type="text/css" href="css/reset.css"/>
    <script src="js/jquery-1.8.3.min.js"></script>
</head>
<body>

<div id="particles-js">

    <div class="login">
        <div class="login-top">
            登录
        </div>
        <div class="login-center clearfix">
            <div class="login-center-img"><img src="img/name.png"/></div>
            <div class="login-center-input">
                <input type="text" name="username" id="username" value="" placeholder="请输入您的用户名"
                       onfocus="this.placeholder=''" onblur="this.placeholder='请输入您的用户名'"/>
                <div class="login-center-input-text">用户名</div>
            </div>
        </div>
        <div class="login-center clearfix">
            <div class="login-center-img"><img src="img/password.png"/></div>
            <div class="login-center-input">
                <input type="password" name="password" id="password" value="" placeholder="请输入您的密码"
                       onfocus="this.placeholder=''" onblur="this.placeholder='请输入您的密码'"/>
                <div class="login-center-input-text">密码</div>
            </div>
        </div>
        <div class="login-button">
            登陆
        </div>
    </div>

    <div class="sk-rotating-plane"></div>
</div>

<!-- scripts -->
<script src="js/particles.min.js"></script>
<script src="js/app.js"></script>
<script type="text/javascript">

    function hasClass(elem, cls) {
        cls = cls || '';
        if (cls.replace(/\s/g, '').length == 0) return false; //当cls没有参数时，返回false
        return new RegExp(' ' + cls + ' ').test(' ' + elem.className + ' ');
    }

    function addClass(ele, cls) {
        if (!hasClass(ele, cls)) {
            ele.className = ele.className == '' ? cls : ele.className + ' ' + cls;
        }
    }

    function removeClass(ele, cls) {

        if (hasClass(ele, cls)) {
            var newClass = ' ' + ele.className.replace(/[\t\r\n]/g, '') + ' ';
            while (newClass.indexOf(' ' + cls + ' ') >= 0) {
                newClass = newClass.replace(' ' + cls + ' ', ' ');
            }
            ele.className = newClass.replace(/^\s+|\s+$/g, '');
        }
    }

    document.querySelector(".login-button").onclick = function () {
        var username = $('#username').val();
        var password = $('#password').val();
        $.ajax({
            url: 'logins',
            type: 'post',
            data: {'username': username, 'password': password},
            dataType: 'json',
            success: function (result) {
              if(result.msg=="1"){
                  location.href = "main.jsp";
              }else {
                  alert("账号或密码错误!");
              }
            },
            error: function (e) {
                alert("系统异常!");
            }
        });
        $('#password').val("");
    };


    document.onkeydown = function (e) {
        e = e ? e : event;// 兼容FF
        if (e.keyCode == 13) {
            var username = $('#username').val();
            var password = $('#password').val();
            $.ajax({
                url: 'logins',
                type: 'post',
                data: {'username': username, 'password': password},
                dataType: 'json',
                success: function (result) {
                    if(result.msg=="1"){
                        location.href = "main.jsp";
                    }else {
                        alert("账号或密码错误!");
                    }
                },
                error: function (e) {
                    alert("系统异常!");
                }
            });
            $('#password').val("");
            return false;//防止页面跳转刷新掉
        }else if(e.keyCode == 27) {
            layer.closeAll('iframe');
            return false;//防止页面跳转刷新掉
        }
    };

</script>

</body>
</html>
