package com.cm.servlet;

import com.cm.bean.Customer;
import com.cm.bean.Message;
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
@WebServlet(name = "FindMessageServlet")
public class FindMessageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String title=request.getParameter("title");
        CustomerDao dao=new CustomerDaoImpl();
        Message message=dao.findMessage(title);
        request.setAttribute("title",title);
        request.getRequestDispatcher("").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
