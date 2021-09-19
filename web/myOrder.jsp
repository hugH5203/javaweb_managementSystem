<%--
  Created by IntelliJ IDEA.
  User: hh176
  Date: 2020/12/21
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1, user-scalable=no">
    <title>购买图书</title>
    <link href="bootstrap-3.3.5-dist/css/bootstrap.min.css" title="" rel="stylesheet" />
    <link title="" href="css/style.css" rel="stylesheet" type="text/css"  />
    <link title="blue" href="css/dermadefault.css" rel="stylesheet" type="text/css"/>
    <link title="green" href="css/dermagreen.css" rel="stylesheet" type="text/css" disabled="disabled"/>
    <link title="orange" href="css/dermaorange.css" rel="stylesheet" type="text/css" disabled="disabled"/>
    <link href="css/templatecss.css" rel="stylesheet" title="" type="text/css" />
    <script src="script/jquery-1.11.1.min.js" type="text/javascript"></script>
    <script src="script/jquery.cookie.js" type="text/javascript"></script>
    <script src="bootstrap-3.3.5-dist/js/bootstrap.min.js" type="text/javascript"></script>
</head>

<body>
<nav class="nav navbar-default navbar-mystyle navbar-fixed-top">
    <div class="navbar-header">
        <button class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a href="${pageContext.request.contextPath}/cookieServlet" class="navbar-brand mystyle-brand"><span class="glyphicon glyphicon-home"></span></a></div>
    <div class="collapse navbar-collapse">
        <ul class="nav navbar-nav">
            <li class="li-border"><a class="mystyle-color" href="#">管理控制台</a></li>
            <li class="dropdown li-border"><a href="#" class="dropdown-toggle mystyle-color" data-toggle="dropdown">快捷入口<span class="caret"></span></a>
                <!----下拉框选项---->
                <div class="dropdown-menu topbar-nav-list">
                    <div class="topbar-nav-col">
                        <div class="topbar-nav-item">
                            <p class="topbar-nav-item-title">购物逛街</p>
                            <ul>
                                <li><a href="https://www.taobao.com/">
                                    <span class="glyphicon glyphicon-road"></span>
                                    <span class="">淘宝</span>
                                </a>
                                </li>
                                <li><a href="https://www.jd.com/">
                                    <span class="glyphicon glyphicon-picture"></span>
                                    <span class="">京东</span>
                                </a>
                                </li>
                                <li><a href="https://www.pinduoduo.com/">
                                    <span class="glyphicon glyphicon-gift"></span>
                                    <span class="">拼多多</span>
                                </a>
                                </li>
                            </ul>
                        </div>

                        <div class="">
                            <p class="topbar-nav-item-title">视觉放松</p>
                            <ul>
                                <li><a href="https://v.qq.com/">
                                    <span class="glyphicon glyphicon-road"></span>
                                    <span class="">腾讯视频</span>
                                </a>
                                </li>
                                <li><a href="https://www.iqiyi.com/">
                                    <span class="glyphicon glyphicon-picture"></span>
                                    <span class="">爱奇艺</span>
                                </a>
                                </li>
                                <li><a href="https://www.youku.com/">
                                    <span class="glyphicon glyphicon-gift"></span>
                                    <span class="">优酷</span>
                                </a>
                                </li>
                            </ul>
                        </div>
                    </div>


                    <div class="topbar-nav-col">
                        <div class="topbar-nav-item">
                            <p class="topbar-nav-item-title">游戏之旅</p>
                            <ul>
                                <li><a href="https://lol.qq.com/main.shtml">
                                    <span class="glyphicon glyphicon-road"></span>
                                    <span class="">LOL</span>
                                </a>
                                </li>
                                <li><a href="https://csol.tiancity.com/homepage/event/2020/11/cs201125ztz/city.html">
                                    <span class="glyphicon glyphicon-picture"></span>
                                    <span class="">cs</span>
                                </a>
                                </li>
                                <li><a href="https://www.gov.mo/zh-hant/">
                                    <span class="glyphicon glyphicon-gift"></span>
                                    <span class="">澳门皇家</span>
                                </a>
                                </li>
                            </ul>
                        </div>

                        <div class="">
                            <p class="topbar-nav-item-title">学习进步</p>
                            <ul>
                                <li><a href="https://www.bilibili.com/">
                                    <span class="glyphicon glyphicon-road"></span>
                                    <span class="">哔哩哔哩</span>
                                </a>
                                </li>
                                <li><a href="https://www.xuexila.com/">
                                    <span class="glyphicon glyphicon-picture"></span>
                                    <span class="">xx教育</span>
                                </a>
                                </li>
                                <li><a href="http://www.seedinfo.cn/">
                                    <span class="glyphicon glyphicon-gift"></span>
                                    <span class="">种子大全</span>
                                </a>
                                </li>
                            </ul>
                        </div>

                    </div>

                </div>
            </li>
        </ul>

        <ul class="nav navbar-nav pull-right">
            <li class="li-border">
                <a href="unnessity/message.html" class="mystyle-color">
                    <span class="glyphicon glyphicon-bell"></span>
                    <span class="topbar-num">9</span>
                </a>
            </li>
            <li class="li-border dropdown"><a href="#" class="mystyle-color" data-toggle="dropdown">
                <span class="glyphicon glyphicon-search"></span> 搜索</a>
                <div class="dropdown-menu search-dropdown">
                    <div class="input-group">
                        <input type="text" class="form-control">
                        <span class="input-group-btn">
                   <button type="button" class="btn btn-default">搜索</button>
                </span>
                    </div>
                </div>
            </li>
            <li class="dropdown li-border"><a href="#" class="dropdown-toggle mystyle-color" data-toggle="dropdown">帮助与文档<span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li><a href="#">帮助与文档</a></li>
                    <li class="divider"></li>
                    <li><a href="#">论坛</a></li>
                    <li class="divider"></li>
                    <li><a href="#">博客</a></li>
                </ul>
            </li>
            <li class="dropdown li-border"><a href="#" class="dropdown-toggle mystyle-color" data-toggle="dropdown">1936489510@qq.com<span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li><a href="${pageContext.request.contextPath}/login.jsp">退出</a></li>
                </ul>
            </li>
            <li class="dropdown"><a href="#" class="dropdown-toggle mystyle-color" data-toggle="dropdown">换肤<span class="caret"></span></a>
                <ul class="dropdown-menu changecolor">
                    <li id="blue"><a href="#">蓝色</a></li>
                    <li class="divider"></li>
                    <li id="green"><a href="#">绿色</a></li>
                    <li class="divider"></li>
                    <li id="orange"><a href="#">橙色</a></li>
                </ul>
            </li>
        </ul>
    </div>
</nav>
<div class="down-main">
    <div class="left-main left-full">
        <div class="sidebar-fold"><span class="glyphicon glyphicon-menu-hamburger"></span></div>
        <div class="subNavBox">
            <div class="sBox">
                <div class="subNav sublist-down"><span class="title-icon glyphicon glyphicon-chevron-down"></span><span class="sublist-title">用户中心</span>
                </div>
                <ul class="navContent" style="display:block">
                    <li class="active">
                        <div class="showtitle" style="width:100px;"><img src="img/leftimg.png" />我的空间</div>
                        <a href="mySpace.html"><span class="sublist-icon glyphicon glyphicon-user"></span><span class="sub-title">我的空间</span></a> </li>
                    <li>
                        <div class="showtitle" style="width:100px;"><img src="img/leftimg.png" />内部购买商城</div>
                        <a href="${pageContext.request.contextPath}/findAllBookServlet"><span class="sublist-icon glyphicon glyphicon-envelope"></span><span class="sub-title">内部购买商城</span></a> </li>
                    <li>
                        <div class="showtitle" style="width:100px;"><img src="img/leftimg.png" />我的购物车</div>
                        <a href="${pageContext.request.contextPath}/myOrderServlet"><span class="sublist-icon glyphicon glyphicon-bullhorn"></span><span class="sub-title">我的购物车</span></a></li>
                    <li>
                        <div class="showtitle" style="width:100px;"><img src="img/leftimg.png" />我的设置</div>
                        <a href="${pageContext.request.contextPath}/mySetting.jsp"><span class="sublist-icon glyphicon glyphicon-credit-card"></span><span class="sub-title">我的设置</span></a></li>
                </ul>
            </div>
            <div class="sBox">
                <div class="subNav sublist-up"><span class="title-icon glyphicon glyphicon-chevron-up"></span><span class="sublist-title">用户管理</span></div>
                <ul class="navContent" style="display:none">
                    <li>
                        <div class="showtitle" style="width:100px;"><img src="img/leftimg.png" />添加用户</div>
                        <a href="${pageContext.request.contextPath}/add.jsp"><span class="sublist-icon glyphicon glyphicon-user"></span><span class="sub-title">添加用户</span></a></li>
                    <li>
                        <div class="showtitle" style="width:100px;"><img src="img/leftimg.png" />删除用户</div>
                        <a href="#"><span class="sublist-icon glyphicon glyphicon-user"></span><span class="sub-title">删除用户</span></a></li>
                    <li>
                        <div class="showtitle" style="width:100px;"><img src="img/leftimg.png" />修改用户</div>
                        <a href="#"><span class="sublist-icon glyphicon glyphicon-user"></span><span class="sub-title">修改用户</span></a></li>
                    <li>
                        <div class="showtitle" style="width:100px;"><img src="img/leftimg.png" />查看用户</div>
                        <a href="${pageContext.request.contextPath}/findUserByPageServlet"><span class="sublist-icon glyphicon glyphicon-user"></span><span class="sub-title">查看用户</span></a></li>
                </ul>
            </div>
        </div>
    </div>
<div class="container">
    <h3><strong>${manager.username}您好，以下是您的订单：</strong></h3>
        <table border="1" class="table table-bordered table-hover">
            <tr class="success">
                <th>编号</th>
                <th>书名</th>
                <th>作者</th>
                <th>出版社</th>
                <th>价格</th>
                <th>日期</th>
                <th>图书类型</th>
                <th>操作</th>
            </tr>

            <c:forEach items="${books}" var="book" varStatus="b">
                <tr>
                    <td>${book.bookid}</td>
                    <td>${book.bookName}</td>
                    <td>${book.author}</td>
                    <td>${book.publish}</td>
                    <td>${book.price}</td>
                    <td>${book.pubdate}</td>
                    <td>${book.booktype}</td>
                    <td><a class="btn btn-default btn-sm"
                           href="${pageContext.request.contextPath}/deleteOrderServlet?id=${book.bookid}">删除订单</a>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
