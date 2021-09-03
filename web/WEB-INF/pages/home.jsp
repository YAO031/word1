<%--
  Created by IntelliJ IDEA.
  User: 曜
  Date: 2021/9/3
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>后台界面</title>
</head>
<body>

            <h1>欢迎  管理员  ${sessionScope.adminInfo.adminName} 登陆 </h1>
            <h1>欢迎  管理员  ${requestScope.adminName} 登陆 </h1>
            <h1>  密码  ${requestScope.adminPwd} 登陆 </h1>






</body>
</html>
