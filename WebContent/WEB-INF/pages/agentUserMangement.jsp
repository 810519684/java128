<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
欢迎进入代理商用户管理页面
<span>welcome ,<%=session.getAttribute("userName") %></span>
<ul>
<ui><a href="#">添加用户</a></ui>
<ui><a href="#">用户列表</a></ui>
<ui><a href="#">查看用户信息</a></ui>
<ui><a href="#">修改用户信息</a></ui>
<ui><a href="#">查看log日志</a></ui>
<ui><a href="#">查看预付款</a></ui>


</ul>
</body>
</html>