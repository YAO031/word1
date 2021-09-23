<%--
  Created by IntelliJ IDEA.
  User: 曜
  Date: 2021/9/15
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<html>
<head>
    <title>模拟单页</title>
</head>
<body>

<div style="width: 800px;height: 1024px;border: red solid 1px">


    <a href="#addBusiness"name="addBusiness">添加业务</a><br>
    业务列表
</div>

<a id="addBusiness"  name="addBusiness" >
<div style="width: 800px;height: 1024px;border: green solid 1px">
<h1>新增业务</h1>
<form action="/" method="post">
    业务类型<select name="yewu"  lay-filter="yewu" id="yewu">

     <option value="1">信用卡</option>
      <option value="2">储蓄卡</option>
      <option value="3">VIP卡</option>
</select><br>
    排队号：<input type="text" name=""><br>
    备注信息：<textarea name=""  cols="30" rows="10"></textarea>
    <br>
    <input type="submit" value="确认增加">
</form>


</div>

</a>
<script>
    $(function () {
        $("#addBusiness").click(function () {
            window.location.href=window.location.href+"#addBusiness"
        })
    })


</script>
</body>
</html>
