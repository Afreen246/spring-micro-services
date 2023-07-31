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
@NoArgsConstructor
@AllArgsConstructor
public class Autherisers {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer aid;
	private String aname;
	private String email;

}
