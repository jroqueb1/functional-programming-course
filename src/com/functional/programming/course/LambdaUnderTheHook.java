package com.functional.programming.course;

public class LambdaUnderTheHook {
	
	public static void main(String[] args) {
		
//		MyFunctionalInterface fun = new MyFunctionalInterface() {			
//			@Override
//			public void sayHello() {
//				System.out.println("Implementation #1");
//			}
//		};
//		
//		fun.sayHello();
//		
//		
//		MyFunctionalInterface fun2 = new MyFunctionalInterface() {			
//			@Override
//			public void sayHello() {
//				System.out.println("Implementation #2");
//			}
//		};		
//		
//		fun2.sayHello();

		MyFunctionalInterface fun1 = () -> System.out.println("Functional #1");
		fun1.sayHello();
		MyFunctionalInterface fun2 = () -> System.out.println("Functional #2");
		fun2.sayHello();

	}
	
}
