<%@ page import="com.cm.bean.Admin" %>
<%@ page import="com.cm.dao.AdminDao" %>
<%@ page import="com.cm.dao.impl.AdminDaoImpl" %>
<%@ page import="com.cm.bean.Customer" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 吴亚斌
  Date: 2017/6/5
  Time: 21:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
用户插入
<form method="post" action="servlet/insertServlet">
    姓名<input type="text" name="name">
    密码<input type="text" name="password">
    性别<input type="radio" name="sex" value="男">
        <input type="radio" name="sex" value="女">
    身份证<input type="text" name="id">
    地址<input type="text" name="address">
    电话:<input type="tel" name="tel">
    <input type="submit" value="提交">
</form>
<form action="servlet/InsertMessage" method="post">
    标题<input type="text" name="title">
    正文<textarea name="body"></textarea>
    发布人<input type="text" name="publisher">
    <input type="submit" value=发布>
</form>
<%
    AdminDao dao = new AdminDaoImpl();
    List<Customer> list=dao.limtFind(1);
    for (Customer c:list){
        System.out.println(c.toString());
    }
%>
</body>
</html>
