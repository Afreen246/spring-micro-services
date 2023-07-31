package com.sbt.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
	
	private Integer uid;
	private String uname;
	private String mail;
	
//	private String orderServiceId;


}
