package com.sbt.secrityConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {


	
	@Autowired
	public PasswordEncoder passwordEncoder;	
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpsecurity) throws Exception {
		httpsecurity.csrf((csrf)->csrf.disable());
		
		
		httpsecurity.authorizeHttpRequests((authorizeHttpRequests)->{
			//spring version 2+ then use (antMatches). or use spring version 3+ than use (RequestMathers)
			authorizeHttpRequests.requestMatchers("/public","/signup").permitAll();
			
//			authorizeHttpRequests.requestMatchers("/signup").permitAll();
			authorizeHttpRequests.requestMatchers("/get").permitAll();
			authorizeHttpRequests.requestMatchers("/put").permitAll();


			
			authorizeHttpRequests.requestMatchers("/hello").authenticated();
			authorizeHttpRequests.requestMatchers("/user").hasRole("USER");
			authorizeHttpRequests.requestMatchers("/admin").hasRole("ADMIN");
			});
		//if we give wrong Uri to access wrong member so its go to the default login form
		httpsecurity.formLogin(Customizer.withDefaults());
		
		return httpsecurity.build();
	}
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService)
		    .passwordEncoder(passwordEncoder);
	}
	
	
	
	
	
	
	
	
	//##############################################
	
//	@Bean
//	public UserDetailsService userdetailService() {
////	using with Bcryptpassword encoder
//		UserDetails user1=User.builder()
//				.username("afreen")
//				.password(passwordEncoder().encode("user"))
//				.roles("USER").
//				build();
//		
//		UserDetails admin=User.builder()
//				.username("admin").password(passwordEncoder().encode("admin")).roles("ADMIN").build();
//	
//		return new InMemoryUserDetailsManager(user1,admin);
//		
//	}
	
	//or use this type
//	@Bean
//	public UserDetailsService userDetailsService() {
//		//using {noop}:-no encrypted pass word
//		UserDetails user1=User.builder().username("afreen").password("{noop}user").roles("USER").build();
//		UserDetails admin=User.builder().username("admin").password("{noop}admin").roles("ADMIN").build();
//		return new InMemoryUserDetailsManager(user1,admin);
//
//	}

	
}
