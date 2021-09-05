package com.xiexin.controller;

import com.xiexin.bean.AdminInfo;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@RequestMapping("/daby")
public class daby01 {
    //这是写MVC传值的作业

    @RequestMapping("/yuansheng01")
    public String yuansheng01(AdminInfo adminInfo , HttpSession session){

        session.setAttribute("adminInfo",adminInfo);



        return "home";

    }


    @RequestMapping("/yuansheng02")
    public String yuansheng02(HttpSession session , HttpServletRequest request){

        String adminName = request.getParameter("adminName");
        String adminPwd = request.getParameter("adminPwd");

        request.setAttribute("adminName",adminName);
        request.setAttribute("adminPwd",adminPwd);



        return "forward:/WEB-INF/pages/home.jsp";
    }

    @RequestMapping("/yuansheng03")
    public String yuansheng03(AdminInfo adminInfo , HttpSession session){

        session.setAttribute("adminInfo",adminInfo);



        return "home";

    }


    @RequestMapping("/yuansheng04")
    public String yuansheng04(HttpSession session , HttpServletRequest request){

        String adminName = request.getParameter("adminName");
        String adminPwd = request.getParameter("adminPwd");

        request.setAttribute("adminName",adminName);
        request.setAttribute("adminPwd",adminPwd);



        return "forward:/WEB-INF/pages/home.jsp";
    }
    @RequestMapping("/yuansheng05")
    public String yuansheng05(AdminInfo adminInfo , HttpSession session){

        session.setAttribute("adminInfo",adminInfo);



        return "home";

    }

    @RequestMapping("/modelAndView01")
    public ModelAndView modelAndView01(AdminInfo adminInfo){


        ModelAndView mv=new ModelAndView();
        mv.addObject("adminName",adminInfo.getAdminName());
        mv.addObject("adminPwd",adminInfo.getAdminPwd());
        mv.setViewName("home");

        return mv;

    }
    @RequestMapping("/modelAndView02")
    public ModelAndView modelAndView02(AdminInfo adminInfo){


        ModelAndView mv=new ModelAndView();
        mv.addObject("adminName",adminInfo.getAdminName());
        mv.addObject("adminPwd",adminInfo.getAdminPwd());
        mv.setViewName("home");

        return mv;

    }@RequestMapping("/modelAndView03")
    public ModelAndView modelAndView03(AdminInfo adminInfo){


        ModelAndView mv=new ModelAndView();
        mv.addObject("adminName",adminInfo.getAdminName());
        mv.addObject("adminPwd",adminInfo.getAdminPwd());
        mv.setViewName("home");

        return mv;

    }@RequestMapping("/modelAndView04")
    public ModelAndView modelAndView04(AdminInfo adminInfo){


        ModelAndView mv=new ModelAndView();
        mv.addObject("adminName",adminInfo.getAdminName());
        mv.addObject("adminPwd",adminInfo.getAdminPwd());
        mv.setViewName("home");

        return mv;

    }@RequestMapping("/modelAndView05")
    public ModelAndView modelAndView05(AdminInfo adminInfo){


        ModelAndView mv=new ModelAndView();
        mv.addObject("adminName",adminInfo.getAdminName());
        mv.addObject("adminPwd",adminInfo.getAdminPwd());
        mv.setViewName("home");

        return mv;

    }


    @RequestMapping("/model01")
    public String model01(AdminInfo adminInfo, Model model){
        model.addAttribute("adminName",adminInfo.getAdminName());
        model.addAttribute("adminpwd",adminInfo.getAdminPwd());



        return "home";
    }
    @RequestMapping("/model02")
    public String model02(AdminInfo adminInfo, Model model){
        model.addAttribute("adminName",adminInfo.getAdminName());
        model.addAttribute("adminpwd",adminInfo.getAdminPwd());



        return "home";
    }
    @RequestMapping("/model03")
    public String model03(AdminInfo adminInfo, Model model){
        model.addAttribute("adminName",adminInfo.getAdminName());
        model.addAttribute("adminpwd",adminInfo.getAdminPwd());



        return "home";
    }
    @RequestMapping("/model04")
    public String model04(AdminInfo adminInfo, Model model){
        model.addAttribute("adminName",adminInfo.getAdminName());
        model.addAttribute("adminpwd",adminInfo.getAdminPwd());



        return "home";
    }
    @RequestMapping("/model05")
    public String model05(AdminInfo adminInfo, Model model){
        model.addAttribute("adminName",adminInfo.getAdminName());
        model.addAttribute("adminpwd",adminInfo.getAdminPwd());



        return "home";
    }


    @RequestMapping("/modelMap01")
    public String  modelMap01(AdminInfo adminInfo, ModelMap modelmap){

        modelmap.put("adminName",adminInfo.getAdminName());
        modelmap.put("adminPwd",adminInfo.getAdminPwd());


        return "home";

    }
    @RequestMapping("/modelMap02")
    public String  modelMap02(AdminInfo adminInfo, ModelMap modelmap){

        modelmap.put("adminName",adminInfo.getAdminName());
        modelmap.put("adminPwd",adminInfo.getAdminPwd());


        return "home";

    }
    @RequestMapping("/modelMap03")
    public String  modelMap03(AdminInfo adminInfo, ModelMap modelmap){

        modelmap.put("adminName",adminInfo.getAdminName());
        modelmap.put("adminPwd",adminInfo.getAdminPwd());


        return "home";

    }
    @RequestMapping("/modelMap04")
    public String  modelMap04(AdminInfo adminInfo, ModelMap modelmap){

        modelmap.put("adminName",adminInfo.getAdminName());
        modelmap.put("adminPwd",adminInfo.getAdminPwd());


        return "home";

    }
    @RequestMapping("/modelMap05")
    public String  modelMap05(AdminInfo adminInfo, ModelMap modelmap){

        modelmap.put("adminName",adminInfo.getAdminName());
        modelmap.put("adminPwd",adminInfo.getAdminPwd());


        return "home";

    }


    @RequestMapping("/map01")
    public String map01(AdminInfo adminInfo, Map<String,Object > map){

        map.put("adminName",adminInfo.getAdminName());
        map.put("adminPwd",adminInfo.getAdminPwd());


        return "home";

    }
    @RequestMapping("/map02")
    public String map02(AdminInfo adminInfo, Map<String,Object > map){

        map.put("adminName",adminInfo.getAdminName());
        map.put("adminPwd",adminInfo.getAdminPwd());


        return "home";

    }
    @RequestMapping("/map03")
    public String map03(AdminInfo adminInfo, Map<String,Object > map){

        map.put("adminName",adminInfo.getAdminName());
        map.put("adminPwd",adminInfo.getAdminPwd());


        return "home";

    }
    @RequestMapping("/map04")
    public String map04(AdminInfo adminInfo, Map<String,Object > map){

        map.put("adminName",adminInfo.getAdminName());
        map.put("adminPwd",adminInfo.getAdminPwd());


        return "home";

    }
    @RequestMapping("/map05")
    public String map05(AdminInfo adminInfo, Map<String,Object > map){

        map.put("adminName",adminInfo.getAdminName());
        map.put("adminPwd",adminInfo.getAdminPwd());


        return "home";

    }








}
