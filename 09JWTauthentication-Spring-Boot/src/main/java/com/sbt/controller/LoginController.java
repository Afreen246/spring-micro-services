package com.sbt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sbt.bean.LoginReqBean;
import com.sbt.bean.LoginRespBean;
import com.sbt.service.MyUserDetailService;
import com.sbt.utill.JwtTokenUtil;

@RestController
public class LoginController {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	
	@Autowired
	private MyUserDetailService myUserDetailService;
	
	@PostMapping("/signin")
	public ResponseEntity<?> login(@RequestBody LoginReqBean loginREQbean) throws Exception{
		authenticate(loginREQbean.getUsername(),loginREQbean.getPassword());
		
		UserDetails userDetails=myUserDetailService.loadUserByUsername(loginREQbean.getUsername());
		String token=jwtTokenUtil.generateToken(userDetails);
		LoginRespBean loginRESPbean=new LoginRespBean(token, loginREQbean.getUsername());
		
		return ResponseEntity.ok(loginRESPbean);
		
	}
	
	private void authenticate(String username,String password) throws Exception {
		try {
		
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
	
		}catch (DisabledException e) {
			throw new Exception("User_disabled",e);
		}catch (BadCredentialsException e) {
			throw new Exception("invalid_credential",e);
		}
	}
}
