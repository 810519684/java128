<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <script type="text/javascript" src="js/jquery-1.8.3.min.js">
</script>   
  <script type="text/javascript">
  
  
 $(document).ready(function(){
	 
$("#newUserPassword").blur(function(){
	var value=$(this).val();
	var value1=$("#userPassword").val();

	if(value==""){
		
		alert('请输入新密码');
		return false;
		
	}
	$.ajax({
		url:"checkPassword",
		type:"post",
		data:{"userPassword":value,"newUserPassword":value1},
		success:function(result){
			alert(result);
		if(result=="1"){
			alert("用户的两次密码输入不一致");
			$("#newUserPassword").css("border-color","red");
			
			
			
		}else{
			
			alert("密码可用");
			$("#newUserPassword").css("border-color","green");
			
		}
		
			
			
		},
    error :function(xhr,strStatus,strErr){
			
			alert(strError);
			
		},
		
		
	});
	
	
	
	
	
})	 
	 
	 
 }); 
  
  
  
  
 </script>  





<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>恭喜你进入修改用户密码页面</h1>

<form action="Userpassword.html" method="post">
<table>
<tr>   
<td>用户名：</td>
<td><input name="userName" value=<%=session.getAttribute("userName") %> type="text" /></td>

</tr>

<tr>   
<td>输入密码：</td>
<td><input name="userPassword" id="userPassword" type="password" /></td>

</tr>

<tr>   
<td>请再次输入密码：</td>
<td><input name="newUserPassword" id="newUserPassword" type="password" /></td>

</tr>

<tr>   

<td colspan="2"><input  type="submit" value="修改"/></td>

</tr>
<tr>   

<td colspan="2"><input  type="button" value="取消" onclick="window.location.href='index.jsp'"/></td>

</tr>


</table>





</form>





</body>
</html>