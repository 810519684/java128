package org.project.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.project.dao.UserMapper;
import org.project.model.User;
import org.project.service.userservice;
import org.springframework.stereotype.Service;

@Service("userService")
public class userServiceImpl implements userservice{

	@Resource
	private UserMapper UserMapper;
	
	
	
	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return UserMapper.getUserList();
	}

	@Override
	public User getUser(User user) {
		// TODO Auto-generated method stub
		return UserMapper.getUser(user);
	}

	@Override
	public int InsertUser(User user) {
		// TODO Auto-generated method stub
		return UserMapper.InsertUser(user);
	}

	@Override
	public int UpdatetUser(User user) {
		// TODO Auto-generated method stub
		return UserMapper.UpdatetUser(user);
	}

	@Override
	public int DletetUser(int id) {
		// TODO Auto-generated method stub
		return UserMapper.DletetUser(id);
	}

	@Override
	public List<User> findUserList() {
		// TODO Auto-generated method stub
		return UserMapper.findUserList();
	}

	@Override
	public void deleteUserByuserName(User user) {
		// TODO Auto-generated method stub
		this.UserMapper.deleteUserByuserName(user);
	}

	//通过用户名获取user对象
	@Override
	public User getUserByuserName(String userName) {
		// TODO Auto-generated method stub
		return this.UserMapper.getUserByuserName(userName);
	}

}
