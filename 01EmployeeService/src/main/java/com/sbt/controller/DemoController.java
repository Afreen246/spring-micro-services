package com.sbt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@Value("${service.name}")
	private String configServer;
	
	@GetMapping("/emp")
	public String myMsg() {
//		return "this is a Emp-microservice ";
		return configServer;
	}

}
