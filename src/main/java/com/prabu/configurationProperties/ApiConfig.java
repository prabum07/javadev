package com.prabu.configurationProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="api")
public class ApiConfig {

	
	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String port;
}
