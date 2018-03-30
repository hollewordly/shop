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
                <input type="text" name="pro_name" required  lay-verify="required" placeholder="请输入商品名称" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">商品价格</label>
            <div class="layui-input-block">
                <input type="text" name="pro_price" required  lay-verify="required" placeholder="请输入商品价格" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label">商品详情</label>
            <div class="layui-input-block">
                <textarea name="pro_desc" placeholder="请输入商品详情" class="layui-textarea"></textarea>
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
                <select name="cat_id" lay-verify="">
                    <option value="">请选择商品分类</option>
                    <option value="1">电脑</option>
                    <option value="2">手机</option>
                    <option value="3">U盘</option>
                    <option value="4">内存条</option>
                </select>
            </div>\
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button  class="layui-btn" lay-filter="add" lay-submit="">立即提交</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>


    </form>
</div>
<script type="text/javascript">
    layui.extend({
        admin: '{/}../../static/js/admin'
    });
    layui.use(['form','layer','admin'], function(){
        var form = layui.form,
            admin = layui.admin,
            layer = layui.layer;
        //自定义验证规则
        form.verify({

        });

        //监听提交
        form.on('submit(add)', function(data){
            console.log(data);
            layer.alert("增加成功", {icon: 6},function () {
                // 获得frame索引
                var index = parent.layer.getFrameIndex(window.name);
                //关闭当前frame
                parent.layer.close(index);
            });
            //发异步，把数据提交给后端
            $.ajax({
                data:$("#layui-form").serialize(),
                dataType:"text",
                url:"../../add",
                type:"post",
                success:function(data){
                    if(data=="1"){
                        layer.msg('添加成功', {
                            icon: 1
                        });
                    }else {
                        layer.msg('添加失败', {
                            icon: 1
                        });
                    }
                }
            });

            return false;
        });
    });
</script>

<script>
    layui.use('laydate', function(){
        var laydate = layui.laydate;

        //执行一个laydate实例
        laydate.render({
            elem: '#prodate' //指定元素
        });
    });
</script>
</body>

</html>