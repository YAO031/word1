<%--
  Created by IntelliJ IDEA.
  User: 曜
  Date: 2021/9/2
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<html>
<head>
    <title>Spring 之 AJAx 和MVC 的收参数 非常重要</title>
</head>
<body>


        <div>
            <input type="button" value="ajax 的第一种 传参  k-结构或者对象" id="ahax01">
            <input type="button" value="ajax 的第二种 传参  k-结构或者对象" id="ahax02">
            <input type="button" value="ajax 的第三种 传参  k-结构或者对象" id="ahax03">
            <input type="button" value="ajax 的第四种 传参  传josn对象" id="ahax04">
            <input type="button" value="ajax 的第五种 传参  传多个josn对象" id="ahax05">
            <input type="button" value="ajax 的第六种 传参  传多个josn对象" id="ahax06">
            <input type="button" value="ajax 的第七种 map传参  传多个josn对象" id="ahax07">
            <input type="button" value="ajax 的第七种 对象+常用类型  代参数分页查询" id="ahax08">

        </div>

        <script>

            $(function () {
                $("#ahax01").click(function () {

                    $.ajax(
                        {
                            url:"/api/regBtBean",
                            data:{
                                'adminName':'zhangsan',
                                'adminPwd':'123456',
                                'adminTime':'2010-09 22:00:00',


                            },
                            dataType:'JSON',
                            success:function (res) {
                                console.log(res)
                            }


                        }

                    );
                });

                // $("#ajax02").click(function () {
                //     var adminInfo={};
                //     adminInfo.adminName='zhangsan',
                //         adminInfo.adminPwd='123456',
                //         adminInfo.adminTime='2010-09 22:00:00'
                //
                // });

                $("#ahax03").click(function () {

                    var ids=new Array();
                    ids.push(3);
                    ids.push(4);
                    ids.push(6);
                    ids.push(8);
                    $.ajax({
                        url:"/api/ajax03",
                        type:"POST",
                        data:{'ids':ids},
                        dataType: "JSON",
                        success:function (res) {
                            console.log(res)
                        }


                    });

                });
                $("#ahax04").click(function () {
                    //json对象就是 浏览器请求带颜色的
                        var adminInfo={
                            //
                            // "AdminInfo{" +
                            //         "adminName='" +
                            //     ", adminTime="
                            // ", adminPwd='"
                            //     ", loverList="
                            // ", aiHao=" + Ar
                            // '}';
                            adminName:"张三",
                            adminTime:"2020-10-10 12:09:34",
                            adminPwd:"12344",
                            loverList:[
                                {
                                    name:"老师",
                                    age:18

                                },
                                {
                                    name:"老师1",
                                    age:19,


                                },
                                {
                                    name:"laoshi3",
                                    age:15
                                },

                            ],
                            aiHao:[1,3,56]

                        };
                        //var 出来的对象 他是个对象 如果直接传输
                    //越是复杂的越是转化请求
                    //因为 普通的请求是很多个，后台收取很复杂 所以就需要把复杂的对象转化成json对象，后台接受就会方便多了。


                    $.ajax({
                        url:"/api/ajax04",

                        type: "POST",
                            //Content-Type: application/x-www-form-urlencoded; charset=UTF-8 普通的K-V方式

                        data:JSON.stringify(adminInfo),//变为json对象 就需要更改application、json；charset=UTF-8
                        contentType:"application/json;charset=UTF-8",
                        dataType:"json",
                        success:function (rs) {
                            console.log(rs)
                        }

                    });


                });
                $("#ahax05").click(function (){

                    //不常见 因为 发货单 上面收货人的对象 下面的对象
                    $.ajax(
                        {
                            url:"/api/ajax05",
                            type:"post",
                            dataType:"json",
                            data:{
                                'lover.name':"傲视",
                                'lover.age':123,
                                'dog.dogid':12,
                                'dog.sex':'男',

                            },
                            success:function (res) {
                                console.log(res)
                            }

                        });
                });
                $("#ahax06").click(function (){
                    var loverList=[];
                    for (var i=0; i<5;i++){

                        var lover={
                            name:"傲视群",
                            age:19

                        }
                        loverList.push(lover)
                    }
                    //对个对象属于复杂的，用json
                    $.ajax({

                       url:"/api/ahax06",
                        type:"post",
                        // type:"Get",get请求没有方法题是无法 传输json数据和json协议
                       data:JSON.stringify(loverList),
                        dataType:'json',
                        contentType:"application/json;charset=UTF-8",
                        success:function (r) {
                            console.log(r)
                        }
                    });


                });
                $("#ahax07").click(function (){
                    var map={
                        'adminName':'zhangsan',
                        'adminPwd':'123456',
                        'adminTime':'2010-09 22:00:00',

                    }
                    $.ajax({

                        url:"/api/ahax07",
                        type:"post",
                        dataType:"json",
                        data:JSON.stringify(map),
                        success:function (res) {
                            console.log(res)
                        },
                        contentType:"application/json;charset=utf-8",

                    });

                });
                $("#ahax08").click(function (){

                    $.ajax(
                        {
                            url:"/api/ahax08",
                            type:"podt",
                            data:{
                                'name':'san',
                                'pageSize':15,
                                'page':2,

                            },
                            dataType:'json',
                            success:function (r) {
                                console.log(r)
                            }

                        }
                    )
                    ;

                });

            });




        </script>






</body>
</html>
