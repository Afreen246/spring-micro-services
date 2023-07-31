package com.sbt.secrityConfig;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//@SuppressWarnings({ "deprecation", "unused" })//it is used to when we use deprication methods
//@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{

//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		// TODO Auto-generated method stub
//		auth.inMemoryAuthentication()
//		.withUser("admin").password("{noop}9052").roles("hello")
//		.and()
//        .withUser("demo2").password("{noop}test2").roles("ADMIN")
//        .and()
//        .withUser("user").password("{noop}user").roles("USER");
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests()
//        .antMatchers("/admin").hasRole("ADMIN")
//        .antMatchers("/user").hasAnyRole("USER","ADMIN")
//        .antMatchers("/").permitAll()
//        .and().formLogin();
//	}

	

}
