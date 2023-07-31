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

import com.sbt.model.User;
import com.sbt.service.ResponseDto;
import com.sbt.service.UserDto;
import com.sbt.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@PostMapping
	public ResponseEntity<User> saveData(@RequestBody User usr){
		User user=userService.saveServiceUser(usr);
		return new ResponseEntity<>(user,HttpStatus.CREATED);
	
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ResponseDto> getbyId(@PathVariable("id") Integer id){
		
		ResponseDto getid=userService.getByUserId(id);
		
		return new ResponseEntity<>(getid,HttpStatus.OK);
	}
}
