package com.xiexin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/*
这个控制类 是为了jsp或者带参数的跳转

 */
@Controller
@RequestMapping("/pages")
public class PagesController {

    @RequestMapping("/reg")
    public String reg(){

        System.out.println("请求进入");
        return "reg";
    }

    @RequestMapping("/regForm")
    public String regForm(){

        return "regForm";

    }
    @RequestMapping("/login")
    public String login(){

        return "login";

    }
    @RequestMapping("/loginForm")
    public String loginForm(){

        return "loginForm";

    }

}
