package com.sbt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.sbt.dao.UserRepository;
import com.sbt.entity.UserBean;

@Service
public class UserBeanImpl implements UserServiceLayer{

	@Autowired
	private UserRepository repo;
	
	@Autowired
	private PasswordEncoder encoderPassword;
	
	@Override
	public UserBean save(UserBean usb) {
		//encoding the password
 		usb.setPassword(encoderPassword.encode(usb.getPassword()));
		return repo.save(usb);
	}

//	@Override
//	public List<UserBean> get() {
//		return repo.findAll();
//	}
//
//	@Override
//	public UserBean update(UserBean usb) {
//		return repo.save(usb);
//	}

}
