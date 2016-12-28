<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<span>welcome ,<%=request.getSession().getAttribute("username") %></span>
</head>
<body>
<div>
<ul>
<ui><a href="otherUserLogin.html">其他用户登录</a></ui><br/>
<ui><a href="modifyUserpassword.html">用户账户密码修改</a></ui><br/>
<ui><a href="deleteUser.html">用户注销</a></ui>


</ul>



</div>




</body>
</html>