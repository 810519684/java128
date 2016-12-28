package org.project.common;

import java.util.ArrayList;
import java.util.List;

import org.project.model.SystemConfigure;
import org.springframework.web.context.WebApplicationContext;

public class Contstants {

	
	public static WebApplicationContext ctx;//ioc容器

	public static final String SESSION_USER = "userSession";
	
	
	/*
	 * 配置项
	 */
	// 所有配置项
	public static List<SystemConfigure> systemConfigList;
	// 服务类型1
	public static List<SystemConfigure> accountConfigList = new ArrayList<SystemConfigure>();
	// 服务类型2
	public static List<SystemConfigure> serviceConfigList = new ArrayList<>();
	// 服务年限,最大服务年限
	public static SystemConfigure maxSerivceYearsConfig;
	// app地址
	public static SystemConfigure appMakeUrlConfig;
	// 客户类型
	public static List<SystemConfigure> customConfigList = new ArrayList<SystemConfigure>();
	// 证件类型
	public static List<SystemConfigure> cardConfigList = new ArrayList<SystemConfigure>();
	// 优惠类型
	public static List<SystemConfigure> youhuiConfigList = new ArrayList<SystemConfigure>();

	public static void configSystemData() {
		// 遍历所有的配置项，并且不同配置配置类型归类，所有的集合方法清空,防止重复添加
		accountConfigList.clear();
		serviceConfigList.clear();
		customConfigList.clear();
		cardConfigList.clear();
		youhuiConfigList.clear();
		
		for (SystemConfigure config : systemConfigList) {
			
			switch (config.getConfigType()) {
			case 1:
				accountConfigList.add(config);
				break;
              case 2:
				serviceConfigList.add(config);
				break;
              case 3:
  				maxSerivceYearsConfig=config;
  				break;	
  				
              case 4:
  				appMakeUrlConfig=config;
  				break;	
  				
              case 5:
  				customConfigList.add(config);
  				break;	
  				
              case 6:
  				cardConfigList.add(config);
  				break;	
  				
              case 7:
  				youhuiConfigList.add(config);
  				break;	
              
              default:
				break;
			}
			
			
			
			
			
			
		}

	}

}
