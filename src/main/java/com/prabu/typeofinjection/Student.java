package com.prabu.typeofinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("stu")
public class Student {

	@Autowired
	public Student(String name) {
		super();
		this.name = name;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private int age;
}
