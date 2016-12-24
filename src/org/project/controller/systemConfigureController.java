package org.project.controller;

import javax.annotation.Resource;

import org.project.service.userservice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class systemConfigureController {
	
	@Resource
	private userservice userservice;
	
	@RequestMapping("/systemConfigure.html")
	public String userList(){
		
		System.out.println("进入系统配置管理页面了");
		
		
		return "systemConfigure";
	}
	
	
	
	
}
