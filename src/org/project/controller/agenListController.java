package org.project.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.project.model.KeyWords;
import org.project.service.KeyWordsSerivce;
import org.project.service.userservice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class agenListController {
	
	@Resource
	private userservice userservice;
	
	@Resource 
	private KeyWordsSerivce keyWordsSerivce;
	
	
	@RequestMapping("/agentList.html")
	public String agentList(HttpSession session){
		
		System.out.println("进入agentList页面了");
		//获取到用户名字
		String userName=(String)session.getAttribute("userName");
		
		
		
		
		return "agentList";
	}
	
	
@RequestMapping("/applayKeyWord.html")
public String applayKeyWords(){
	System.out.println("进入关键词申请");
	
	
	
	return "applayKeyWord";
}
//关键词表单的提交功能

@RequestMapping(value="/keyWordsSubmit.html",method=RequestMethod.POST)
public String keyWordsSubmit(@ModelAttribute KeyWords keywords){
	
	System.out.println("进入关键词表单提交功能");
	
	System.out.println("获取到的时间："+keywords);
	
	keyWordsSerivce.insertKeyWord(keywords);
	
	
	
	return "agentList";
	
}
	
	
	
	
	
	@RequestMapping("/agentUser.html")
	public String agentUserMangent(){
		System.out.println("进入客户管理"); 
		
		
		
		return "agentUserOpera";
	}
	
	@RequestMapping("/KeyManagement.html")
	public String keyMangement(){
		
		System.out.println("进入关键词申请管理");
		 
		
		
		return "KeyManagement";
	}
	
	
	
}
