<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/20
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>添加管理员-后台管理系统-Admin 1.0</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/font.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/weadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/layui/layui.js" charset="utf-8"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<div class="weadmin-body">
    <form class="layui-form" id="layui-form">
        <div class="layui-form-item">
            <label class="layui-form-label">商品名称</label>
            <div class="layui-input-block">
                <input type="text" id = "pro_name" name="pro_name" required  lay-verify="required" placeholder="请输入商品名称" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">商品价格</label>
            <div class="layui-input-block">
                <input type="text" id = "pro_price" name="pro_price" required  lay-verify="required" placeholder="请输入商品价格" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label">商品详情</label>
            <div class="layui-input-block">
                <textarea id = "pro_desc" name="pro_desc" placeholder="请输入商品详情" class="layui-textarea"></textarea>
            </div>
        </div>
        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label">商品日期</label>
            <div class="layui-inline">
                <input type="date" class="layui-input" id="pro_date" name="pro_date">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">单选框</label>
            <div class="layui-input-block">
                <input type="radio" name="pro_status" value="1" title="上架" checked>
                <input type="radio" name="pro_status" value="2" title="下架" >
            </div>
        </div>
        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label">商品分类</label>
            <div class="layui-input-block">
                <select name="cat_id" lay-verify="" id="category">
                    <option value="">请选择商品分类</option>
                </select>
                <input type="text" hidden id="cat_name">
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button  class="layui-btn" lay-filter="edit" lay-submit="">立即提交</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>
    <input type="hidden" name="pro_id" id="pro_id">

    </form>
</div>
</body>
    <script type="text/javascript">
        layui.extend({
            admin: '{/}../../static/js/admin'
        });
    //设定全局变量,function中要使用该变量
    var form;
    var $;
    layui.use(['form', 'jquery', 'layer', 'admin'], function () {
        form = layui.form;
        $ = layui.jquery;
        var admin = layui.admin,
            layer = layui.layer;
        //下拉选项的回显
        loadCategory();
      /*  loadBrand();*/


        //监听提交
        form.on('submit(edit)',function(data){
            console.log(data);
            //发异步，把数据提交给后端
            $.ajax({
                data:$("#layui-form").serialize(),
                dataType:"text",
                url:"../../edit",
                type:"post",
                success:function(data){
                    if(data=="0"){
                        layer.alert("编辑失败", {icon: 6},function () {
                            // 获得frame索引
                            var index = parent.layer.getFrameIndex(window.name);
                            //关闭当前frame
                            parent.layer.close(index);
                            form.render(); //更新全部
                        });

                    }else {
                        layer.alert("编辑成功", {icon: 6},function () {
                            // 获得frame索引
                            var index = parent.layer.getFrameIndex(window.name);
                            //关闭当前frame
                            parent.layer.close(index);
                            form.render(); //更新全部
                        });
                    }
                }

            });

            return false;
        });

    });

    //下拉选项的回显
    function loadCategory() {
        //去后台查询所有的分类信息
        $.ajax({
            data: {'value': 12},
            dataType: "json",
            type: "GET",
            url: "${pageContext.request.contextPath}/category/categorySelect",
            success: function (data) {
                //console.msg(data);
                var category = document.getElementById("category");
                for (var i = 0; i < data.length; i++) {
                    //将后台返回的json格式的分类信息,逐个添加到select中option
                    var option = document.createElement("option");
                    option.setAttribute("value", data[i].cat_id);
                    option.innerText = data[i].cat_name;
                    category.appendChild(option);
                    form.render('select');
                    //判断当前的cat_name(写了个隐藏的input标签)
                    if (data[i].cat_name == $("#cat_name").val()) {
                        //将该option改为selected状态
                        document.getElementById("category")[data[i].cat_id].selected = true;
                    }
                }
            }
        });
    }
</script>

</html>
