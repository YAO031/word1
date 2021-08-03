package com.controller;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ALLCityServlet",urlPatterns ="/ALLCityServlet" )
public class ALLCityServlet extends HttpServlet {


    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//        super.service(req, res);
        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/html; charset=UTF-8");
        res.setCharacterEncoding("UTF-8");
        String x= "{\n" +
                "  \"citylist\": [{\n" +
                "    \"p\": \"北京市\",\n" +
                "    \"c\": [{\n" +
                "      \"n\": \"北京\",\n" +
                "      \"a\": [{\n" +
                "        \"s\": \"东城区\"\n" +
                "      }, {\n" +
                "        \"s\": \"西城区\"\n" +
                "      }, {\n" +
                "        \"s\": \"朝阳区\"\n" +
                "      }, {\n" +
                "        \"s\": \"丰台区\"\n" +
                "      }, {\n" +
                "        \"s\": \"石景山区\"\n" +
                "      }, {\n" +
                "        \"s\": \"海淀区\"\n" +
                "      }, {\n" +
                "        \"s\": \"门头沟区\"\n" +
                "      }, {\n" +
                "        \"s\": \"房山区\"\n" +
                "      }, {\n" +
                "        \"s\": \"通州区\"\n" +
                "      }, {\n" +
                "        \"s\": \"顺义区\"\n" +
                "      }, {\n" +
                "        \"s\": \"昌平区\"\n" +
                "      }, {\n" +
                "        \"s\": \"大兴区\"\n" +
                "      }, {\n" +
                "        \"s\": \"怀柔区\"\n" +
                "      }, {\n" +
                "        \"s\": \"平谷区\"\n" +
                "      }, {\n" +
                "        \"s\": \"密云区\"\n" +
                "      }, {\n" +
                "        \"s\": \"延庆区\"\n" +
                "      }]\n" +
                "    }]\n" +
                "  }]}";
        PrintWriter writer=res.getWriter();
        writer.print(x);
        writer.close();
    }
}
