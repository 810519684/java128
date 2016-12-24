package org.project.controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.project.model.User;
import org.project.service.userservice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller
public class UserController {
	
	@Resource
	private userservice userservice;
	
	@RequestMapping("/userList.html")
	public String userList(){
		
		System.out.println("进入userlist页面了");
		
		
		return "userList";
	}
	
@RequestMapping("/otherUserLogin.html")
public String otherUserLogin(){
	System.out.println("进入其他页面登录");
	
	return "login";
}
	
@RequestMapping("/updateUser.html")
public String  updateUser(HttpServletRequest request,HttpSession session){
	
	String username=request.getParameter("userName"); 
	
	System.out.println("获取到的用户名是："+username);
	
	
	//获取到session里面的名字
	String userName=(String)session.getAttribute("userName");
	
	session.setAttribute("userName", userName);
	
	System.out.println("进入到更新用户的页面了");
	
	session.setAttribute("username", username);
	
	return  "updateUser";
}

//查询当前当前用户
@RequestMapping("modifyUserpassword.html")
public String getUserByUserByUserName(HttpSession session,User user){
	//获取当前用户名
	String userName=(String)session.getAttribute("userName");
	
	user.setUserName(userName);
	
	//根据用户名查出用户信息先要查询出来用户信息
	
	
User users=userservice.getUserByuserName(user.getUserName());
//获取到第一个user的用户信息
	
	System.out.println("获取到的user的信息"+users);
	
	
	return "updateUserPassword";
}


//修改用户
@RequestMapping("/Userpassword.html")
public String modifyUser(HttpSession session,User user,HttpServletRequest request){
	//修改用户前，需要查找该名字的用户
	System.out.println("进入到修改密码提交的页面");
	//将密码set到user里面
	user.setUserPassword(request.getParameter("userPassword"));
	
	String username=(String) session.getAttribute("username");
	//把usernameset到user里面
	user.setUserName(username);
	System.out.println("获取到的user信息："+user);
	
	//需要查到
	userservice.UpdatetUser(user);
	
	
	
	
	return "login";
}


//ajax的校验两次密码是否一样
@RequestMapping(value="checkPassword" ,method=RequestMethod.POST)
@ResponseBody
public String CheckPassword(String userPassword,String newUserPassword){
	
	String error="";
	
	System.out.println("进入密码校验的功能"); 
	
	System.out.println("获取到的两次的密码" +userPassword+"和"+newUserPassword);

	
	if(userPassword.equals(newUserPassword)){
		
		error="2";
		
	}else{
		
		error="1";
		
	}
	
	System.out.println("返回的值"+error);
	
	return error;
}

@RequestMapping("deleteUser.html")
public String DeleteUser(HttpSession session,User user){
	System.out.println("进入删除用户功能模块");
	
	String userName =(String)session.getAttribute("userName");
	
	user.setUserName(userName);
	
	userservice.deleteUserByuserName(user);
	
	
	return "login";
}



}
