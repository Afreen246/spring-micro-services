package com.sbt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbt.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
