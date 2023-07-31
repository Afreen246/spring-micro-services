package com.sbt.bean;

public class LoginReqBean {
	
	private String Username;
	private String password;
	
	 public LoginReqBean() {
		// TODO Auto-generated constructor stub
	}

	public LoginReqBean(String username, String password) {
		super();
		Username = username;
		this.password = password;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	 
	 

}
