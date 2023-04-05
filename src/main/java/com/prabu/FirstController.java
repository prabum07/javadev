package com.prabu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.prabu.loosecouple.*;

@Controller
public class FirstController {

	@RequestMapping("ind")
	@ResponseBody
	public String ff()
	{
		return "prabu";
	}
	
	public FirstController() {
		// TODO Auto-generated constructor stub
	}

}
