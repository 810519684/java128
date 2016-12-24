package org.project.model;

import java.util.Date;

public class User {
	
	private Integer id;
	
	private String userCode;
	
	private String userName;
	
	private String userPassword;
	
	private Date creationTime;
	
	private  Date lastLoginTime;
	
	private String createBy;
	
	private Date lastUpdateTime;
	
	private Integer isStart;
	
	private Integer roleId;

	public User() {
		super();
	}

	public User(String userCode, String userName, String userPassword, Date creationTime, Date lastLoginTime,
			String createBy, Date lastUpdateTime, Integer isStart, Integer roleId) {
		super();
		this.userCode = userCode;
		this.userName = userName;
		this.userPassword = userPassword;
		this.creationTime = creationTime;
		this.lastLoginTime = lastLoginTime;
		this.createBy = createBy;
		this.lastUpdateTime = lastUpdateTime;
		this.isStart = isStart;
		this.roleId = roleId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public Integer getIsStart() {
		return isStart;
	}

	public void setIsStart(Integer isStart) {
		this.isStart = isStart;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userCode=" + userCode + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", creationTime=" + creationTime + ", lastLoginTime=" + lastLoginTime + ", createBy=" + createBy
				+ ", lastUpdateTime=" + lastUpdateTime + ", isStart=" + isStart + ", roleId=" + roleId + "]";
	}
	
	
	

}
