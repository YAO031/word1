package com.controller;

import com.alibaba.fastjson.JSON;
import com.beaan.Usre;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "day02Servlet",urlPatterns = "/day02Servlet")
public class day02Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        List<Usre> usres=new ArrayList<>();//创建数组

        //添加数组
        Usre u1=new Usre();
        u1.setName("刘彻");
        u1.setAge(18);
        u1.setZhiye("皇帝");
        usres.add(u1);

        //添加数组
        Usre u2=new Usre();
        u2.setName("刘邦");
        u2.setAge(42);
        u2.setZhiye("皇帝");
        usres.add(u2);
        //添加数组
        Usre u3=new Usre();
        u3.setName("项羽");
        u3.setAge(32);
        u3.setZhiye("西楚霸王");
        usres.add(u3);

        //添加数组
        Usre u4=new Usre();
        u4.setName("嬴政");
        u4.setAge(24);
        u4.setZhiye("始皇帝");
        usres.add(u4);

        //添加数组
        Usre u5=new Usre();
        u5.setName("刘秀");
        u5.setAge(28);
        u5.setZhiye("天命之子");
        usres.add(u5);

        //添加数组
        Usre u6=new Usre();
        u6.setName("刘彻");
        u6.setAge(18);
        u6.setZhiye("皇帝");
        usres.add(u6);

        //添加数组
        Usre u7=new Usre();
        u7.setName("霍去病");
        u7.setAge(23);
        u7.setZhiye("冠军侯");
        usres.add(u7);//添加数组
        Usre u8=new Usre();
        u8.setName("白起");
        u8.setAge(42);
        u8.setZhiye("杀神");
        usres.add(u8);
        //添加数组
        Usre u9=new Usre();
        u9.setName("刘莽");
        u9.setAge(28);
        u9.setZhiye("梦想皇帝");
        usres.add(u9);//添加数组
        Usre u10=new Usre();
        u10.setName("吕雉");
        u10.setAge(35);
        u10.setZhiye("吕后");
        usres.add(u10);

        //添加数组
        Usre u11=new Usre();
        u11.setName("刘恒");
        u11.setAge(18);
        u11.setZhiye("文帝");
        usres.add(u11);//添加数组


        Usre u12=new Usre();
        u12.setName("刘彻");
        u12.setAge(18);
        u12.setZhiye("武帝");
        usres.add(u12);

        //添加数组
        Usre u13=new Usre();
        u13.setName("刘盈");
        u13.setAge(18);
        u13.setZhiye("惠帝");
        usres.add(u13);

        //添加数组
        Usre u14=new Usre();
        u14.setName("刘启");
        u14.setAge(34);
        u14.setZhiye("景帝");
        usres.add(u14);

        //添加数组
        Usre u15=new Usre();
        u15.setName("刘病已");
        u15.setAge(43);
        u15.setZhiye("宣帝");
        usres.add(u15);
        Map map=new HashMap();


        map.put("code",0);
        map.put("msg","写舍都行");
        map.put("count",3);
        map.put("data",usres);





        // JSON.toJSONString(date);//使用阿里巴巴

        String s= JSON.toJSONString(map);
        PrintWriter writer=resp.getWriter();
        writer.println(s);
        writer.close();








    }
}
