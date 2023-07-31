package com.sbt.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class RoleBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long rid;
	private String rname;
	
	@ManyToMany(mappedBy = "roles")
	private List<UserBean> users;

	public RoleBean(long rid, String rname, List<UserBean> users) {
		super();
		this.rid = rid;
		this.rname = rname;
		this.users = users;
	}
	
	
	public RoleBean() {
		// TODO Auto-generated constructor stub
	}


	public long getRid() {
		return rid;
	}


	public void setRid(long rid) {
		this.rid = rid;
	}


	public String getRname() {
		return rname;
	}


	public void setRname(String rname) {
		this.rname = rname;
	}


	public List<UserBean> getUsers() {
		return users;
	}


	public void setUsers(List<UserBean> users) {
		this.users = users;
	}
	
	

}
