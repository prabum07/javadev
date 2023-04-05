package com.prabu.breakSingleton;

public class Singleton {

	public static Singleton st =new Singleton(); //creating the object while initializing itself
	public int num=0;
	
	//making a constructor a private so that we cannot create a object
	 private Singleton()
	{
		
	}
	public static Singleton getInstance()
	{
		return st; //since there is no possible of creating object because of private constructor.
		//only way to get instance by this method
	}
	public void print()
	{
		num++;
		System.out.print(num+"ggf");
	}
}
