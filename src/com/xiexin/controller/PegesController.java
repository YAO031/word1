package com.xiexin.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PegesController {

    @RequestMapping("/")
    public String index1(){



        return "index";
    }
    @RequestMapping("/index")
    public String index(){



        return "index";
    }
    @RequestMapping("/addBusiness")
    public String addBusiness(){



        return "addBusiness";
    }
    @RequestMapping("/vuedem00")
    public String vuedem00(){



        return "vuedem00";
    }
    @RequestMapping("/vuedem01")
    public String vuedem001(){



        return "vuedem01";
    }
    @RequestMapping("/vuedem02")
    public String vuedem002(){



        return "vuedem02";
    }
    @RequestMapping("/vuedem03")
    public String vuedem003(){



        return "vuedem03";
    }
    @RequestMapping("/vuedem04")
    public String vuedem004(){



        return "vuedem04";
    }
    @RequestMapping("/zy")
    public String zy(){



        return "zy";
    }
    @RequestMapping("/daby17")
    public String daby17(){



        return "daby17";
    }
    @RequestMapping("/jiantouhanshu")
    public String jiantouhanshu(){



        return "jiantouhanshu";
    }
    @RequestMapping("/test")
    public String text(){



        return "test";
    }
    @RequestMapping("/blist")
    public String blist(){



        return "blist";
    }

//    @RequestMapping("zy")
//    public String zy(){
//
//
//
//        return "SelectServlet";
//    }

}
