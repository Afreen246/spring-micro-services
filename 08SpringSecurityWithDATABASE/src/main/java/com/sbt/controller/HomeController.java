package com.sbt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sbt.entity.UserBean;
import com.sbt.service.UserServiceLayer;

@RestController
public class HomeController {

	//accessed by any logged in user
	@GetMapping("/hello")
	public String msg() {
		return "hello Afreen";
	}
	
	//accessed by without login
    @GetMapping("/public")
    public String all(){
        return ("<h1>Welcome All</h1>");
    }
    
    //accessed only role has USER
    @GetMapping("/user")
    public String user(){
        return ("<h1>Welcome User</h1>");
    }

    //accessed only role has ADMIN
    @GetMapping("/admin")
    public String admin(){
        return ("<h1>Welcome Admin</h1>");
    }
    
    
    @Autowired
    private UserServiceLayer service;
    
    @PostMapping("/signup")
    public UserBean saveSecurity(@RequestBody UserBean user) {
    	UserBean userbean=service.save(user);
    	userbean.setPassword("@@@@");
    	return userbean;
    }
    

}
