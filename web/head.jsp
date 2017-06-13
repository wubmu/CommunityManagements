<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/10
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link type="text/css"  href="css/main.css" rel="stylesheet">
    <title>文澜小区</title>
    <meta http-equiv="content-type"content="text/html;charset=utf-8">
    <script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="js/jquery.SuperSlide.2.1.1.js"></script>
    <link href="css/style.css" rel="stylesheet" type="text/css">

</head>
<body body  background="img/bigbackground.jpg">
<div id="nav" style="">
    <img src="img/logo.jpg" alt="logo"/>
    <ul id="nav1">
        <li><a href="#">用户功能</a></li>
        <li><a href="#">物业管理</a></li>
        <li><a href="#">费用管理</a></li>
        <li><a href="#">系统功能</a></li>
    </ul>
</div>
<div class="banner-box">
    <div class="bd">
        <ul>
            <li style="background:#F3E5D8;">
                <div class="m-width">
                    <a href="javascript:void(0);"><img src="img/1.jpg" /></a>
                </div>
            </li>
            <li style="background:#B01415">
                <div class="m-width">
                    <a href="javascript:void(0);"><img src="img/2.jpg" /></a>
                </div>
            </li>
            <li style="background:#C49803;">
                <div class="m-width">
                    <a href="javascript:void(0);"><img src="img/3.jpg" /></a>
                </div>
            </li>
            <li style="background:#FDFDF5">
                <div class="m-width">
                    <a href="javascript:void(0);"><img src="img/4.jpg" /></a>
                </div>
            </li>

        </ul>
    </div>
    <div class="banner-btn">
        <a class="prev" href="javascript:void(0);"></a>
        <a class="next" href="javascript:void(0);"></a>
        <div class="hd"><ul></ul></div>
    </div>
</div>

<script type="text/javascript">
    $(document).ready(function(){

        $(".prev,.next").hover(function(){
            $(this).stop(true,false).fadeTo("show",0.9);
        },function(){
            $(this).stop(true,false).fadeTo("show",0.4);
        });

        $(".banner-box").slide({
            titCell:".hd ul",
            mainCell:".bd ul",
            effect:"fold",
            interTime:3500,
            delayTime:500,
            autoPlay:true,
            autoPage:true,
            trigger:"click"
        });

    });
</script>

<div style="text-align:center;clear:both;">
    <script src="js/gg_bd_ad_720x90.js" type="text/javascript"></script>
    <script src="js/follow.js" type="text/javascript"></script>
</div>
</html>
