<%--
  Created by IntelliJ IDEA.
  User: 曜
  Date: 2021/9/18
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>


<html>
<head>
    <title>学习箭头函数</title>
</head>
<body>
x:<input type="text" id="xInput" value="5">+ y:<input type="text" id="yInput" value="10"> = <span id="sumSpan"></span>
x:<input type="text" id="mInput" value="5">+ y:<input type="text" id="nInput" value="10"> = <span id="jiantouhanshu"></span>


<script>
$(function () {
    var num1=$('#xInput').val();
    var num2=$('#yInput').val();

    console.log(sum(num1,num2));

    $('#sumSpan').text(sum(num1,num2));

    //箭头函数
    var hiantouhanshu= (num1,num2)=>  {num1*num2};
    $("#jiantouhanshu").text(hiantouhanshu)
})

  function sum(num1,num2) {


        return num1*num2;

    }

    //当箭头的形参 是一个 的是 可以省略的 括号
    function mySub(num) {
    return num;

    }

    //省略的过程
    var mySub1=numx => numx;




</script>

</body>
</html>
