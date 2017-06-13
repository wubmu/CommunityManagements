<%@ page import="com.cm.bean.Customer" %>
<%@ page import="com.cm.dao.CustomerDao" %>
<%@ page import="com.cm.dao.impl.CustomerDaoImpl" %>
<%@ page import="com.cm.bean.Message" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/10
  Time: 18:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新闻</title>
</head>

<jsp:include page="head.jsp"></jsp:include>
<body  background="img/bigbackground.jpg">
<center>
    <%
        CustomerDao dao=new CustomerDaoImpl();
        Message message=dao.findMessage(request.getParameter("title"));
    %>
<h1 font-size:large><%=message.getTitle()%></h1>
<p></p>
<p>发布时间<%=message.getDate()%></p>
<p>发布人 ：<%=message.getPublister()%></p>
    <div style="margin-left: 459px;margin-right:459px">
    <p>&nbsp;&nbsp;<%=message.getBody()%>
    </div>
</center>
</body>
</html>
