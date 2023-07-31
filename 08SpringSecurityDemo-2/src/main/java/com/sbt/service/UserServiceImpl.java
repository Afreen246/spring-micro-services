package com.sbt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbt.entity.User;
import com.sbt.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository repo;

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

}
