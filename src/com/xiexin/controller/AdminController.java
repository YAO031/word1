package com.xiexin.controller;


import com.xiexin.bean.AdminInfo;
import com.xiexin.bean.Dog;
import com.xiexin.bean.Lover;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.jms.Session;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.crypto.Data;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
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

    @RequestMapping("/res1")
    @ResponseBody  //这个就是返回给前端的json
    public Map  regq(String adminName, String adminPwd, String adminTime, String city, List arr, String open , String sex){
        System.out.println("adminName = " + adminName);
        System.out.println("adminPwd = " + adminPwd);
        System.out.println("arr = " + arr);


        Map codeMap=new HashMap();
        codeMap.put("code","0");
        codeMap.put("msg","注册成功");

        return codeMap;

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

    //ajax接受 数据 和集合
    @RequestMapping("/ajax03")
    @ResponseBody
    public Map ajax03(@RequestParam("ids[]") List<Integer> ids){
        for(Integer i:ids){
            System.out.println("i = " + i);



        }

        Map codeMap=new HashMap();
        codeMap.put("code",0);
        codeMap.put("msg","访问成功");
        codeMap.put("data",ids);


        return codeMap;

    }
    //ajax接受 对象

    @RequestMapping("/ajax04")
    @ResponseBody
    public Map ajax04(@RequestBody AdminInfo adminInfo){//值得是前端 用json
        System.out.println("adminInfo = " + adminInfo);

        Map codeMap=new HashMap();
        codeMap.put("code",0);
        codeMap.put("msg","访问成功");
        codeMap.put("data",adminInfo);


        return codeMap;

    }

//    ajax05 接受前端传过来的多个对象  如果前端穿过多个对象就得绑定
    @RequestMapping("/ajax05")
    @ResponseBody
    public Map ajax05(@ModelAttribute Lover lover, @ModelAttribute Dog dog){
        System.out.println("lover = " + lover);
        System.out.println("dog = " + dog);

        Map codeMap=new HashMap();
        codeMap.put("code",0);
        codeMap.put("msg","访问成功");
        codeMap.put("data1",lover);
        codeMap.put("data2",dog);
        return codeMap;
    }

    @InitBinder("lover")
    public void binding(WebDataBinder webDataBinder){

        webDataBinder.setFieldDefaultPrefix("lover.");


    }
    @InitBinder("dog")
    public void binding1(WebDataBinder webDataBinder){

        webDataBinder.setFieldDefaultPrefix("dog.");


    }

    @RequestMapping("/ahax06")
    @ResponseBody   //@GetMapping 和 RequestBody不能同时使用
    public Map ajax06(@RequestBody List<Lover> loverList) {
        System.out.println("loverList = " + loverList);

        Map codeMap=new HashMap();
        codeMap.put("code",0);
        codeMap.put("msg","访问成功");
        codeMap.put("data1",loverList);

        return codeMap;
    }


    @RequestMapping("/ahax07")
    @ResponseBody

    public Map ajax07(@RequestBody Map map){

        System.out.println(map.get("adminName"));

        Map codeMap=new HashMap();
        codeMap.put("code",0);
        codeMap.put("msg","访问成功");
        codeMap.put("data1",map);

        return codeMap;


    }

    @RequestMapping("/ahax08")
    @ResponseBody
    public Map ajax08(Lover lover, @RequestParam(value = "limit",required = false,defaultValue = "5") Integer pageSize,Integer page){
        System.out.println("lover = " + lover);
        System.out.println("pageSize = " + pageSize);
        System.out.println("page = " + page);



        return null;
    }

    @RequestMapping("/ceshi")
    @ResponseBody

    public Map ceshi(@RequestBody Map map){

        Date date=new Date();
        map.put("data", date);

        System.out.println("map = " + map);

        Map codeMap=new HashMap();
        codeMap.put("code",0);
        codeMap.put("msg","访问成功");
        codeMap.put("data1",map);

        return codeMap;


    }



    //以上就是前后端分离

    //第一种 SpringMVC 的传值方式 request+session+request的转发


    //传统的MVC是不返回json数据， 不使用@ResponseBody 跳转jsp

    //页面传值 就是四大作用域  request session applation ，page
    @RequestMapping("/yuansheng")
//    public String yunasheng(AdminInfo adminInfo,HttpSession session){
    public String yunasheng(HttpSession session , HttpServletRequest request){

        System.out.println("原生方法 页面传值");
//        System.out.println("adminInfo = " + adminInfo);




//        session.setAttribute("adminInfo",adminInfo);

        String adminName = request.getParameter("adminName");
        String adminPwd = request.getParameter("adminPwd");

        request.setAttribute("adminName",adminName);
        request.setAttribute("adminPwd",adminPwd);




        //serviet 的转发
        //SpringMVC 的转发

//        return "forward:/WEB-INF/pages/home.jsp";
//        return "home";//这个 和 PagesController里的查找  是
        // 没有联系的

        //重定向 serviet response. 不带数据
        return "redirect:https://www.baidu.com";//带/de 区别
//        return "redirect:/https://www.baidu.com";//http://localhost:8080/https://www.baidu.com

    }
    
    @RequestMapping("/modelAndView")
    public ModelAndView  modelAndView(AdminInfo adminInfo){

      //  ModelAndView 和视图 数据和显示  可以带题转发功能
        ModelAndView mv=new ModelAndView();
        mv.addObject("adminName",adminInfo.getAdminName());
        mv.addObject("adminPwd",adminInfo.getAdminPwd());

        System.out.println("以上是adminInfo 即 数据的绑定");
        mv.setViewName("home");

        return mv;
        
    }

    //第三种  SpringMVC 的传值参数：mode 代码少
    @RequestMapping("/model")
    public String model(AdminInfo adminInfo, Model model){
        model.addAttribute("adminName",adminInfo.getAdminName());
        model.addAttribute("adminpwd",adminInfo.getAdminPwd());



        return "home";
    }

    //第四种 springMVC 的传值方法 modelMap
    @RequestMapping("/modelMap")
    public String  modelMap(AdminInfo adminInfo, ModelMap modelmap){

        modelmap.put("adminName",adminInfo.getAdminName());
        modelmap.put("adminPwd",adminInfo.getAdminPwd());


        return "home";

    }


    //第五种 SpringMap 传值方式  ，map
    @RequestMapping("/map")
    public String map(AdminInfo adminInfo,Map<String,Object > map){

        map.put("adminName",adminInfo.getAdminName());
        map.put("adminPwd",adminInfo.getAdminPwd());


        return "home";

    }
}
