<%--
  Created by IntelliJ IDEA.
  User: 曜
  Date: 2021/9/16
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<script src="//cdn.bootcss.com/vue/2.5.2/vue.min.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>



<div id="app">
    <%--v-on:后面接的是事件， 而v-bind接的是属性--%>
    <input type="button" value="点击在ul中显示葫芦娃" v-on:click="showHuluwa">

    <ul>
        <li v-for="(item,index) in hulus":key="hulus.id" >{{item.name}}</li>
    </ul>
        <%--<ul>--%>
            <%--<li v-for="(item,index) in xiao":key="xiao.id" >{{xiao.name}}</li>--%>
        <%--</ul>--%>

    <select>

        <option v-for="(item,index) in hulus":key="hulus.id" >{{item.name}} {{item.spell}} </option>

    </select>



    <select v-model="hulusispell" v-on:change="selectwawa(hulusispell)">

        <option  :value="item.spell" v-for="(item,index) in hulus">{{item.name}} </option>
    </select>
    <span>{{hulusispell}}</span>

        <%--v-sjow 如果是false 就不会显示代码的--%>
        <%--v-show 不支持<template> 这个元素的--%>
    <span v-show="ok">你看到我了吗？</span><br>


</div>


<script>
    var  vm=new Vue({

        el:'#app',
        data:{

            hulus:[

            ],
            hulusispell:0,
            ok:false
        // ,xaio:[{
        //         id:1,
        //         name:'大娃',
        //         spell:'变大'
        //     },
        //         {
        //             id:2,
        //             name:'二娃',
        //             spell:'千里眼，顺风耳'
        //
        //         },
        //         {
        //             id:3,
        //             name:'三娃',
        //             spell:'金刚罩'
        //         }]
        },

        methods:{


            showHuluwa:function () {
                alert("弹框")
                var arr= [{
                        id:1,
                        name:'大娃',
                        spell:'变大'
                    },
                    {
                        id:2,
                        name:'二娃',
                        spell:'千里眼，顺风耳'

                    },
                    {
                        id:3,
                        name:'三娃',
                        spell:'金刚罩'
                    }];

                this.hulus=arr;
            },
            selectwawa:function (hulusispell) {


                console.log("我选中了一个哇哇"+hulusispell)
            }

        }




    })


</script>

</body>
</html>
