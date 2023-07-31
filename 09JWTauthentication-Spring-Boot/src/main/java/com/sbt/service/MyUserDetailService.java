package com.sbt.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if(!"afreen".equals(username)) {
			throw new UsernameNotFoundException("");
		}
		//password is encrypted form of "afreen"
		UserDetails userDetails=User.builder().username("afreen").password("$2a$10$WhJ/qwM8.flRwZYPsYubk.M7EiVgKpH4QWz1S9Wiba9BRkKdq7imC"
				).roles("ADMIN","USER").build();
		return userDetails;
	}

}
