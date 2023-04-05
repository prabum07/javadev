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
	@Qualifier("oldPrinter")
	Repo oldprint;
	
	@RequestMapping("loose")
	@ResponseBody
	public String printme()
	{
		System.out.print(oldprint.print());
		return print.print();
	}

}
