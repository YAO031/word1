<%--
  Created by IntelliJ IDEA.
  User: 曜
  Date: 2021/8/3
  Time: 12:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
</head>
<body>

<table id="www">

    <tr>
        <td><input type="checkbox"></td>
        <td>姓名</td>
        <td>年龄</td>
        <td>班级</td>

    </tr>


</table>

<script >
    $(function () {
        //页面已加载 访问后台

        $.ajax({
            url:"/day01Servlet",
            type:"GET",
            data:"",
            dataType:"JSON",
            success:function (res) {

                console.log(res)
                $.each(res.rows,function (index,item) {



                     console.log(this)
                    console.log(this.name)



                    $('#www').append("<tr><td><input type=\'checkbox\'></td><td>"+this.name+"</td><td>"+this.age+"</td><td>"+this.class+"</td></tr>")


                })

            }






        });

    });


</script>

</body>
</html>
