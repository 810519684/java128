package org.project.service.systemconfigImpl;

import java.util.List;

import org.project.dao.systemconfigure.SystemConfigMapper;
import org.project.model.SystemConfigure;
import org.project.service.SystemConfigSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service(value="systemConfigService")
public class SystemConfigSerivceImpl implements SystemConfigSerivce{

	@Autowired
	private SystemConfigMapper SystemConfigMapper;
	
	
	
	
	
	@Override
	public List<SystemConfigure> getSystemConfigs(SystemConfigure systemConfigure) {
		// TODO Auto-generated method stub
		return this.SystemConfigMapper.getSystemConfigs(systemConfigure);
	}

	@Override
	public List<SystemConfigure> getSystemConfigsIsStart(SystemConfigure systemConfigure) {
		// TODO Auto-generated method stub
		return this.SystemConfigMapper.getSystemConfigsIsStart(systemConfigure);
	}

	@Override
	public int addSystemConfig(SystemConfigure systemConfigure) {
		// TODO Auto-generated method stub
		return this.SystemConfigMapper.addSystemConfig(systemConfigure);
	}

	@Override
	public int modifySystemConfig(SystemConfigure systemConfigure) {
		// TODO Auto-generated method stub
		return this.SystemConfigMapper.modifySystemConfig(systemConfigure);
	}

	@Override
	public int isPeatConfig(SystemConfigure systemConfigure) {
		// TODO Auto-generated method stub
		return this.SystemConfigMapper.isPeatConfig(systemConfigure);
	}

	@Override
	public int deleteSystemConfig(SystemConfigure systemConfigure) {
		// TODO Auto-generated method stub
		return this.SystemConfigMapper.deleteSystemConfig(systemConfigure);
	}

	@Override
	public int maxTypeValueByType(int type) {
		// TODO Auto-generated method stub
		return this.SystemConfigMapper.maxTypeValueByType(type);
	}

}
