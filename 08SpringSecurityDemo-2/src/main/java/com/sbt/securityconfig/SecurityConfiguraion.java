package com.sbt.securityconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguraion {

	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	UserDetailsService userDetailsService;
	
	@Autowired
	public void configurableGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService)
		.passwordEncoder(passwordEncoder);
	}
	
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity httpsecurity) throws Exception {
		httpsecurity.authorizeHttpRequests((authorizeHttpRequests)->{
			//spring version 2+ then use (antMatches). or use spring version 3+ than use (RequestMathers)
			authorizeHttpRequests.requestMatchers("/public","/signup").permitAll();
			
//			authorizeHttpRequests.requestMatchers("/signup").permitAll();


			
//			authorizeHttpRequests.requestMatchers("/hello").authenticated();
			authorizeHttpRequests.requestMatchers("/user").hasRole("USER");
			authorizeHttpRequests.requestMatchers("/admin").hasRole("ADMIN");
			});
		//if we give wrong Uri to access wrong member so its go to the default login form
		httpsecurity.formLogin(Customizer.withDefaults());
		
		return httpsecurity.build();
	}
}
	
	

