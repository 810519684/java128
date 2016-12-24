<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery-1.8.3.min.js">
</script>
<script type="text/javascript">


/*
//验证jquery是否引入进来

if(typeof jQuery!='undefined'){
	alert("jQuery library is loaded!");
	} else{
	alert("jQuery library is not found");

	}

	if(jQuery){  
	 
	   alert("jQuery library is loaded!");
	 
	    }else{
	 
	   alert("jQuery library is not found!");
	 
	   } */


 $(document).ready(function(){
	//失去焦点事件
$("#userName").blur(function(){
var value=$(this).val();

if(value==""){
	
	alert('请输入用户名');
	return false;
	
}


$.ajax({
	url :"xmlajax",
	type :"post",
	data :{"userName":value},
	success :function(data,strStatus,xhr){
		alert(data);
		if(data=="1"){
			alert("对不起，此用户已经存在");
			$("#userName").css("border-color","red");
			
		}else{
			alert("此用户名可以用");
			$("#userName").css("border-color","green");
			
		}
		
		
	},
	error :function(xhr,strStatus,strErr){
		
		alert(strError);
		
	}
	
	
	
});	
	
	
	
})	
	
});

</script>


<title>Insert title here</title>
</head>
<body>
恭喜你进入注册页面

<form action="regsuccess" method="post">
<table>
<tr>   
<td>用户名：</td>
<td><input name="userName" id="userName" type="text" /></td>

</tr>
<tr>   
<td>用户密码：</td>
<td><input name="userPassword" type="password" /></td>

</tr>

<tr>   

<td colspan="2"><input  type="submit" value="确定"/></td>

</tr>
<tr>   

<td colspan="2"><input  type="button" value="取消" onclick="window.location.href='index.jsp'"/></td>

</tr>


</table>





</form>

</body>
</html>