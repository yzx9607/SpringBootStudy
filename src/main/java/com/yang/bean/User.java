package com.yang.bean;

/**
 * 用户实体类
 * @author Yang
 *
 */
public class User {
	/*用户名称*/
	private int userId;
	/*用户登录名称*/
	private String userName;
	/* 用户登录密码 */
	private String password;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + "]";
	}

	

}
