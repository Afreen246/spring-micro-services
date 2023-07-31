package com.sbt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
