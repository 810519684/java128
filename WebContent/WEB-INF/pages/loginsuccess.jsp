<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery-1.8.3.min.js">






</script>




<title>Insert title here</title>

<style type="text/css">
.one{
border: 1 px solid ;

margin: 2px;



width: 80%;
height: 80%;

}



</style>

</head>


<body>
<a href="exit.html">退出页面</a>
<div>
<span>welcome ,${user.id},${user.userName}</span>


<div class="one">

<tr>  
<%-- <td><a href="updateUser.html?userName=${user.userName }&id=${user.id}">用户登录修改注销</a></td>
<td><a href="userList.html"> 查看用户明细 </a></td>
<td><a href="agentList.html"> 代理商管理</a></td>
<td><a href="reportMangement.html">报表管理 </a></td>
<td><a href="systemMangement.html"> 系统管理</a></td>
<td><a href="systemConfigure.html"> 系统配置管理</a></td> --%>
<div id="one" style="float: left"><a href="updateUser.html?userName=${user.userName }&id=${user.id}"><img alt="用户管理" src="statics/gw.png"></a>
</div>
<div id="two" style="float: left"><a href="userList.html"><img alt="查看用户明细" src="statics/xz.png"></a></div>
<div id="three"style="float: left"><a href="agentList.html"><img alt="代理商管理" src="statics/lt.png"></a></div><br/>
<div id="four" style="float: left"><a href="reportMangement.html"><img alt="报表管理" src="statics/lw.png"></a></div>
<div id="five" style="float: left"><a href="systemMangement.html"><img alt="系统管理" src="statics/sb.png"></a></div>
<div id="six" style="float: left"><a href="systemConfigure.html"><img alt="系统配置管理" src="statics/zx.png"></a></div>






</tr>
</div>

</div>





</body>
</html>