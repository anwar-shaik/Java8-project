package com.modernjava.lamda;

public class HelloWorldTraditional implements HelloWorldInterface{
	@Override
	public String sayHelloWorld(){
		return "say hello world";
	}
	
	public static void main(String args[]){
		HelloWorldTraditional helloWorldTraditional = new HelloWorldTraditional();
		System.out.println(helloWorldTraditional.sayHelloWorld());
	}
}
