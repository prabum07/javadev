package com.prabu.factorydesignpatter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FactorydesignController {

	/*
	
	it create another creational design pattern like singleton
	it also loosely coupled
	separate logic of object creation from user
	method factory or abstract factory
	
	say parent we have interface--car
	two child implement the car interface-->normal car
	another one -->suv car
	we have factory make up class that returns normal or suv car based upon input constructor requirement
	at last we have the reference of car and object of either normal or suv
	*/
	
	@RequestMapping("factory")
	@ResponseBody
	public String printme()
	{
		//-- these code to check whether spring container created object is actually singleton
		CarFactoryClass c=new CarFactoryClass();
		System.out.print(c.getDesign(1));
		
		return "factory";
	}
}
