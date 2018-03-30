layui.extend({
    admin: '{/}../../static/js/admin'
});

layui.use(['form','table', 'jquery', 'admin'], function () {
    var form = layui.form,
        table = layui.table,
        $ = layui.jquery,
        admin = layui.admin;

    //监听工具条
    table.on('tool(demo)', function (obj) { //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
        var data = obj.data //获得当前行数据
            , layEvent = obj.event; //获得 lay-event 对应的值
        if (layEvent === 'del') {
            layer.confirm('是否刪除？', function (index) {
                console.log(data);
                $.ajax({
                    url: '../../delete',
                    type: 'post',
                    data: {pro_id: data.pro_id},
                    dataType: 'json',
                    success: function (data) {
                                if(data==1){
                                    layer.msg("刪除成功",{
                                        icon:1
                                    })
                                }else{
                                   layer.msg("刪除失敗",{
                                       icon:1
                                   })
                        }
                    }
                });
                obj.del(); //删除对应行（tr）的DOM结构，并更新缓存
                layer.close(index);
            });
        }else if(layEvent === 'edit'){
            var title = "修改商品";
            var url = "../../pages/item/edit";
            var w = ($(window).width() * 0.9);
            var h = ($(window).height() - 50);
            layer.open({
                type: 2,
                area: [w + 'px', h + 'px'],
                fix: false, //不固定
                maxmin: true,
                shadeClose: true,
                shade: 0.4,
                title: title,
                content: url,
                success: function (layero, index) {

                    var body = layer.getChildFrame('body', index);
                    //巧妙的地方在这里哦
                    body.contents().find("#pro_name").val(data.pro_name);
                    body.contents().find("#pro_price").val(data.pro_price);
                    body.contents().find("#pro_desc").val(data.pro_desc);
                    body.contents().find("#pro_date").val(data.pro_date);
                    body.contents().find("#cat_name").val(data.cat_name);
                    body.contents().find("#pro_status").val(data.pro_statuss);
                    body.contents().find("#pro_id").val(data.pro_id);
                },
                error: function (layero, index) {
                    alert("aaa");
                }
            });



        }
    })

    table.render({
        //容器元素
        elem: '#articleList',
        //最小宽度
        cellMinWidth: 80,
        //列
        cols: [
            [{
                type: 'checkbox'
            }, {
                field: 'pro_id', title: '商品编号', width: 100, sort: true
            }, {
                field: 'cat_name', title: '商品分类'
            }, {
                field: 'pro_name', title: '商品名称'
            }, {
                field: 'pro_desc', title: '商品详情'
            }, {
                field: 'statusName', title: '商品状态'
            }, {
                field: 'operate', title: '操作', width: 160, toolbar: '#barDemo', unresize: true
            }]
        ],
        //通过URL进行数据绑定
        url: '../../items',
        //是否开启分页
        page: true,
        limits: [2, 5, 10]
    });

    var active = {
        reload: function () {

            //val() text() html()
            var title = $.trim($('#title').val());
            table.reload('articleList', {
                page: {curr: 1},
                where: {title:title}
            });
        },
        getCheckData: function () { //获取选中数据
            var checkStatus = table.checkStatus('articleList'),
                data = checkStatus.data;
            if (data.length > 0) {
                layer.confirm('确认要删除吗？', function (index) {
                    //在前台页面把选中数据删除：找到所有被选中的
                    $(".layui-table-body .layui-form-checked").parents('tr').remove();
                    //形成一个ID的数组
                    var ids = [];
                    for (var i = 0; i < data.length; i++) {
                        ids.push(data[i].pro_id);
                    }
                    //发出异步的请求去后台
                    //发出异步请求
                    $.ajax({
                        url: "../../item/batch",
                        type: "post",
                        data: {"ids[]": ids},
                        success: function (data) {
                            console.log(data);
                        }
                    });
                    //提示用户删除成功
                    layer.msg('删除成功', {
                        icon: 1
                    });
                });
            } else {
                layer.msg("请先选择需要删除的商品！");
            }

        }
    };

    $('.demoTable .layui-btn').on('click', function () {
        var type = $(this).data('type');
        active[type] ? active[type].call(this) : '';
    });
    $('.we-search .layui-btn').on('click', function () {

        var type = $(this).data('type');//reload
        active[type] ? active[type].call(this) : '';//调用active中reload方法
    });
})


