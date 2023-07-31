package com.sbt;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoding {
	
	@Test
	public void passwordEncoder() {
		System.out.println(new BCryptPasswordEncoder().encode("afreen"));
	}

}
