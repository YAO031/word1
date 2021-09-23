<%--
  Created by IntelliJ IDEA.
  User: 曜
  Date: 2021/9/15
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<script src="//cdn.bootcss.com/vue/2.5.2/vue.min.js"></script>

<html>
<head>
    <title>第一个</title>
</head>
<body>

<div>学习 差值表达式
    Vue 常用于 单个页面项目 ，就是单页项目
    通过 锚点 来跳转。 没有a标签 这个锚点的跳转就坐路由

    优点：运行流畅 都是HTML 组件的复用
    缺点：不易于seo百度的搜索
</div>



<h1>讲解jQuery和Vue的不同 </h1>

<div>
    jQuery 是dem驱动的 所有的页面 一行一行把代码 写出来的，不是自动的，手动的

    <h2 id="jq-helloword">


    </h2>

</div>

<div id="app">

    vue 因为是单页面，所以只有一个标签<br>

    插值表达式 1.可以直接调用js的方法
                2.可以进行计算
                3.可以 用加号 做拼接 加法的计算 不同
                4.插值表达式 显示 对象的格式是 XXX点yyy
                5.插值表达式 可以做三目表达式 运算 非常 重要的



    <h2>
        {{sayHello}}  的长度 {{sayHello.length / 100}} <br>
        {{sayEating}}<br>
        {{lightLine}}<br>

        {{apple.pname}}的价格 {{apple.price / 10}}<br>
        {{apple.pname}}的价格 {{apple.price / 10}}<br>

        当前{{apple.pname}}的价格 {{apple.price /100 > 2.5 ? '太贵了' : '价格可以'}}
        <div v-if="apple.price  /100 > 2.5">
                <span style="color: red" >太贵了</span>

        </div>
        <div v-else>
            <span style="color: green" >价格可以</span>

        </div>

        <div v-if="apple.price   > 2.5 ">
            <span style="color: red" >太贵了</span>

        </div>
        <div v-else-if="apple.price  /100 > 2 && apple.price  /100 < 2.5">
            <span style="color: gold" >考虑一下</span>

        </div>
        <div v-else>
            <span style="color: green" >买啦</span>
        </div>




    <%--刚学完vue 的插值表达式， 那么 知道 vue的根本的核心是： 把数据显示到前端--%>
        <%--如果只是用 插值表达式 显示数据 那么 他的显示的内容 想要更加强的效果 插值表达式是--%>
        <%--不饿能满足的 所以 就有了新的 方法 就是在指令。--%>
        <%--因为 前端界面是HTML的，插值表达式 他只能 对文本信息 做出 数据的渲染 。。 没有对标签的做出数据--%>
        <%--那么我们学习更强的 就是指令 ，用来弥补增强插值表达式的不足--%>

        <%--比如 动态 改变 超过二元的是红色 低于二元的是绿色、--%>
        <%--比如 动态 改变 超过二元的是红色 低于二元的是绿色、--%>

        <%--上面的改变颜色无法做到，就引发出来指令  指令是作用到--%>
        <%--一些指令能够接受一个“参数” ，在指令名称之后冒号表示。--%>
        <%--指令（Directives） 是带有V- 前追--%>

        <%--指令--%>

        <%--v-text v-html--%>
        <%--v-text其实就是插值表达式--%>
        <span v-text="apple.pname"></span>的价格是{{apple.price / 10}}<br>
        <%--v-text 的优点 可以显示 data --%>
        <span v-text="vtext"></span><br>
        <%--v-text 不编译文本中的HTML信息--%>
        <span v-html="vhtml"></span><br>

        <span >{{vtext}}</span><br>
        <span v-pre>{{vtext}}</span><br>

    </h2>
</div>

<script>
    <%--jq的思想 找得到id的DOM 给她添加
    如果我想改变显示效果就得需要改变变量的地方

    jq 的难题：没有统一的存储地方
    --%>
    $(function () {
        $("#jq-helloword").text("你好 世界")
    })

//    学习Vue 和java很像
    var vm=new Vue({
        //new Vue()小括弧中一般放大括弧 json 对象k-v 结构
        //大括弧就是放的Vue的选项，选项在官网中查看 有多少中？ 作业
        //作业 写出Vue选项的思维导图
        //把HTML中的div的id为app的dom元素 作为了挂载点
                //挂载点：Vue是以数据驱动的。new vue中的诞生数据

                //有了数据，就需要 一个dom 元素 ，显示数据，张三是元数据
        el:'#app'
       , data:{
            sayHello:"你好世界",
            sayEating:"加油，干饭",
            lightLine:'发射动感光波',
            apple:{
                pid:15,
                pname:"红富是士",
                price:25 //单价元 -- 显示成前端后，显示成元


            },
            vtext:'<h1> 你看看我是不是标题</h1>',
            vhtml:'<h1> 你看看我是标题吗</h1>',

        }

    });




</script>



</body>
</html>
