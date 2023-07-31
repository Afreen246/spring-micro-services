package com.sbt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

//	@GetMapping("/home")
	@RequestMapping("/home")
	public String home() {
		return "Assalamu alaikum afreen";
	}
}
