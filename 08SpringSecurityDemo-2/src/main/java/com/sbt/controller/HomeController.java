package com.sbt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sbt.entity.User;
import com.sbt.service.UserService;

@RestController
public class HomeController {
	@Autowired
	private UserService service;

	@GetMapping("/public")
	public String publicMsg() {
		return "Hi All";
	}
	
	@PostMapping("/signup")
	public User saveUserDetails(@RequestBody User user) {
		return service.saveUser(user);
		
	}
	
	@GetMapping("/user")
	public String userModule() {
		return "User-Module";
	}
	
	@GetMapping("/admin")
	public String adminModule() {
		return "Admin-Module";
	}
}

