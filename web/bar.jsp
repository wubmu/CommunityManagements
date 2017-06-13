<%@ page import="com.cm.dao.AdminDao" %>
<%@ page import="com.cm.dao.impl.AdminDaoImpl" %>
<%@ page import="com.cm.bean.Customer" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 吴亚斌
  Date: 2017/6/10
  Time: 17:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    int currPage = 1;
    if (request.getParameter("page")!=null){
        currPage = Integer.parseInt(request.getParameter("page"));
    }
    AdminDao selectDao = new AdminDaoImpl();
    List<Customer> userList = selectDao.limtFind(currPage);
    request.setAttribute("list",userList);
    int pages;
    int count = selectDao.getTotalRecored();
    if (count % 6 == 0) {
        pages = count / 6;
    } else {
        pages = count / 6 + 1;
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= pages; i++) {
        if (i==currPage){
            sb.append(i);
        }else {
            request.setAttribute("page",i);
            sb.append("<a href=\"limltsel.jsp?page="+i+"\">"+i+"</a>");
        }
        sb.append(" ");
       request.getRequestDispatcher("limltsql.jsp").forward(request,response);
    } System.out.println("sb = " + sb);
    request.setAttribute("bar",sb.toString());
%>
</body>
</html>
