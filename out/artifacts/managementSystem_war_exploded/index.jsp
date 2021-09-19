<%--
  Created by IntelliJ IDEA.
  User: hh176
  Date: 2020/12/13
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1, user-scalable=no">
  <title>用户中心</title>
  <link href="bootstrap-3.3.5-dist/css/bootstrap.min.css" title="" rel="stylesheet" />
  <link title="" href="css/style.css" rel="stylesheet" type="text/css"  />
  <link title="blue" href="css/dermadefault.css" rel="stylesheet" type="text/css"/>
  <link title="green" href="css/dermagreen.css" rel="stylesheet" type="text/css" disabled="disabled"/>
  <link title="orange" href="css/dermaorange.css" rel="stylesheet" type="text/css" disabled="disabled"/>
  <link href="css/templatecss.css" rel="stylesheet" title="" type="text/css" />
  <script src="script/jquery-1.11.1.min.js" type="text/javascript"></script>
  <script src="script/jquery.cookie.js" type="text/javascript"></script>
  <script src="bootstrap-3.3.5-dist/js/bootstrap.min.js" type="text/javascript"></script>
  <style type="text/css">
    #bg{
      background-image: url("img/cjwl.jpg");
      background-size: 100%,100%;
      background-repeat: no-repeat;
    }
  </style>
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
            <a href="#"><span class="sublist-icon glyphicon glyphicon-user"></span><span class="sub-title">修改用户</span></a>
          </li>
          <li>
            <div class="showtitle" style="width:100px;"><img src="img/leftimg.png" />查看用户</div>
            <a href="${pageContext.request.contextPath}/findUserByPageServlet"><span class="sublist-icon glyphicon glyphicon-user"></span><span class="sub-title">查看用户</span></a>
          </li>
        </ul>
      </div>
    </div>
  </div>
  <div id="bg" class="right-product my-index right-full">
    <div class="container-fluid">
      <div class="info-center">

        <!---title----->
        <div class="info-title">
          <div class="pull-left">
            <h4><strong>上午好！${manager.username}</strong></h4>
            <p>欢迎登录系统！<span>您上次的登陆时间：<strong> ${lastTime} </strong></span></p>
          </div>
          <div class="time-title pull-right">
            <div class="pull-left">
              <img src="img/zhang.jpg" alt="文理学院" style="width: 85px ;height: 70px"/>
            </div>
            <div class="year-month pull-left">
              <p ><strong id="date">星期二</strong></p>
              <p><span id="year">2016年8月23日</span></p>
            </div>
            <div class="hour-minute pull-right">
              <strong id="time">9:00</strong>
            </div>
          </div>
          <div class="clearfix"></div>
        </div>
        <!----content-list---->
        <div class="content-list">
          <div class="row">
            <div class="col-md-3">
              <div class="content">
                <div class="w30 left-icon pull-left">
                  <span class="glyphicon glyphicon-file blue"></span>
                </div>
                <div class="w70 right-title pull-right">
                  <div class="title-content">
                    <p><strong>高层管理</strong></p>
                    <h3 class="number"><strong>7</strong></h3>
                    <button class="btn btn-default">常驻管理<span style="color:red;">1</span></button>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-3">
              <div class="content">
                <div class="w30 left-icon pull-left">
                  <span class="glyphicon glyphicon-file violet"></span>
                </div>
                <div class="w70 right-title pull-right">
                  <div class="title-content">
                    <p>公司员工</p>
                    <h3 class="number">32</h3>
                    <button class="btn btn-default">外籍员工<span style="color:red;">24</span></button>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-3">
              <div class="content">
                <div class="w30 left-icon pull-left">
                  <span class="glyphicon glyphicon-file orange"></span>
                </div>
                <div class="w70 right-title pull-right">
                  <div class="title-content">
                    <p>内部福利</p>
                    <h3 class="number">10</h3>
                    <button class="btn btn-default">自我提升<span style="color:red;">5</span></button>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-3">
              <div class="content">
                <div class="w30 left-icon pull-left">
                  <span class="glyphicon glyphicon-file green"></span>
                </div>
                <div class="w70 right-title pull-right">
                  <div class="title-content">
                    <p>所有订单</p>
                    <h3 class="number">6</h3>
                    <button class="btn btn-default">我的订单<span style="color:red;">3</span></button>
                  </div>
                </div>
              </div>
            </div>
          </div>
              <div class=" panel panel-default" style="margin-left: 500px; margin-top: 80px; width: 400px">
                <div class="panel-heading" >
                  我的事务
                  <a id="tiao" href="javascript:void(0);" ><span class="glyphicon glyphicon-refresh">  点我试试？</span></a>
                </div>
                <div id="go" class="panel-body" >
                  我的征途是星辰大海
                </div>
              </div>
        </div>

      </div>
    </div>
  </div>
</div>
<script type="text/javascript">
  document.getElementById("tiao").onclick=function(){
    this.innerText="学习？学个屁！";
    document.getElementById("go").innerHTML="<a href='https://www.bilibili.com/'>点我去刷B站</a>";
  }

  setInterval(function () {
    var date = new Date();
    var weekday=new Array("星期天","星期一","星期二","星期三","星期四","星期五","星期六")
    document.getElementById("year").innerText=date.toLocaleDateString();
    document.getElementById("date").innerText=weekday[date.getDay()];
    document.getElementById("time").innerText=(date.getHours()<10?"0"+date.getHours():date.getHours())+":"+(date.getMinutes()<10?"0"+date.getMinutes():date.getMinutes())+":"+(date.getSeconds()<10 ? "0"+date.getSeconds() : date.getSeconds());
  },1000)

  $(function(){
    /*换肤*/
    $(".dropdown .changecolor li").click(function(){
      var style = $(this).attr("id");
      $("link[title!='']").attr("disabled","disabled");
      $("link[title='"+style+"']").removeAttr("disabled");

      $.cookie('mystyle', style, { expires: 7 }); // 存储一个带7天期限的 cookie
    })
    var cookie_style = $.cookie("mystyle");
    if(cookie_style!=null){
      $("link[title!='']").attr("disabled","disabled");
      $("link[title='"+cookie_style+"']").removeAttr("disabled");
    }
    /*左侧导航栏显示隐藏功能*/
    $(".subNav").click(function(){
      /*显示*/
      if($(this).find("span:first-child").attr('class')=="title-icon glyphicon glyphicon-chevron-down")
      {
        $(this).find("span:first-child").removeClass("glyphicon-chevron-down");
        $(this).find("span:first-child").addClass("glyphicon-chevron-up");
        $(this).removeClass("sublist-down");
        $(this).addClass("sublist-up");
      }
      /*隐藏*/
      else
      {
        $(this).find("span:first-child").removeClass("glyphicon-chevron-up");
        $(this).find("span:first-child").addClass("glyphicon-chevron-down");
        $(this).removeClass("sublist-up");
        $(this).addClass("sublist-down");
      }
      // 修改数字控制速度， slideUp(500)控制卷起速度
      $(this).next(".navContent").slideToggle(300).siblings(".navContent").slideUp(300);
    })
    /*左侧导航栏缩进功能*/
    $(".left-main .sidebar-fold").click(function(){

      if($(this).parent().attr('class')=="left-main left-full")
      {
        $(this).parent().removeClass("left-full");
        $(this).parent().addClass("left-off");

        $(this).parent().parent().find(".right-product").removeClass("right-full");
        $(this).parent().parent().find(".right-product").addClass("right-off");

      }
      else
      {
        $(this).parent().removeClass("left-off");
        $(this).parent().addClass("left-full");

        $(this).parent().parent().find(".right-product").removeClass("right-off");
        $(this).parent().parent().find(".right-product").addClass("right-full");

      }
    })

    /*左侧鼠标移入提示功能*/
    $(".sBox ul li").mouseenter(function(){
      if($(this).find("span:last-child").css("display")=="none")
      {$(this).find("div").show();}
    }).mouseleave(function(){$(this).find("div").hide();})
  })
</script>
</body>
</html>
