package com.modernjava.lamda;

public class HelloWorldLambda {
	
	public static void main(String args[]){
		
		//implementing sayHelloWorld using Lambda
	/*	HelloWorldInterface helloWorldInterface = () -> {
			return "say hello world lambda";
		};*/

		
		HelloWorldInterface helloWorldInterface = () -> "say hello world lambda";
		
		System.out.println(helloWorldInterface.sayHelloWorld());
	}
}
