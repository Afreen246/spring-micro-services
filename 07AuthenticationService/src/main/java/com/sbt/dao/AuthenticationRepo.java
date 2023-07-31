package com.sbt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbt.model.Autherisers;

public interface AuthenticationRepo extends JpaRepository<Autherisers, Integer>{

}
