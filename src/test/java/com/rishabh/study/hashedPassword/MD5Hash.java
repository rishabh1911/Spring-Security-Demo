package com.rishabh.study.hashedPassword;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

import junit.framework.Assert;
import junit.framework.TestCase;

public class MD5Hash extends TestCase {

	public void testConvertToMD5() {
		String password = "secret";
		Md5PasswordEncoder passwordEncoder = new Md5PasswordEncoder();
		String hashedKey = passwordEncoder.encodePassword(password, null);
		// Not using Salt here.
		
		Assert.assertNotNull(hashedKey);
		System.out.println("Encoded String: "+hashedKey);
	}
}
