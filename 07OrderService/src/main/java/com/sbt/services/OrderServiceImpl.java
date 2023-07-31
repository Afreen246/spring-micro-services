package com.sbt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sbt.dao.OrderSerRepository;
import com.sbt.model.OrderService;

@Service
public class OrderServiceImpl implements OrderServiceLayer{
	
	@Autowired
	private OrderSerRepository repo;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public OrderService saveOrder(OrderService ser) {
		// TODO Auto-generated method stub
		return repo.save(ser);
	}

	@Override
	public ResponseDto getOrderSer(Integer oid) {

		ResponseDto responsedto=new ResponseDto();
		
		OrderService oser=repo.findById(oid).get();
		
		OrderServiceDto ordto=mapToOrderservice(oser);
		
		
		ResponseEntity<AuthenticationDto> responseEntity=
				restTemplate.getForEntity("http://localhost:8080/author/get/"+oser.getAuthenticationSerId(), AuthenticationDto.class);
		
		AuthenticationDto authdto=responseEntity.getBody();
		
		System.out.println(responseEntity.getStatusCodeValue());
		
		responsedto.setAutdeto(authdto);
		responsedto.setOdto(ordto);
		
		
		return responsedto;
	}
	
	
	private OrderServiceDto mapToOrderservice(OrderService oser) {
		
		OrderServiceDto orderdto=new OrderServiceDto();
		orderdto.setOid(oser.getOid());
		orderdto.setOname(oser.getOname());
		return orderdto;
	}

	

}
