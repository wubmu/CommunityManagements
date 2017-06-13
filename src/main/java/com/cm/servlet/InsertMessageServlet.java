package com.cm.servlet;

import com.cm.bean.Message;
import com.cm.dao.AdminDao;
import com.cm.dao.impl.AdminDaoImpl;
import com.cm.util.WebUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 吴亚斌 on 2017/6/6.
 */
@WebServlet(name = "InsertMessageServlet",urlPatterns = "/servlet/InsertMessage")
public class InsertMessageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        Message message= WebUtil.fillBean(request,Message.class);
        Date date=new Date();
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        String date1=df.format(date);
        message.setDate(date1);
        AdminDao dao=new AdminDaoImpl();
        dao.insertMessage(message);
        System.out.print(message.toString());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
