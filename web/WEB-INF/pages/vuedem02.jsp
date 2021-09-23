<%--
  Created by IntelliJ IDEA.
  User: 曜
  Date: 2021/9/16
  Time: 16:19
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

    <%--讲解一个概念 双向的绑定 数据和页面的 展示的数据效果  是一起的 保持一致的--%>

    <%--当vue中 data 的数据发生 了改变，那么展示的效果也会发生改变--%>
      以前的写法：  <input type="text" value="这是个名字"><br>
    <%--vue 的核心是把数据渲染到HTML中，分为标签和文本--%>
        <%--那么文本，是用 插值表达式--%>
        <%--姓名：{{name}}--%>

       <%--v- bind 是绑定属性的 ，一经绑定，数据是动态的了，就要写data的key--%>
        vue--名字 单向的绑定 <input type="text" v-bind:value="name"><br>
        vue--名字  <input type="text" :value="name"><br>
    <%--以上是单向的绑定，数据的帮定 ，数据绑定到了 显示的效果--%>

        vue--名字双向的绑定  <input type="text" v-model:value="name"><br>
            <%--v-model 是v-bind 的升级版其本质是语法糖--%>
            <%--Java 中for 循环就是一个语法糖，fro的循环的本质就是while循环，语法糖就是简化了代码的书写--%>
            <%--v-model 双向的绑定 作用得到 input 标签 select 标签 texterea标签 components组件--%>
            <%--之渲染一次的指令v-once--%>
        {{name.length}}
          姓名：<input type="text" v-once: value="name"><br>
</div>



<script>

    var vm=new Vue({

        el:"#app",
        data:{

            name:'这是名字11'

        }

    })

</script>


</body>
</html>
