package org.project.controller;

import javax.annotation.Resource;

import org.project.service.userservice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class repoertMangementController {
	
	@Resource
	private userservice userservice;
	
	@RequestMapping("/reportMangement.html")
	public String reportMangement(){
		System.out.println("进入报表管理系统");
		
		return "reportMangement";
	}
	
	
	
	
}
