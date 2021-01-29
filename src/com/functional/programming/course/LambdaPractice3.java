package com.functional.programming.course;

public class LambdaPractice3 {

	public static void main(String[] args) {
		
		LengthOfString len = (s) -> s.length();
		System.out.println(len.length("one"));
		
		
		LengthOfString multiLineLen = (s) -> {
			System.out.println("The Length is: " + s.length());
			return s.length();
		};
		multiLineLen.length("BasicToStrong");
		
	}
	
}
