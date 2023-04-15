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
		Predicate<Integer> pred=(a) -> a==1;

	for( int i=0;i<lb.s1.size();i++)
	{
		int it=lb.s1.get(i);
		//int it=2;
	//	System.out.print(	pred.test(it));

	}
	List<student1> allStudents=new ArrayList<student1>();
	student1 sd1=new student1();
	sd1.setName("prabu");
	sd1.setStd(1);
	student1 sd2=new student1();
	sd2.setName("raj");
	sd2.setStd(2);
	allStudents.add(sd1);
	allStudents.add(sd2);
	//implementing the predicate interface
	Predicate<Integer> pred1=(temp)->temp.equals(1);
	for(int i=0;i<allStudents.size();i++)
	{
		
		System.out.print(	pred1.test(allStudents.get(i).getStd()));

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
 class student1{
	 public String name;
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public int std;
	
}
