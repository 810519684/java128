package org.project.systemInit;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;
import org.project.common.Contstants;
import org.project.model.SystemConfigure;
import org.project.service.SystemConfigSerivce;
import org.springframework.web.context.support.WebApplicationContextUtils;

//定义监听器
public class SystemInit implements ServletContextListener {

	private Logger logger=Logger.getLogger(SystemInit.class);
	
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		// 1.拿到ioc容器WebApplicationContext
		System.out.println("初始化spring");
		Contstants.ctx = WebApplicationContextUtils.getWebApplicationContext(arg0.getServletContext());
		System.out.println("获取到的ioc容器对象"+Contstants.ctx);
		if (Contstants.ctx == null) {

			System.out.println("初始化失败");

		}

		// 2.使用systemConfigService
		System.out.println("初始化配置项");
		
		if (Contstants.ctx != null) {
			SystemConfigSerivce systemConfigSerivce = (SystemConfigSerivce) Contstants.ctx
					.getBean("systemConfigService");
			SystemConfigure systemConfigure=new SystemConfigure();
			systemConfigure.setIsStart(1);//仅使用已启动的配置项
			
			Contstants.systemConfigList=systemConfigSerivce.getSystemConfigsIsStart(systemConfigure);
			Contstants.configSystemData();
		logger.info("----------------------------"+Contstants.accountConfigList.size());
		logger.info("----------------------------"+Contstants.serviceConfigList.size());
		logger.info("----------------------------"+Contstants.customConfigList.size());
		logger.info("----------------------------"+Contstants.cardConfigList.size());
		logger.info("----------------------------"+Contstants.youhuiConfigList.size());
		
		
		System.out.println("初始化配置项结束");
		// 3.条用serivce方法
		}

	}

}
