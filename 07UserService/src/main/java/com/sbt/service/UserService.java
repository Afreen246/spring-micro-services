package com.sbt.service;

import com.sbt.model.User;

public interface UserService {
	
	 public User saveServiceUser(User usr);
	
	public ResponseDto getByUserId(Integer uid);

	
}
