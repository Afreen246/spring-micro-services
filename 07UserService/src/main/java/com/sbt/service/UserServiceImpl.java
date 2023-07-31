package com.sbt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sbt.dao.UserRepository;
import com.sbt.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private UserRepository repo;

	@Override
	public User saveServiceUser(User us) {
		// TODO Auto-generated method stub
		return repo.save(us);
	}

	@Override
	public ResponseDto getByUserId(Integer uid) {
		ResponseDto responseDto = new ResponseDto();
		User user = repo.findById(uid).get();

		UserDto userDto = mapToUser(user);

		ResponseEntity<OrderServiceDto> responseEntity = restTemplate
				.getForEntity("http://localhost:1010/order/getid/" + user.getOrderServiceId(), OrderServiceDto.class);

		OrderServiceDto ordeService = responseEntity.getBody();

		System.out.println(responseEntity.getStatusCodeValue());
		
		responseDto.setUserDto(userDto);
		
		responseDto.setOrderServiceDto(ordeService);
		
		
		return responseDto;
	}

	private UserDto mapToUser(User user) {

		UserDto userdto = new UserDto();
		userdto.setUid(user.getUid());
		userdto.setUname(user.getUname());
		userdto.setMail(user.getMail());
//		userdto.setOrderServiceId(user.getOrderServiceId());
		return userdto;
	}

}
