package com.sbt.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto {

	private OrderServiceDto orderServiceDto;
	
	private UserDto userDto;
}
