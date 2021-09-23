<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增业务</title>
    <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
    <script src="//cdn.bootcss.com/vue/2.5.2/vue.min.js"></script>
    <script src="https://unpkg.com/axios/dist/axios.min.js"></script>
</head>
<body>
<div id="app">

    <h1>新增业务</h1>
    <form action="" method="post"   @submit.prevent="onSubmit"  id="myForm"  >
        业务类型 <select id="typeSelect"  v-model="tBusiness.btype" >
         <option :value="item.typeName"  v-for="(item,index) in tTypes" >{{item.typeName}}</option>
    </select>
        <br>
        排队号 : <input type="text" v-model="tBusiness.bnum" > <br>
        备注信息: <textarea   cols="30" rows="10" v-model="tBusiness.bmark"></textarea>
        <br>
        <input type="submit" value="确认增加">
    </form>
        {{tTypes}}
</div>
<script>
        var vm = new Vue({
            el:'#app',
            data:{
                tTypes:[],
                tBusiness:{}
            },
            created:function () {
                // 官网提供的这个api 是结合 jquery 的ajax 用的。 不是 结合vue 函数用的。
                // 那么就需要 用到  我们的 es 中的 箭头函数来处理。
                // 在es6中， 箭头函数 是 一个缩写，但是功能很强大。可以解决异步渲染问题
                // 写法：  ()=>{}  中括号等价于大括弧
                axios.get("/type/selectAll").then( (response)=>{
                     this.tTypes= response.data.data;
                })


            },
            methods:{
                onSubmit:function (e) {
                    // 凡是事件都有个 e
                    console.log(e)
                    console.log(e.target) //  vue 的事件 可以 通过  e.target 拿到 标签中的 dom 元素

                 //   var form =  document.getElementById('myForm');
                //    console.log(form)
                    // 拿取form 表单中的数据
                    //  var formData=  new FormData(form); // 课下学习。
                  //  var formData=  new FormData(e.target); // 课 下学习。
                    //console.log(formData.get('adminName')) // 脱离了 jquery ！！！
                    // 作业1 ： 引入 axios ， 写个ajax 发送 到 通过 post发送给百度！！！
                    axios.post('/insert', {
                        bmark: this.tBusiness.bmark,
                        btype: this.tBusiness.btype,
                        bnum: this.tBusiness.bnum
                    }) .then( (response)=>{
                            if(response.data.code==0){
                                alert(response.data.msg)
                              }else{
                                alert("添加失败")
                                 }
                    })
                    return false;
                }
            }
        });

</script>

</body>
</html>
