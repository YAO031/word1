<%--
  Created by IntelliJ IDEA.
  User: 曜
  Date: 2021/9/1
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        登录界面：
        欢迎张三登录（这是写死的）登录：

        <div>

            <%--<form action="/api/modelAndView" method="post">--%>
            <%--<form action="/api/model" method="post">--%>
            <%--<form action="/api/modelMap" method="post">--%>
            <form action="/api/map" method="post">
                用户名：<input type="text" name="adminName"><br>
                密码：<input type="text" name="adminPwd"><br>

                <input type="submit" value="登陆">




            </form>

        </div>


</body>
</html>
