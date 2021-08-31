package com.xiexin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HellController {

    @RequestMapping("/hell0")
    public String tets01(){


        System.out.println("你好");
        return "hello";
    }
    @RequestMapping("/reg")
    public String reg(){


        System.out.println("你好");
        return "reg";
    }


}
