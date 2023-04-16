package com.prabu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Scratch1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext contx=	SpringApplication.run(Scratch1Application.class, args);
		
		System.out.print("prabu");
	}

}
