package com.prabu.loosecouple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class PrinterController {
	
	@Autowired
	@Qualifier("newPrinter")
	Repo print;
	
	@Autowired
	@Qualifier("newPrinter")
	Repo print1;
	
	@Autowired
	@Qualifier("oldPrinter")
	Repo oldprint;
	
	@RequestMapping("loose")
	@ResponseBody
	public String printme()
	{
		//-- these code to check whether spring container created object is actually singleton
		
		if(print.hashCode()==print1.hashCode())
		{
			System.out.print("same object");
		}else
		{
			System.out.print("different object");

		}
		//-----
		
		System.out.print(oldprint.print());
		return print.print();
	}

}
