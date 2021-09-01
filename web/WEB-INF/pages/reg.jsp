<%--
  Created by IntelliJ IDEA.
  User: 曜
  Date: 2021/8/31
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>

    <%--<link rel="stylesheet" type="text/css" href="res/layui-v2.5.6/layui/css/layui.css">--%>
    <%--<script src="res/layui-v2.5.6/layui/layui.js"></script>--%>

    <!-- 引入 layui.css -->
    <link rel="stylesheet" href="//unpkg.com/layui@2.6.8/dist/css/layui.css">

    <%--<!-- 引入 layui.js -->--%>
    <script src="//unpkg.com/layui@2.6.8/dist/layui.js"></script>
</head>
<body>
      <button class="layui-btn layui-btn-danger">测试静态资源是否访问</button>


      <div>

          <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
              <legend>注册</legend>
          </fieldset>
          <form class="layui-form" action="" onsubmit="return false" >

              <div class="layui-form-item">
                  <div class="layui-inline">
                      <label class="layui-form-label">用户名</label>
                      <div class="layui-input-inline">
                          <input type="text" name="adminName"  class="layui-input">
                      </div>
                  </div>
              </div>

              <div class="layui-form-item">
                  <div class="layui-inline">
                      <label class="layui-form-label">密码</label>
                      <div class="layui-input-inline">
                          <input type="password" name="adminPwd"  class="layui-input">
                      </div>
                  </div>
              </div>

              <div class="layui-form-item">
                  <div class="layui-inline">
                      <label class="layui-form-label">重复密码</label>
                      <div class="layui-input-inline">
                          <input type="password" name="adminPwdR"  class="layui-input">
                      </div>
                  </div>
              </div>

              <div class="layui-form-item">
                  <div class="layui-inline">
                      <label class="layui-form-label">入职时间</label>
                      <div class="layui-input-inline">
                          <input type="text" class="layui-input" name="adminTime" id="adminTime" placeholder="yyyy-MM-dd HH:mm:ss">
                      </div>
                  </div>
              </div>
              <div class="layui-form-item">
                  <div class="layui-input-block">
                      <button type="submit" class="layui-btn" lay-submit="" lay-filter="regBtn">立即注册</button>
                      <%--<button type="reset" class="layui-btn layui-btn-primary">重置</button>--%>
                  </div>
              </div>
          </form>

      </div>

<script>

    layui.use(  ['form','layer','jquery','laydate'], function () {
        var form = layui.form;
        var layer=layui.layer;
        var $=layui.jquery;
        var laydate=layui.laydate;
        laydate.render({
            elem: '#adminTime'
            ,type: 'datetime'
        });

        form.on('submit(regBtn)',function (data) {
            // layer.msg(JSON.stringify(data.field));

            console.log(data)

            $.ajax({
                // url:'/api/res',
                url:'/api/regBtBean',


                type:'POST',
                data:data.field,
                dataType:'JSON',
                success:function (res) {
                    console.log(res)

                    if (res.code==0){
                        window.location.href="/pages/login";


                    }else if (res.code==4401){

                        layer.msg("你输入的密码不一致\"")
                    } else{

                        layer.msg("填写完整")
                    }

                }


            })
        });
    });
</script>

</body>
</html>
