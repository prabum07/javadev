package com.prabu;

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
	public String singleton()
	{
		Singleton s=new Singleton();
		s.st.print();
		return "prabu";
	}
	
	
	
	public FirstController() {
		// TODO Auto-generated constructor stub
	}

}
