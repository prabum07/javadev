package com.prabu.methodreference;

import java.util.function.BiFunction;

public class MethodReferenceStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BiFunction<Integer,Integer,Double> bifunctionalAdd=MethodReferenceStaticMethod::addNumbers;
	System.out.println(bifunctionalAdd.apply(1, 2));	
	
    // Creating a reference to a custom method that takes a string and returns its length
    StringLengthFunction stringLengthFunction = String::length;

    // Using the reference to call the method on a string
    int length = stringLengthFunction.getLength("hello");
    System.out.println(length); // Output: 5
	;
	}

	public static Double addNumbers(Integer i,Integer j)
	{
		return i+j.doubleValue();
	}
	interface StringLengthFunction {
        int getLength(String s);
    }
}
