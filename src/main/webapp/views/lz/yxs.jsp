<%--
  Created by IntelliJ IDEA.
  User: z
  Date: 2018/12/25
  Time: 23:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>预销售</title>

</head>
<body>
<div class="layui-fluid">
    <div class="layui-row">
        <div class="layui-col-xs12">
            <div class="layui-card">
                <!--<div class="layui-card-header">表单-> 文档请参考：
                  <a href="http://www.layui.com/doc/element/form.html" target="_blank">
                        http://www.layui.com/doc/element/form.html
                      </a>
                </div>-->
                <div class="layui-card-body">

                    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
                        <legend>预销售</legend>
                    </fieldset>

                    <form class="layui-form" id="form1" action="##" onsubmit="return false">
                        <div class="layui-form-item" id="custinfo">
                            <label class="layui-form-label">客户编码</label>
                            <div class="layui-input-block">
                                <input type="text" name="custno" id="custnoid"  lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">客户名称</label>
                            <div class="layui-input-block">
                                <input type="text" name="custname" id="custnameid"  lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
                            </div>
                        </div>

                        <!--<div class="layui-form-item layui-form-text">
                              <label class="layui-form-label">编辑器</label>
                              <div class="layui-input-block">
                                <textarea class="layui-textarea layui-hide" name="content" lay-verify="content" id="LAY_demo_editor_hash"></textarea>
                              </div>
                            </div>-->
                        <div class="layui-form-item">
                            <div class="layui-input-block">
                                <button class="layui-btn"   onclick="sub()">立即提交</button>
                                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                            </div>
                        </div>
                    </form>



                </div>
            </div>
        </div>
    </div>
</div>


<script>
    //提交表单
    function sub(){
        console.log( $("#custno").val());
        console.log( $("#form1").serialize());
        $.ajax({
            url: 'insYxs',
            type:'post',
            dataType:'json',
            data:$("#form1").serialize(),
            success:function (res) {
                layer.msg(res.msg);
            },error:function (res) {
                layer.msg('网络错误!');
            }
        });
    }




</script>

<style scoped>

</style>

<script src="/js/layui.all.js"></script>
<script src="/js/jquery-1.8.3.min.js"></script>
</body>
</html>
