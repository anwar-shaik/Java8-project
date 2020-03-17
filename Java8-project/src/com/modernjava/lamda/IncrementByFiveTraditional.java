package com.modernjava.lamda;

public class IncrementByFiveTraditional implements IncrementByFiveInterface {
	@Override
	public int incrementByFive(int a){
		return a+5;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IncrementByFiveTraditional incrementByFiveTraditional = new IncrementByFiveTraditional();
		System.out.println(incrementByFiveTraditional.incrementByFive(2)); // o/p :7
	}

}
