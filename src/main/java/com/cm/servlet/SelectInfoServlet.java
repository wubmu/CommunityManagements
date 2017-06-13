package com.cm.servlet;

import com.cm.bean.Infomation;
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
@WebServlet(name = "SelectInfoServlet")
public class SelectInfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        CustomerDao customerDao=new CustomerDaoImpl();
        String id=request.getParameter("id");
        Infomation infomation=customerDao.findInfomation(id);
        request.setAttribute("info",infomation);
        request.getRequestDispatcher("").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
