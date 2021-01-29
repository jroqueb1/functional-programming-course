package com.functional.programming.course;

public class LambdaPractice1 {

	public static void main(String[] args) {
		
		Name name = () -> System.out.println("Hello World!");
		name.name();
		
		MathOperation add = (a, b) -> System.out.println(a+b);
		add.operation(1, 3);

		MathOperation multiply = (a, b) -> System.out.println(a*b);
		multiply.operation(3, 3);
		
	}
	
}
