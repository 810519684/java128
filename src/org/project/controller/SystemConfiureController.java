package org.project.controller;

import javax.annotation.Resource;

import org.project.service.userservice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SystemConfiureController {
	
	@Resource
	private userservice userservice;
	
	@RequestMapping("/systemMangement.html")
	public String userList(){
		
		System.out.println("进入系统管理页面了");
		
		
		return "systemMangement";
	}
	
	@RequestMapping("agentUserMangement.html")
	public String agentUserMangement(){
		System.out.println("欢迎进入代理商用户管理");
				
		
		return "agentUserMangement";
	}
	
	
}
