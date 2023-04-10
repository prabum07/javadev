package com.prabu.jwtauthenticator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
public class jwtauthenticatorController {

//	@Autowired
//	private JwtTokenUtil jwtTokenUtil;
//	@Autowired
//	private UserDetailsService userDetailsService;
//	
//	@RequestMapping(value="/authenticate",method=RequestMethod.POST)
//	public ResponseEntity<?> createAuthenticate(@RequestParam(value="username") String username,
//			@RequestParam(value="password") String password)
//	{
//		if(!username.equals("abcd") || !password.equals("1234"))
//		{
//			return ResponseEntity.ok("Invalid");
//
//		}
//		final UserDetails userDetails=userDetailsService.loadUserByUsername(username);
//		final String token = jwtTokenUtil.generateToken(userDetails);
//		return ResponseEntity.ok(token);
//	}
//	
//	@RequestMapping({"/hello"})
//	public String hello()
//	{
//		return "hello jwt";
//	}
	
}
