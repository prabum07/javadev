package com.prabu.loosecouple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class PrinterController {
	
	@Autowired
	Repo print;
	
	@RequestMapping("loose")
	@ResponseBody
	public String printme()
	{
		return print.print();
	}

}
