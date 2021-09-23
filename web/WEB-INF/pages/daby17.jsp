<%--
  Created by IntelliJ IDEA.
  User: 曜
  Date: 2021/9/17
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<script src="//cdn.bootcss.com/vue/2.5.2/vue.min.js"></script>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div id="app">
    请添加水果名称 <input  id="aa" type="text" v-model:value="name" v-on:click="names" > 字符长度是：{{name.length}}<br>
    修改前水果的值为：芒果，修改后值为: {{name}}<br>
    请添加水果价格<input type="text" v-model:value="namevalue" >分<br>
    请添加水果的个数<input type="text" v-model:value="shulaing" >个 <input type="text" value="-" width="10" v-on:click="shulaings"><input type="text" v-model:value="shulaing"><input type="text" value="+" width="10" v-on:click="shulainga"><br>
    自动算水果的价格{{namevalue / 100 * shulaing}}元<br>
    请添加水果有无包装盒：<input name="dan" type="radio" value="有"  v-model:value="dan">有 <input name="dan" type="radio"  v-model:value="dan" value="没有">没有  {{dan}}<br>
    请添加水果的状态：<%--<select  v-model="zt"  v-on:change="zt">--%>
                        <%--<select v-model="zy" v-on:change="zy">--%>
                            <%--<option :value="item.id" v-for="(item,index) in zhaungtai">{{item.name}}</option>--%>

                        <%--</select> {{zy}}--%>
    <%--<span>{{zt}}</span>--%>
    <select >

        <option  :value="item.id" v-for="(item,index) in zhaungtai">{{item.name}}{{item.id}} </option>
    </select><br>
请添加水果的口味：<br>
    <input type="checkbox" value="1" v-on:click="Fruit" v-model:value="Fruit" />酸甜 <br>
   <input  type="checkbox" value="2" v-on:click="Fruit" v-model:value="Fruit" />酸<br>
   <input  type="checkbox" value="3" v-on:click="Fruit" v-model:value="Fruit" />甜<br>
   <input  type="checkbox" value="4" v-on:click="Fruit" v-model:value="Fruit" />苦<br>
   <input  type="checkbox" value="5" v-on:click="Fruit" v-model:value="Fruit" />榴莲味<br>





</div>


<script>

    var vm=new Vue({
        el:'#app',
       data:{name:'',
       namevalue: '',
       shulaing :'',
           dan:'',
           zhaungtai:[
               {
                   id:1,
                   name:'新鲜',

               },
               {
                   id:2,
                   name:'不新鲜',


               },
               {
                   id:3,
                   name:'烂了',

               }

           ],
           Fruit:'',

       },
        methods:{
            names:function () {

                var name=  this.name;

                console.log(name)

                var n=name.length;
                console.log(n);
                if (n>7){

                    alert("输入的字段长度不能超过7")
                    this.name='';
                }

            },
            shulaings:function () {
                this.shulaing= this.shulaing-1;
            },
            shulainga:function () {
                this.shulaing=this.shulaing+1;
            },




        }

    });




</script>


</body>
</html>
