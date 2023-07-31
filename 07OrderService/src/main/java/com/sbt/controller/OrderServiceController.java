package com.sbt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbt.model.OrderService;
import com.sbt.services.OrderServiceLayer;
import com.sbt.services.ResponseDto;

@RestController
@RequestMapping("/order")
public class OrderServiceController {
	
	@Autowired
	private OrderServiceLayer service;

	@PostMapping
	public ResponseEntity<OrderService> saveData(@RequestBody OrderService os){
		OrderService oser=service.saveOrder(os);
		return new ResponseEntity<>(oser,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/getid/{oid}")
	public ResponseEntity<ResponseDto> getAllOrderService(@PathVariable("oid") Integer id){
		ResponseDto respdto=service.getOrderSer(id);
				return new ResponseEntity<>(respdto,HttpStatus.OK);
	}
}
