package com.sbt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbt.model.OrderService;

public interface OrderSerRepository  extends JpaRepository<OrderService, Integer>{

}
