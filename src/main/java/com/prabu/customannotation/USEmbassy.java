package com.prabu.customannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import io.micrometer.core.ipc.http.HttpSender.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface vaccinated{}
public class USEmbassy {

	@vaccinated
	public void visaApplication()
	{
		System.out.println("visa granted");
	}
	
	public void getmeVisa() throws NoSuchMethodException, SecurityException {
		Class<? extends USEmbassy> cls=this.getClass();
		java.lang.reflect.Method mt=cls.getMethod("visaApplication");
		if(mt.isAnnotationPresent (vaccinated.class))
		{
			visaApplication(); //call this method in main method or other method by creating object
		}else
		{
			
		}
	}
}
