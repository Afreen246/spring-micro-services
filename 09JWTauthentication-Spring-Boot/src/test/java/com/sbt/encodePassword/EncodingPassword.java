package com.sbt.encodePassword;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncodingPassword {
	@Test
	public void passwordEncode() {
		System.out.println(new BCryptPasswordEncoder().encode("afreen"));
	}

}
