<%--
  Created by IntelliJ IDEA.
  User: 曜
  Date: 2021/9/3
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>

<html>
<head>
    <!-- 引入 layui.css -->
    <link rel="stylesheet" href="//unpkg.com/layui@2.6.8/dist/css/layui.css">

    <%--<!-- 引入 layui.js -->--%>
    <script src="//unpkg.com/layui@2.6.8/dist/layui.js"></script>
    <title>购物</title>
</head>
<body>

<p>我的农场</p><br>
农场主名称ID:<input type="text"> <p>金币：1000</p><br>
农场主名称：战三<br>

可购买的种子列表<br>

<table border="2px solid #ccc" id="table">
    <thead>
    <th>
        序号
    </th>

    <th>商品名称</th>

    <th>单价</th>
    <th>数量</th>

    <th>操作</th>
    </thead>
    <tbody>
    <tr>

        <td class="num">1</td>
        <td>水稻</td>
        <td>单价：
            <span class="price">100</span>
        </td>
        <td>
            <input type="text" id="quantity1" value="1">
        </td>


        <td>
            <a href="#" id="add1">购买</a>
        </td>
    </tr>
    <tr>

        <td class="num">2</td>
        <td>玉米</td>
        <td>单价：
            <span class="price">150</span>
        </td>
        <td>
            <input type="text" id="quantity2" value="1">
        </td>


        <td>
            <a href="#" id="add2">购买</a>
        </td>
    </tr>
    <tr>

        <td class="num">3</td>
        <td>马铃薯</td>
        <td>单价：
            <span class="price">200</span>
        </td>
        <td>
            <input type="text" id="quantity3" value="1">
        </td>


        <td>
            <a href="#" id="add3">购买</a>
        </td>
    </tr>


<script>

    $(function () {
        $("#add2").click(function (res) {
            // var sum=$("#add1").parent(0).chil;



           var sum= $("#quantity2").val();

           var amp={
               'name':'玉米',
               'sum':sum,

           }

           console.log(sum )
            $.ajax({

                url:"/api/ceshi",
                type:"post",
                dataType:"json",
                data:JSON.stringify(amp),
                success:function (res) {
                    console.log(res)
                },
                contentType:"application/json;charset=utf-8",

            });


        })

    })
    $(function () {
        $("#add3").click(function (res) {
            // var sum=$("#add1").parent(0).chil;



            var sum= $("#quantity3").val();

            var amp={
                'name':'马铃薯',
                'sum':sum,

            }

            console.log(sum )
            $.ajax({

                url:"/api/ceshi",
                type:"post",
                dataType:"json",
                data:JSON.stringify(amp),
                success:function (res) {
                    console.log(res)
                },
                contentType:"application/json;charset=utf-8",

            });


        })

    })



</script>


    </tbody>
</table>


</body>
</html>
