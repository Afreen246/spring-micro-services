package com.sbt.entity;

import java.util.List;

import org.springframework.boot.context.properties.bind.Name;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class UserBean {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private long userId;
	private String uName;
	private String email;
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	  @JoinTable(
	            name = "users_roles",
	            joinColumns = { @JoinColumn(name = "user_id", referencedColumnName = "userId") },
	            inverseJoinColumns = { @JoinColumn(name = "role_id", referencedColumnName = "rid") }
	    )
	private List<RoleBean> roles;
	
	public UserBean() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public UserBean(long userId, String uName, String email, String password, List<RoleBean> roles) {
		super();
		this.userId = userId;
		this.uName = uName;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}




	public long getUserId() {
		return userId;
	}




	public void setUserId(long userId) {
		this.userId = userId;
	}




	public String getuName() {
		return uName;
	}




	public void setuName(String uName) {
		this.uName = uName;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public List<RoleBean> getRoles() {
		return roles;
	}




	public void setRoles(List<RoleBean> roles) {
		this.roles = roles;
	}




	
	

}
