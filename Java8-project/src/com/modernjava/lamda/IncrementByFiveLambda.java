package com.modernjava.lamda;

public class IncrementByFiveLambda {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*IncrementByFiveInterface incrementByFiveInterface = (a)->{
			return a+5;
		};*/
		IncrementByFiveInterface incrementByFiveInterface = (a)-> a+5;
		
		System.out.println(incrementByFiveInterface.incrementByFive(2));  // o/p : 7
	}

}
