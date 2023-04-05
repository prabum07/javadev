package com.prabu.breakSingleton;

public  class Singleton   implements Cloneable {

	public static Singleton st; //creating the object while initializing itself
	public int num=0;
	
	//making a constructor a private so that we cannot create a object
	 private Singleton() throws Exception
	{
		if(st!=null)
		{
			throw new Exception("already created singleton class");
		}
	}
	public static Singleton getInstance() throws Exception
	{
	
		if(st!=null)
		{
			throw new Exception("already created singleton class");
		}
		return st =new Singleton(); //since there is no possible of creating object because of private constructor.
		//only way to get instance by this method
	}
	public void print()
	{
		num++;
		System.out.print(num+"ggf");
	}
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  
}
