package com.sbt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbt.model.Autherisers;
import com.sbt.service.AuthService;

@RestController
@RequestMapping("/author")
public class AuthorizeController {

	@Autowired
	private AuthService service;
	
	@PostMapping
	public ResponseEntity<Autherisers> saveAuthoriserData(@RequestBody Autherisers as){
		Autherisers savedata=service.save(as);
		return new ResponseEntity<>(savedata,HttpStatus.CREATED);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Autherisers> getAllwithid(@PathVariable("id") Integer id){
		Autherisers aid=service.getAuthoriserId(id);
		return new ResponseEntity<>(aid,HttpStatus.OK);
	}
	
}
