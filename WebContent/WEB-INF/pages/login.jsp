<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<title>代理商管理系统</title>


<style>
*{
	padding:0px;
	margin:0px;
	}
    a{color:White}
body{
	font-family:Arial, Helvetica, sans-serif;
	background:url(http://keleyi.com/keleyi/phtml/divcss/21/images/grass.jpg) no-repeat  center;
	font-size:13px;    
	}
img{
	border:0;
	}
.lg{width:468px; height:468px; margin:100px auto; background:url(http://keleyi.com/keleyi/phtml/divcss/21/images/login_bg.png) no-repeat;}
.lg_top{ height:200px; width:468px;}
.lg_main{width:400px; height:180px; margin:0 25px;}
.lg_m_1{
	width:290px;
	height:100px;
	padding:60px 55px 20px 55px;
}
.ur{
	height:37px;
	border:0;
	color:#666;
	width:236px;
	margin:4px 28px;
	background:url(http://keleyi.com/keleyi/phtml/divcss/21/images/user.png) no-repeat;
	padding-left:10px;
	font-size:16pt;
	font-family:Arial, Helvetica, sans-serif;
}
.pw{
	height:37px;
	border:0;
	color:#666;
	width:236px;
	margin:4px 28px;
	background:url(http://keleyi.com/keleyi/phtml/divcss/21/images/password.png) no-repeat;
	padding-left:10px;
	font-size:16pt;
	font-family:Arial, Helvetica, sans-serif;
}
.bn{width:330px; height:72px; background:url(http://keleyi.com/keleyi/phtml/divcss/21/images/enter.png) no-repeat; border:0; display:block; font-size:18px; color:#FFF; font-family:Arial, Helvetica, sans-serif; font-weight:bolder;}
.lg_foot{
	height:80px;
	width:330px;
	padding: 6px 68px 0 68px;
}
</style>
</head>



<body class="b">
<div style="float: right;"><a href="register.html">注册用户</a></div>
<div class="lg">
<div align="center"><h1>用户登录</h1></div>
<form action="loginsuccess.html" method="POST">
    <div class="lg_top"></div>
    <div class="lg_main">
        <div class="lg_m_1">
        
        <input name="userName" value="hovertree" class="ur" />
        <input name="userPassword" type="password" value="keleyi.com" class="pw" />
      <div class="b" align="center">  
     <!--  <select>
        <option name="userTarget" value="1">管理员</option>
        <option name="userTarget" value=2>代理商用户</option>
        <option name="userTarget" value=3>内部用户</option>
        </select > -->
        <input type="radio" name="userTarget" checked="checked" value=1>管理员</input>
        <input type="radio" name="userTarget" value=2>代理上用户</input>
        <input type="radio" name="userTarget" value=3>内部员工</input>
       
        </div>
        </div>
    </div>
    <div class="lg_foot">
    <input type="submit" value="点这里登录" class="bn" /></div>
</form
>
</div>
<div style="text-align:center;">
<p><a href="http://keleyi.com/">首页</a> <a href="http://keleyi.com/keleyi/phtml/">特效库</a> <a href="http://keleyi.com/a/bjae/6asac24d.htm">原文</a></p>
</div>
</body>
</html>