package com.controller;

import com.alibaba.fastjson.JSON;
import com.beaan.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@WebServlet(name = "LayuiServlet",urlPatterns = "/LayuiServlet")
public class LayuiServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");

        List<Student> students=new ArrayList<>();
        Student a1=new Student();
        a1.setName("fcbhd");
        a1.setAge(12);
        a1.setId(001);
        a1.setBirthbay(new Date());
        a1.setShen(false);
        students.add(a1);

        Student a2=new Student();
        a2.setName("fcbhd");
        a2.setAge(122);
        a2.setId(002);
        a2.setShen(false);
        String  bdate="1998-12-13 19:12:30";
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        Date bDate=null;
        try {
            bDate=simpleDateFormat.parse(bdate);
            a2.setBirthbay(bDate);


        } catch (ParseException e) {
            e.printStackTrace();
        }
        students.add(a2);


        Student a3=new Student();
        a3.setName("fcbhd");
        a3.setAge(123);
        a3.setId(003);
        a3.setShen(true);
        a3.setBirthbay(new Date());
        students.add(a3);

        Map map=new HashMap();
        map.put("code",0);
        map.put("msg","写舍都行");
        map.put("count",3);
        map.put("data",students);





        // JSON.toJSONString(date);//使用阿里巴巴

        String s=JSON.toJSONString(map);
        PrintWriter writer=resp.getWriter();
        writer.println(s);
        writer.close();
    }
}
