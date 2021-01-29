package com.functional.programming.course;

public class LambdaExample1 {

//	public static void main(String[] args) {
//		MyRunnable myRunnable = new MyRunnable();
//		Thread t = new Thread(myRunnable);
//		t.start();
//	}

	public static void main(String[] args) {
//		Thread t = new Thread(new Runnable(
//				) {
//					
//					@Override
//					public void run() {
//						System.out.println("Anonimous Thread Executed!");
//					}
//				});
//		t.start();

//		new Thread(() -> System.out.println("Anonimous Thread Executed!")).start();
		
		MyFunctionalInterface fun = () -> System.out.println("hello");
		fun.sayHello();
		
//		onTheFly(fun);
		onTheFly(() -> System.out.println("Hello Rick"));
		
		onTheFly(() -> {
			System.out.println("Hello Juan!");
			System.out.println("Hello Again!");
		});

	}
	
	public static void onTheFly(MyFunctionalInterface fun) {
		fun.sayHello();
	}
	
}
