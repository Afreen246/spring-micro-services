package com.sbt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbt.entity.UserBean;

public interface UserRepository extends JpaRepository<UserBean, Long>{

	public UserBean findByuName(String uname);
}
