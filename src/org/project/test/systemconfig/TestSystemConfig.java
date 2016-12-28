package org.project.test.systemconfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.project.model.SystemConfigure;
import org.project.service.SystemConfigSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:ApplicationContext-mybatis.xml", "classpath:spring-servlet.xml" })
public class TestSystemConfig {

	@Autowired
	private SystemConfigSerivce systemConfigSerivce;

	@Test
	public void test() {
		SystemConfigure systemConfig=new SystemConfigure();
		systemConfig.setConfigType(1);
		systemConfig.setConfigTypeName("政府个人");
		systemConfig.setConfigTypeValue(2);
		systemConfig.setConfigValue("2600");
		systemConfig.setIsStart(1);
	
		systemConfigSerivce.addSystemConfig(systemConfig);
        
		
	}

}
