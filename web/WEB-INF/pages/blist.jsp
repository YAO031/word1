<%--
  Created by IntelliJ IDEA.
  User: 曜
  Date: 2021/9/18
  Time: 17:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<script src="//cdn.bootcss.com/vue/2.5.2/vue.min.js"></script>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<link rel="stylesheet" href="//unpkg.com/layui@2.6.8/dist/css/layui.css">

<!-- 引入 layui.js -->
<script src="//unpkg.com/layui@2.6.8/dist/layui.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div id="app">

    <table border="1">
        <tr  v-for="(item,index) in lists " >

            <td>{{item.bid}}  </td>
            <td  > {{item.btype}} </td>
            <td  > {{item.bmark}} </td>

        </tr>

        <%--<tr v-for="n in lists.length/2">--%>
            <%--<td>{{lists[2*n}.bid}</td>--%>
            <%--<td>{{lists[2*n}.btype}</td>--%>
            <%--<td>{{lists[2*n}.bmark}</td>--%>

        <%--</tr>--%>
    </table>

    <table id="demo" lay-filter="test"></table>



</div>

<script>

    var vm=new Vue({
        el:'#app',
        data:{
            lists:[]

        },
        created:function () {
            axios.get("/delectBypage").then((response)=>{


            console.log(response.data.data)

                this.lists=response.data.data.list;
            console.log(this.lists)



        })
        }




    })


</script>
<script>
    layui.use('table', function(){
        var table = layui.table;

        //第一个实例
        table.render({
            elem: '#demo'
            ,height: 312
            ,url: '/delectBypage' //数据接口
            ,page: true //开启分页
            ,cols: [[ //表头
                {field: 'bid', title: 'ID', width:80, sort: true, fixed: 'left'}
                ,{btype: 'username', title: '类别', width:80}
                ,{bmark: 'sex', title: '内容', width:80, sort: true}

            ]]
        });

    });
</script>



</body>
</html>
