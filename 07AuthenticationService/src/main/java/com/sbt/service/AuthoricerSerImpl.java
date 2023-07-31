package com.sbt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbt.dao.AuthenticationRepo;
import com.sbt.model.Autherisers;

@Service
public class AuthoricerSerImpl implements AuthService{
	
	@Autowired
	private AuthenticationRepo repo;

	@Override
	public Autherisers save(Autherisers as) {
		// TODO Auto-generated method stub
		return repo.save(as);
	}

	@Override
	public Autherisers getAuthoriserId(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

}
