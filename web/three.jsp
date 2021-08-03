<%--
  Created by IntelliJ IDEA.
  User: 曜
  Date: 2021/8/2
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
</head>
<body>
<select name="" id="sheng">
    <option value="1">河南省</option>
</select>
<select name="" id="shi">
    <option value="1">郑州市</option>
</select>
<select name="" id="qu">
    <%--//<option value="1">管城区</option>--%>
</select>

<script >
    $(function () {
        //页面已加载 访问后台

        $.ajax({
            url:"/ALLCityServlet",
            type:"GET",
            data:"",
            dataType:"JSON",
            success:function (res) {
                $.each(res.citylist,function (index,item) {
                console.log(index)
                    console.log(item.p)
                    //console.log($(this))
                    $('#sheng').empty();
                    $('#sheng').append("<option value="+item.p+">"+item.p+"</option>")

                    $.each(item.c,function (index,item) {


                        $('#shi').empty();
                        $('#shi').append("<option value="+item.n+">"+item.n+"</option>")

                        $.each(item.a,function (index,item) {
                            //$('#qu').empty();
                            $('#qu').append("<option value="+item.s+">"+item.s+"</option>")



                        })

                    })


                })

            }






        });

    });


</script>

<%--<script>--%>

    <%--$(function () {--%>


        <%--$.ajax({--%>
            <%--url:--%>


        <%--})--%>
    <%--})--%>



<%--</script>--%>
</body>
</html>
