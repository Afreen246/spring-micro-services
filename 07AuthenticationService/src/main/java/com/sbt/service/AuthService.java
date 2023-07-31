package com.sbt.service;



import com.sbt.model.Autherisers;

public interface AuthService {
	
	Autherisers save(Autherisers as);
	
	Autherisers getAuthoriserId(Integer id);
	

}
