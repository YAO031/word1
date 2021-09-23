<%--
  Created by IntelliJ IDEA.
  User: 曜
  Date: 2021/9/17
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<script src="//cdn.bootcss.com/vue/2.5.2/vue.min.js"></script>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--form:post 按tab键--%>

<div id="app">

    <form action="https://www.baidu.com" method="post" @submit.prevent="onSubmit" id="myForm">
        账户名：<input type="text" name="adminname"><br>
        密码：<input type="text" name="adminpassword"><br>

        <input type="submit" value="登录">

    </form>
</div>

<script>

    var vm= new Vue({
        el:"#app",
        methods:{
            onSubmit:function (e) {

                console.log(e);
                console.log(e.target);//通过vue 的事件可以拿到 e.target得到标签的dom 元素
               var form= document.getElementById("myForm")
                //凡是时间都有个e
                console.log(form);

              var formdaya= new FormData(form);
              console.log(formdaya)
              console.log(formdaya.get('adminname'));
              var adminname=formdaya.get('adminname');
              console.log(formdaya.get('adminpassword'));
              var adminpassword=formdaya.get('adminpassword');
              axios.post('https://www.baidu.com',{
                    adminname:adminname,
                        adminpassword:adminpassword

                })

                return false;
            }


        }


    });
</script>
</body>
</html>
