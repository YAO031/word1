package com.controller;

import com.alibaba.fastjson.JSON;
import com.beaan.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Service;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebServlet(name = "GetJsonServlet",urlPatterns = "/GetJsonServlet")
public class GetJsonServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.service(req, resp);

        List<Student> students=new ArrayList<>();


        Student s1=new Student();
        s1.setId(1);
        s1.setName("凤求凰");
        s1.setAge(19);

        students.add(s1);

        Student s2=new Student();
        s2.setId(2);
        s2.setName("的卢");
        s2.setAge(200);

        students.add(s2);



        Student s3=new Student();
        s3.setId(3);
        s3.setName("赤兔");

        s3.setAge(19);

        students.add(s3);


        String s= JSON.toJSONString(students);

        System.out.println(students);

        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
       PrintWriter writer=resp.getWriter();
       writer.print(s);
       writer.close();
    }
}
