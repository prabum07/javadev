package com.prabu.methodreference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

public class MethodReferenceComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList=Arrays.asList(1,4,3,2);
		intList.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
			
		});
		
		//lambda expression
		Comparator<Integer> c= (a1,a2)->a1.compareTo(a2);
		
		intList.sort(c);
		//method reference
		intList.sort(Integer::compareTo);
		intList.forEach(System.out::println);

	}
}
