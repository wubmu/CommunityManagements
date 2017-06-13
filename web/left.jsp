<%@ page import="com.cm.bean.Admin" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/10
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文澜小区</title>
    <link type="text/css" href="css/main.css" rel="stylesheet">
</head>
<body>
<div id="left">
    <div id="leftone">
       <strong>个人信息查询入口</strong>
        <ul>
            <li>
                <a href="figerselect.jsp" target="show2">根据门牌号查询用户信息</a>
            </li>
            <li>
                <a href="nameselect.jsp" target="show2">根据姓名查询用户信息</a><br>
            </li>
            <li>
                <a href="infomation.jsp" target="show2">用户缴费情况</a><br>
            </li>
        </ul>
    </div>

    <div id="lefttwo">
        <strong>联系方式</strong>

            <ul>
                <b>文澜小区</b>
                <li>小区地址：山西省太原市尖草坪区中北大学</li>
                <li>固定电话：000000</li>
                <li>联系人：未提供</li>
            </ul>
        </div>

    <div id="leftthree">
        <strong>友情链接</strong>
        <ul>
            <li>
                <a href="http://www.wal-martchina.com/" title="沃尔玛（中国）有限公司" target="show2">沃尔玛（中国）有限公司</a>
            </li>
            <li>
                <a href="http://www.11467.com/taiyuan/co/19621.htm" title="山西德克士食品有限公司" target="show2">山西德克士食品有限公司</a>
            </li>
            <li>
                <a href="http://z.xywy.com/yiyuan-sxzyy.htm" title="山西省中医院" target="show2">山西省中医院</a>
            </li>
            <li>
                <a href="http://www.nuc.edu.cn/" title="中北大学" target="show2">中北大学</a>
            </li>
            <li>
                <a href="http://www2015.tyut.edu.cn/cn/index.html" title="太原理工大学" target="show2">太原理工大学</a>
            </li>
            <li>
                <a href="figerselect.jsp"></a>
            </li>
        </ul>
    </div>
</div>
</body>
</html>
