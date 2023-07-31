package com.sbt.bean;

public class LoginRespBean {
	
	private String jwtToken;
	private String username;
	
	public LoginRespBean() {
		// TODO Auto-generated constructor stub
	}
	

	public LoginRespBean(String jwtToken, String username) {
		super();
		this.jwtToken = jwtToken;
		this.username = username;
	}


	public String getJwtToken() {
		return jwtToken;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	

}
