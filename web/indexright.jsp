<%@ page import="com.cm.dao.AdminDao" %>
<%@ page import="com.cm.bean.Customer" %>
<%@ page import="com.cm.dao.CustomerDao" %>
<%@ page import="com.cm.dao.impl.CustomerDaoImpl" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/10
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文澜小区</title>
    <link type="text/css" href="css/main.css" rel="stylesheet">
</head>
<body>
<div id="right">
    <div id="rightone">
        <p>
            您当前的位置<strong>文澜小区</strong><br>
            本小区西倚二龙山，南临汾河水，毗邻太原名胜窦大夫祠，青山碧水，风景旖旎，“龙山飞瀑，柏林冬色”，
            龙山公园、柏林园（太原市2所四星级公园之一）是小区内最大的两处公园，龙山的桃花、小区的樱花，
            柏林园的长廊都已成为本小区的标志。
        </p>
    </div>
    <div id="righttwo">
        <%
            CustomerDao dao=new CustomerDaoImpl();
            List<String> titlelist=dao.findAllTitle();
            for (String title: titlelist){
        %>
        <a href="message1.jsp?title=<%=title%>"></a>
        <%}%>
    </div>
    <div id="rightthree">3</div>
    <div id="rightfour">
        <p>文澜小区的地图</p>
        <div>
            下图的红点是文澜小区在太原百度地图的具体位置，地图可以拖动，双击放大
            <iframe width="604" height="365" frameborder="0" scrolling="no" marginheight="0" marginwidth="0"
                    src="http://j.map.baidu.com/c4dtI"></iframe>
        </div>
    </div>
</div>

</body>
</html>
