package org.project.controller;

import javax.annotation.Resource;

import org.project.service.userservice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class agenListController {
	
	@Resource
	private userservice userservice;
	
	@RequestMapping("/agentList.html")
	public String agentList(){
		
		System.out.println("进入agentList页面了");
		
		
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
