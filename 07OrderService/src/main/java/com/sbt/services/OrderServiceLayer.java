package com.sbt.services;

import com.sbt.model.OrderService;

public interface OrderServiceLayer {

	OrderService saveOrder(OrderService ser);
	
	ResponseDto getOrderSer(Integer oid);
}
