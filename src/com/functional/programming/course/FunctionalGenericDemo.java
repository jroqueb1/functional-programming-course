package com.functional.programming.course;

public class FunctionalGenericDemo {

	public static void main(String[] args) {

		FunctionalGeneric<String, String> fun = s -> s.substring(1, 8);
		System.out.println(fun.execute("this is a demo"));
		
		FunctionalGeneric<String, Integer> fun1 = s -> s.length();
		System.out.println(fun1.execute("Basicstostrong"));
		
		
	}

}
