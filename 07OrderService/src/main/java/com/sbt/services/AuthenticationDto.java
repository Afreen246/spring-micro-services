package com.sbt.services;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationDto {
	
	private Integer aid;
	private String aname;
	private String email;

}
