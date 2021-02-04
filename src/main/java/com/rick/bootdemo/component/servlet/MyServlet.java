/*
 * @Author: Kay_Rick@outlook.com
 * @Date: 2021-01-30 15:47:51
 * @LastEditors: Kay_Rick@outlook.com
 * @LastEditTime: 2021-02-04 22:14:04
 * @Description: 测试加入Servlet
 */
package com.rick.bootdemo.component.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

@Component
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("MyServlet");
    }
}
