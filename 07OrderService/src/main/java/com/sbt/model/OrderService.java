package com.sbt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Setter
@Getter 
@AllArgsConstructor
@NoArgsConstructor
public class OrderService {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer oid;
	private String oname;
	
	private String authenticationSerId;
	
//	public OrderService() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public OrderService(String oname) {
//		super();
//		this.oname = oname;
//	}
//
//	public Integer getOid() {
//		return oid;
//	}
//
//	public void setOid(Integer oid) {
//		this.oid = oid;
//	}
//
//	public String getOname() {
//		return oname;
//	}
//
//	public void setOname(String oname) {
//		this.oname = oname;
//	}
//
//	@Override
//	public String toString() {
//		return "OrderService [oid=" + oid + ", oname=" + oname + "]";
//	}
	

}
