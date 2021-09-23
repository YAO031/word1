<%--
  Created by IntelliJ IDEA.
  User: 曜
  Date: 2021/9/18
  Time: 18:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<script src="//cdn.bootcss.com/vue/2.5.2/vue.min.js"></script>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div id="app">
    <h1>这是测试的新增业务</h1><br>
    <form action="" method="post"  @submit.prevent="onSubmit"  id="myForm" >
        业务类型 <select  v-model="tBusiness.btype">
        <option :value="item.typeName" v-for="(item,index) in tTypes">{{item.typeName}}</option>

    </select><br>
        排队号: <input type="text" v-model="tBusiness.bnum"><br>
        备注信息： <textarea  v-model="tBusiness.bmark"></textarea><br>
        <input type="submit" value="确认增加">



    </form>



</div>

<script>
    var vm=new Vue({

        el:'#app',
        data:{

            tTypes:[],
            tBusiness:{}
        },
        created:function () {
            axios.get("/type/selectAll").then(
                (response)=>{

                console.log(response);
                this.tTypes=response.data.data;


            })
        },
        methods:{
            onSubmit:function (e) {

                console.log(e);
                console.log(e.target);

                axios.post('/insert',{
                    bmark:this.tBusiness.bmark,
                    btype:this.tBusiness.btype,
                    bnum:this.tBusiness.bnum,



                }) .then((response)=>{


                    if(response.data.data==0){
                        alert(response.data.msg)

                    }else{
                        alert("添加失败")
                }

                })

            }

        }

    })

</script>

</body>
</html>
