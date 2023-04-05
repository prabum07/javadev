package com.prabu;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.prabu.loosecouple.*;
import com.prabu.breakSingleton.*;


@Controller
public class FirstController {

	@RequestMapping("ind")
	@ResponseBody
	public String ff()
	{
		return "prabu";
	}
	
	@RequestMapping("singleton")
	@ResponseBody
	public String singleton() throws Exception
	{
		Singleton s= Singleton.getInstance();
		s.print();
		System.out.println(s.hashCode());
		
		//still we can create two object of singleton class by below method.
		Constructor<?> const1=(Constructor<?>) s.getClass().getDeclaredConstructor(new Class[0]);
		const1.setAccessible(true);
		Singleton s1=( Singleton)const1.newInstance();
		System.out.print(s1.hashCode());
		//we can also clone the object by implement the cloneable interface and clone the object to break singleton pattern
		Singleton s2=(Singleton) s.clone();
		System.out.print(s2.hashCode());



		return "prabu";
	}
	
	
	
	public FirstController() {
		// TODO Auto-generated constructor stub
	}

}
