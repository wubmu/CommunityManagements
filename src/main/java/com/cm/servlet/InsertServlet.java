package com.cm.servlet;

import com.cm.bean.Admin;
import com.cm.bean.Customer;
import com.cm.dao.AdminDao;
import com.cm.dao.impl.AdminDaoImpl;
import com.cm.exception.UserExistException;
import com.cm.util.WebUtil;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

/**
 * Created by 吴亚斌 on 2017/6/5.
 */
@WebServlet( name ="InsertServlet",urlPatterns = "/servlet/insertServlet")
public class InsertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        Customer customer= WebUtil.fillBean(request,Customer.class);
        AdminDao dao=new AdminDaoImpl();
      // boolean exist=dao.findByName(customer.getName());
        dao.save(customer);
        request.setAttribute("customer",customer);
        request.getRequestDispatcher("customer.jsp").forward(request,response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

}
