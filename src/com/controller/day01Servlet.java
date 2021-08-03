package com.controller;

import com.beaan.Usre;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "day01Servlet" ,urlPatterns = "/day01Servlet")
public class day01Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//     ArrayList<Usre> u1=new ArrayList<>();

        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
            String x="{\"total\":66,\"rows\":[\n" +
                    "  {\"name\":\"张三\",\"age\":\"15\",\"class\":\"15网络\"},\n" +
                    "  {\"name\":\"李四\",\"age\":\"22\",\"class\":\"17软件\"},\n" +
                    "  {\"name\":\"王五\",\"age\":\"33\",\"class\":\"16信息\"},\n" +
                    "  {\"name\":\"叫兽\",\"age\":\"21\",\"class\":\"15网络\"}\n" +
                    "]}";

        PrintWriter writer=resp.getWriter();
        writer.print(x);
        writer.close();


    }
}
