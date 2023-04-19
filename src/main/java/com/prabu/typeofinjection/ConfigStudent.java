package com.prabu.typeofinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigStudent {

	@Bean
	public String name()
	{
		return "a";
	}
}
