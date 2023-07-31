package com.sbt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/departments")
public class DeptController {
	
	@GetMapping("/dept")
	public String myMsg() {
		return "dept service gate way";
	}

}
