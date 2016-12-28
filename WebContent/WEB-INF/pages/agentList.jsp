<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
恭喜<%=session.getAttribute("userName") %>进入代理商管理系统
<ul>
<ui><a href="applayKeyWord.html">关键词申请</a></ui>
<ui><a href="agentUser.html">代理商客户管理</a></ui>
<ui><a href="#">代理商预付款</a></ui>
<ui><a href="KeyManagement.html">关键词申请管理</a></ui>
<ui><a href="#">操作日志</a></ui>



</ul>

</body>
</html>