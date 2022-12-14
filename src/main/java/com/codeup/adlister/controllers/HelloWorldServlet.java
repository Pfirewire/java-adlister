package com.codeup.adlister.controllers;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "controllers.HelloWorldServlet", urlPatterns = "/")

public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String name =  req.getParameter("name");
        if(name == null) {
            out.println("<h1>Hello, World!</h1>");
        } else {
            out.printf("<h1>Hello, %s!</h1>%n", name);
        }
    }
}
