package com.sbt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sbt.dao.UserRepository;
import com.sbt.entity.UserBean;

@Service
public class UserServiceDetailsImpl implements UserDetailsService{
	//predefined UseDetailsService interface

	@Autowired
	private UserRepository repo;
	
	

	@Override
	//predefined method thats gives a UserDetailService interface
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
         UserBean userbean=repo.findByuName(username);
         
         
         if(userbean==null) {
        	 throw new UsernameNotFoundException("invalid username or password");
         }
         
         //convert list to a string
         String[] roles=userbean.getRoles().stream().map(r->r.getRname()).toArray(String[]::new);
         
         UserDetails userDetails=User.builder().username(userbean.getuName()).password(userbean.getPassword())
        		 .roles(roles).build();
         
         
		return userDetails;
	}

}
