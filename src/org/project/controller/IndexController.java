package org.project.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.project.model.User;
import org.project.service.userservice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	
	@Resource
	private userservice userservice;
	
	
	@RequestMapping("/index.html")
    public String index(){
		
		
		return "index";
	}
	
	@RequestMapping("/register.html")
	public String register(){
		System.out.println("恭喜你进入注册页面页面。");
		
		return "register";
	}
	

	@RequestMapping(value="exit.html",method=RequestMethod.GET)
	public String exit(){
		
		System.out.println("进入进来了");
		
		return "exit";
	}
	
	@RequestMapping("/login.html")
	public String login(){
		System.out.println("进入登录功能页面了！");
		
		return "login";
	}
	
	
	
	
	
	
	
	@RequestMapping("loginsuccess.html")
	public ModelAndView loginsuccess(User user,HttpServletRequest request,HttpSession session){
		//需要查询数据比对用户信息
		
		boolean tag=false;
	
		
		System.out.println("获取到的roleId是："+request.getParameter("userTarget"));
		
		user.setRoleId(Integer.parseInt(request.getParameter("userTarget")));
		//将获取到的用户名存到sesseion里面
		session.setAttribute("userName", user.getUserName());
	
	
		//user.setRoleId(roleId);
		user.setCreationTime(new Date());
		user.setUserCode("1");
		
		session.setAttribute("username", user.getUserName());
		
	   List<User> list= userservice.findUserList();
		
		for (User user2 : list) {
			if(user.getUserName().equals(user2.getUserName())&&user.getUserPassword().equals(user2.getUserPassword()))
			{
				//如果里面用户和密码对的话，tag赋值为true。
				tag=true;
				
				
				//
				
			}
			else {
					
			}
		
			
			
		}
		
		
	if(tag)	{
		
		return new ModelAndView("loginsuccess");
		
	}else{
		return new ModelAndView("loginError");
		
	}
		
		 
		
	}
	
@RequestMapping(value="/xmlajax",method=RequestMethod.POST)
@ResponseBody
public String regsuccess(User user,HttpServletResponse response,HttpServletRequest request) throws IOException{
	
	int tag=0;
	int tag1=0;
	
	System.out.println("进入提交页面");
	String error = "";
	
    //遍历一下数据库的所用用户
	List<User> userlist=userservice.findUserList();
	
	for (User user2 : userlist) {
		
		if(user.getUserName().equals(user2.getUserName())){
		
//			out.print("对不起，此用户已经存在");
			
			
			tag=1;
			
			
		}else{
		
//			out.print("此用户名可以用");
	      tag1=1;
		 
		}
		
		
		
	}
	
	if(tag==1&&tag1!=-1){
		error="1";
		System.out.println("此用户可以用");
		 
		
	}
	else{
		error = "2";
		
		System.out.println("对不起，此用户已经存在");
		
	
		
		
	}
	
	
	
	return error;
	
   
//	return new ModelAndView("regsuccess");
}	
	
@RequestMapping("regsuccess")
public String commit(User user){
	
	System.out.println("进入表单提交功能！");
	
	
	userservice.InsertUser(user); 
	
	
	
	
	
	
	return "regsuccess";
}







	
}
