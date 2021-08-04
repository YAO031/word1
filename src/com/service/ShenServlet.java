package com.service;

import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "ShenServlet" ,urlPatterns ="/ShenServlet" )
public class ShenServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");



String shen=req.getParameter("shen");
        System.out.println(shen);


        Map map=new HashMap();

        map.put("code",0);
        map.put("msg","修改成功");
        map.put("count",3);
        map.put("shen","神仙");





        // JSON.toJSONString(date);//使用阿里巴巴

        String s= JSON.toJSONString(map);
        PrintWriter writer=resp.getWriter();
        writer.println(s);
        writer.close();



    }
}
