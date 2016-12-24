package org.project.service;

import java.util.List;

import org.project.model.User;

public interface userservice {
	
    public List<User> getUserList();
	
	public User getUser(User user);
	
	public int InsertUser(User user);
	
	public int UpdatetUser(User user);
	
	public int DletetUser(int id);
	
	public List<User> findUserList();
	
    public void deleteUserByuserName(User user);
    
    public User  getUserByuserName(String userName);  
    
}
