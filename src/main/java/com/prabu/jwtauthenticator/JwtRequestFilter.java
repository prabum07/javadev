package com.prabu.jwtauthenticator;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import io.jsonwebtoken.ExpiredJwtException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtRequestFilter  {

	//@Autowired
//	private JwtUserDetailsService userDetailsService;
	
//	@Autowired
//	private JwtTokenUtil jwtTokenUtil;
/*
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		final String requestTokenHeader=request.getHeader("Authorization");
		String username=null;
		String jwtToken =null;
		
		if(requestTokenHeader !=null && requestTokenHeader.startsWith("Bearer "))
		{
			jwtToken=requestTokenHeader.substring(7);
			try {
				username=jwtTokenUtil.getUsernameFromToken(jwtToken);	
				System.out.println("user present");
			}catch(IllegalArgumentException e)
			{
				System.out.println("unable to get token");
			}catch (ExpiredJwtException e)
			{
				System.out.println("jwt token expired");

			}
		}else
		{
			
		}
		
		// TODO Auto-generated method stub
		
	}
	*/
	
}
