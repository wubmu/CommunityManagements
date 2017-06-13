package com.cm.servlet;

import com.cm.dao.CustomerDao;
import com.cm.dao.impl.CustomerDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 吴亚斌 on 2017/6/10.
 */
@WebServlet(name = "PayWServlet", urlPatterns = "/servlet/payW")
public class PayWServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String id=request.getParameter("id");
        int money = Integer.valueOf(request.getParameter("money"));
        CustomerDao dao = new CustomerDaoImpl();
        int rs = dao.payW(id,money);
        response.sendRedirect("");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
