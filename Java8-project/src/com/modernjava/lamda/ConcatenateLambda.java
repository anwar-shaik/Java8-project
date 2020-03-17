package com.modernjava.lamda;

public class ConcatenateLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcatenateInterface concatenateInterface = (a,b) -> a+" "+b;
		System.out.println(concatenateInterface.sconcat("apple", "box")); // o/p : applebox
	}

}
