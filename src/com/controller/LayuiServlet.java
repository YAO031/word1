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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        students.add(a1);

        Student a2=new Student();
        a2.setName("fcbhd");
        a2.setAge(12);
        a2.setId(002);
        students.add(a2);

        Student a3=new Student();
        a3.setName("fcbhd");
        a3.setAge(12);
        a3.setId(003);
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
