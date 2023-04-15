package com.prabu.lamdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class lambaDemo {
	List<Integer> s1=new ArrayList<Integer>();

	public static void main(String[] args)
	{
		lambaDemo lb=new lambaDemo();
		List<String> s=new ArrayList<String>();
		s.add("aa");
		s.add("bb");
		
		s.forEach((temp) -> System.out.print(temp));
		
		lb.s1.add(1);
		lb.s1.add(2);
		lb.s1.add(3);
		lb.s1.add(1);


	//System.out.print(	lb.temp(f->false));
	for( int i=0;i<lb.s1.size();i++)
	{
		int it=lb.s1.get(i);
		//int it=2;
		Predicate<Integer> pred=(a) -> a==1;
		System.out.print(	pred.test(it));

	}
	}
	
	public  boolean temp(Predicate<Integer> ss)
	{
		if(ss.test(1))
			return true;
		
		return false;
	}
	@RequestMapping("lamba")
	@ResponseBody
	public String printme(Predicate<String> ss)
	{
		//-- these code to check whether spring container created object is actually singleton
		
		List<String> s=new ArrayList<String>();
		s.add("aa");
		s.add("bb");
		
		s.forEach((temp) -> System.out.print(temp));
		return "lamba";
	}
}
