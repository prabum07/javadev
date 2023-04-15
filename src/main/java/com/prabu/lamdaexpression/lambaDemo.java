package com.prabu.lamdaexpression;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class lambaDemo {
	public static void main(String[] args)
	{
		
		
	}
	@RequestMapping("lamba")
	@ResponseBody
	public String printme()
	{
		//-- these code to check whether spring container created object is actually singleton
		
		List<String> s=new ArrayList<String>();
		s.add("aa");
		s.add("bb");
		
		s.forEach((temp) -> System.out.print(temp));
		return "lamba";
	}
}
