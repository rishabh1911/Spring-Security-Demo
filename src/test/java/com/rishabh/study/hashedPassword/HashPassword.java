package com.rishabh.study.hashedPassword;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import junit.framework.Assert;
import junit.framework.TestCase;

public class HashPassword extends TestCase {

	public void testConvertToMD5() {
		String password = "secret";
		Md5PasswordEncoder passwordEncoder = new Md5PasswordEncoder();
		String hashedKey = passwordEncoder.encodePassword(password, null);
		// Not using Salt here.
		
		Assert.assertNotNull(hashedKey);
		System.out.println("Encoded String: "+hashedKey);
	}
	
	public void testConvertToBcrypt() {
		String password = "secret";
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedKey = passwordEncoder.encode(password);
		// Not using Salt here.
		
		Assert.assertNotNull(hashedKey);
		System.out.println("Encoded String: "+hashedKey);
	}
}
