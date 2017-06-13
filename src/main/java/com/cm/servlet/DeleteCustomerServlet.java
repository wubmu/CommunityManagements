package com.cm.servlet;

import com.cm.bean.Admin;
import com.cm.dao.AdminDao;
import com.cm.dao.impl.AdminDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 吴亚斌 on 2017/6/9.
 */
@WebServlet(name = "DeleteCustomerServlet",urlPatterns = "/servlet/delectCustomer")
public class DeleteCustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String id= request.getParameter("id");
        AdminDao dao = new AdminDaoImpl();
        dao.delect(id);
        response.getWriter().write("删除成功2秒后返回上一页");
        response.setHeader("refresh","2;URL=");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
