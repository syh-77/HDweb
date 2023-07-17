package com.example.servlet_test.servlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class BookServlet implements Servlet {
    public BookServlet(){
        System.out.println("book实例化");
    }
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("book初始化");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html;charset=utf-8");
        PrintWriter writer = servletResponse.getWriter();
        writer.write("hello servlet 的房价多少");
        System.out.println("book 业务运行");
    }

    @Override
    public String getServletInfo() {
        System.out.println("dfdj");
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("book 被销毁");
    }
}
