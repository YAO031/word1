<%--
  Created by IntelliJ IDEA.
  User: 曜
  Date: 2021/9/15
  Time: 19:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<script src="//cdn.bootcss.com/vue/2.5.2/vue.min.js"></script>
<html>
<head>
    <title>2021年9月15日19:52:32</title>
</head>
<body>

   <ul id="aa">


       <li>1</li>
       <li>2</li>
       <li>3</li>
       <li>4</li>
       <li>5</li>
   </ul>



<script>

    var li=new Array();

    li.push(3);
    li.push(3);
    li.push(3);
    li.push(3);
    $("#aa").empty();
    $.each(li,function (index,dd) {
        console.log(index)
        $("#aa").append($(" <li>"+dd+"</li>"))
    })



</script>
</body>
</html>
