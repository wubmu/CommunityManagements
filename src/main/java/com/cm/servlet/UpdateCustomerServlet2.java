package com.cm.servlet;

import com.cm.bean.Customer;
import com.cm.dao.AdminDao;
import com.cm.dao.impl.AdminDaoImpl;
import com.cm.util.WebUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 吴亚斌 on 2017/6/9.
 */
@WebServlet(name = "UpdateCustomerServlet2",urlPatterns = "/servlet/update2")
public class UpdateCustomerServlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        Customer c= WebUtil.fillBean(request,Customer.class);
        AdminDao dao=new AdminDaoImpl();
        dao.update(c);
        response.getWriter().write("修改成功2秒后跳转到管理页面");
        response.setHeader("refresh","");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
