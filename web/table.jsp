<%@ page import="java.util.List" %>
<%@ page import="com.cm.bean.Customer" %><%--
  Created by IntelliJ IDEA.
  User: 吴亚斌
  Date: 2017/6/10
  Time: 20:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="css/table.css"/>
</head>
<body>
<%
    List<Customer> list= (List<Customer>) request.getAttribute("list");
%>

</body>
<form action="" method="post" class="STYLE-NAME">
    <h1>Contact Form
        <span>Please fill all the texts in the fields.</span>
    </h1>
    <label>
        <span>Your Name :</span>
        <input id="name" type="text" name="name" placeholder="Your Full Name" />
    </label>
    <label>
        <span>Your Email :</span>
        <input id="email" type="email" name="email" placeholder="Valid Email Address" />
    </label>
    <label>
        <span>Message :</span>
        <textarea id="message" name="message" placeholder="Your Message to Us"></textarea>
    </label>
    <label>
        <span>Subject :</span><select name="selection">
        <option value="Job Inquiry">Job Inquiry</option>
        <option value="General Question">General Question</option>
    </select>
    </label>
    <label>
        <span>&nbsp;</span>
        <input type="button" class="button" value="Send" />
    </label>
</form>
</html>
