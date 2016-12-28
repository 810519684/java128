package org.project.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.project.model.SystemConfigure;

public interface SystemConfigSerivce {

	//查询配置项
		public List<SystemConfigure> getSystemConfigs(SystemConfigure systemConfigure);
		
		//查询已启用的配置项
		public List<SystemConfigure> getSystemConfigsIsStart(SystemConfigure systemConfigure);
		
		public int addSystemConfig(SystemConfigure systemConfigure);
		
		public int modifySystemConfig(SystemConfigure systemConfigure);
		
		public int isPeatConfig(SystemConfigure systemConfigure);
		
		public int deleteSystemConfig(SystemConfigure systemConfigure);
		
		/*
		 * 一级编号固定是，最大的二级编号
		 * 
		 * 
		 * */
		public int maxTypeValueByType(@Param("type") int type);
		
	
	
	
}
