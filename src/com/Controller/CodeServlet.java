package com.Controller;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.CircleCaptcha;
import cn.hutool.captcha.LineCaptcha;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "CodeServlet",urlPatterns = "/CodeServlet")
public class CodeServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //定义图形验证码的长、宽、验证码字符数、干扰元素个数
        CircleCaptcha captcha = CaptchaUtil.createCircleCaptcha(200, 100, 4, 20);
        //CircleCaptcha captcha = new CircleCaptcha(200, 100, 4, 20);
        //图形验证码写出，可以写出到文件，也可以写出到流
       // captcha.write("d:/circle.png");
        //验证图形验证码的有效性，返回boolean值
      //  captcha.verify("1234");

//        String code=captcha.getCode();  圆圈
        LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(200, 100);//线性
        String code=lineCaptcha.getCode();
        HttpSession session=req.getSession();

        session.setAttribute("code",code);


        ServletOutputStream outputStream=resp.getOutputStream();

//        captcha.write(outputStream);

        lineCaptcha.write(outputStream);//生=成线性
        outputStream.close();




    }
}
