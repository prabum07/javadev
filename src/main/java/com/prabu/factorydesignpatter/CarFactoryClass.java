package com.prabu.factorydesignpatter;

public class CarFactoryClass {

	public CarInterface getDesign(int i)
	{
		if(i==0)
		{
			return new NormalCar();
		}else
		{
			return new SuvCar();

		}
	}
}
