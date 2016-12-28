<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">

$(document).ready(function(){
$("#preRegDatetime").blur(function(){
var value=$(this).val();
var value2=value.split("-");
if(value2[0].length==4&&value2[1].length==2&&value2[2].length==2){
	
	$("#preRegDatetime").css("border-color","green");
	alert("输入合法");
	return true;
	
}
else{
	
	alert("输入格式不合法");
	return false;
	
}


})



}) ;


	

	






</script>



<title>Insert title here</title>
</head>
<body>
欢迎<%=session.getAttribute("userName") %>进入关键词申请功能

<form name="form2" action="keyWordsSubmit.html" method="post" >

<table width="50%" border="1" bordercolorlight="#000000" bordercolordark="#FFFFFF" bgcolor="#CCFFCC" cellpadding="4" align="left">
<tr> 
<td colspan="2"> <div align="center"><b>关键词申请</b></div> </td>
</tr>


<tr> 
<td>keywords： <input type="text" name="keywords" size="8">请输入关键字 </td>
<td>agentId: <input type="text" name="agentId" size="10" maxlength="100%">请输入整数 </td>
</tr>

<tr> 
<td>agentName： <input type="text" name="agentName" size="8"> 代理商名字</td>
<td>customId: <input type="text" name="customId" size="10" maxlength="100%">请输入整数 </td>
</tr>
 <tr> 
<td>customName：<input type="text" name="customName"/>用户名字 </td>
<td>preRegFrozenMoney: <input type="number"  required=true  value=0 name="preRegFrozenMoney" /> </td>
</tr>

 <tr> 
<td>price： <input type="text" name="price" required=true value=0 size="8">请输入价格 </td>
<td>productType: <input type="text" name="productType" size="10" maxlength="100%"> 产品类型</td>
</tr>

<tr> 
<td>serviceYears： <input type="text" name="serviceYears" size="8"> 请输入整数</td>
<td>openApp: <input type="text" name="openApp" size="10" maxlength="100%"> <span style="text-align: center">0未开通 1 开通</span></td>
</tr>

<tr> 
<td>appUserName： <input type="text" name="appUserName" size="8"> </td>
<td>appPassword: <input type="text" name="appPassword" size="10" maxlength="100%"> </td>
</tr> 

 <tr> 
<td>loginUrl： <input type="text" name="loginUrl" size="8"> 登陆地址</td>
<td>iosDownloadUrl: <input type="text" name="iosDownloadUrl" size="10" maxlength="100%">ios客户端下载地址 </td>
</tr>


 <tr> 
<td>androidDownloadUrl： <input type="text" name="androidDownloadUrl" size="8">android客户端下载地址 </td>
<td>codeIosUrl: <input type="text" name="codeIosUrl" size="10" maxlength="100%"> </td>
</tr>



<tr> 
<td>codeAndroidUrl： <input type="text" name="codeAndroidUrl" size="8"> </td>
 <td>preRegDatetime: <input type="date" id="preRegDatetime" name="preRegDatetime" value="2015-12-31" size="10" maxlength="100%">输入格式"yyyy-MM-dd" </td>
</tr>


<tr> 
<td>preRegPassDatetime： <input type="date" id="preRegPassDatetime" name="preRegPassDatetime" value="2015-12-01" size="8">输入格式"yyyy-MM-dd" </td> 
<td>regDatetime: <input type="date" id="regDatetime" name="regDatetime" size="10" value="2016-12-01" maxlength="100%">输入格式"yyyy-MM-dd" </td>
</tr>


<tr> 
<td>regPassDatetime： <input id="regPassDatetime" type="date"  name="regPassDatetime" value="2016-12-01">输入格式"yyyy-MM-dd"</input> </td>  
 <td>isPass: <input type="text" name="isPass" size="10" maxlength="100%">0为不过期，1为预注册过期，2为正式注册过期 </td>
</tr>


<tr> 
<td>checkStatus： <input type="text" name="checkStatus" size="8">0为已申请 1为审核中 2为已通过 3未通过 </td>
<td>isUse: <input type="text" name="isUse" size="10" maxlength="100%">1为已用，0为未用 </td>
</tr>

<tr> 
<td colspan="2"> <div align="center">备注<br> <textarea name="note" cols="100" rows="3"></textarea>
</div>
</td>
</tr>


<tr> 
<td> <div align="right"> <input type="submit" name="Submit" value="提 交"> </div> </td>
<td> <input type="reset" name="Submit2" value="重 写"> </td>



</tr>

</table>
</form>

</body>
</html>