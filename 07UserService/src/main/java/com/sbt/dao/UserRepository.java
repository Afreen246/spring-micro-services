package com.sbt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbt.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
