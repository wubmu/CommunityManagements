package com.cm.servlet;

import com.cm.bean.Admin;
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
@WebServlet(name = "LoginServlet", urlPatterns = "/servlet/Login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String type = request.getParameter("type");
        AdminDao dao = new AdminDaoImpl();
        if (type.equals("管理员")) {
            Admin admin = WebUtil.fillBean(request, Admin.class);
            Admin admin1 = dao.findAdmin(admin.getUsername(), admin.getPassword());
            if (admin1!=null){
                request.getSession().setAttribute("admin",admin1);
                response.sendRedirect("success.html");
            }
        }else if (type.equals("住户")) {
            Customer c = WebUtil.fillBean(request, Customer.class);
            Customer cc=dao.findCustomer(c.getName(),c.getPassword());
            if (cc!=null) {
                request.getSession().setAttribute("customer", cc);
                response.sendRedirect("success.html");
            }
        }else
        response.sendRedirect("UserNotExist.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
