package com.prabu.typeofinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Main {

	@Autowired
	@Qualifier("stu")
	Student student;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m=new Main();
		System.out.println(m.student); 
	}

}
