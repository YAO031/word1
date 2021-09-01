package com.xiexin.controller;


import com.xiexin.bean.AdminInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/api")
public class AdminController {
  //注册成功后如果是单项目---就要跳转到登陆页面，这个跳转就是后台的转  发  重定向 总之就是  后台负责


  //如果是  新增的项目，即前端分离的 那么 后台只负责 返回给前端json数据

  // 跳转是前端来处理 前端根据 后台返回code代码，进行跳转
  //如果前端负责跳转，他会起一个名字，叫 做 路由



    //什么事前端的分离 即：项目的分离 和数据上的分离
    //项目上的分离： 前端一个项目，后端一个项目 2项目
    //数据上的项目 ： 还是一个项目，只不过  前后端 用json来交互数据
    //很少用在layui/el 表达式 来写项目  他们认证的是session


    //layui 在ssm 上 其实是 数据上的分离，也可以 项目上的分离
    //那么特就是json 交互的，那么 后台只需要给她返回json数据就可以了

    //以前 在Serviet 中，resp.getWriter().print(new JSONOBject.toString(map)). 输出json

    //现在 高级 直接加一个注解就行

    @RequestMapping("/res")
    @ResponseBody  //这个就是返回给前端的json

    public Map res(String adminName,String adminPwd, String adminPwdR, String adminTime){


        System.out.println("adminTime = " + adminTime);
        Map codMap=new HashMap();
        if (!adminPwd.equals(adminPwdR)){

            codMap.put("code","4401");
            codMap.put("msg","你输入的密码不一致");
            return codMap;

        }

       if (adminName.length()<=0 ){
           codMap.put("code","4402");
           codMap.put("msg","你的注册表单需要填完");
           return codMap;
       }
       if (adminPwdR.length()<=0){
           codMap.put("code","4402");
           codMap.put("msg","你的注册表单需要填完");
           return codMap;
       }
        if (adminPwd.length()<=0){
            codMap.put("code","4402");
            codMap.put("msg","你的注册表单需要填完");
            return codMap;
        }

        codMap.put("code","0");
        codMap.put("msg","注册成功");

       return codMap;




    }



    //传统的版本
    @RequestMapping("/regForm")
    public String regForm(String adminName,String adminPwd){
        System.out.println("adminName = " + adminName);
        System.out.println("adminPwd = " + adminPwd);

        return "loginForm";


    }

    @RequestMapping("/regBtBean")
    @ResponseBody
    public Map regByBean(AdminInfo adminInfo){
        System.out.println("adminInfo = " + adminInfo);



        Map codeMap=new HashMap();
        codeMap.put("code",0);
        codeMap.put("msg","注册成功");

        return codeMap;


    }

}
