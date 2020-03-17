package com.modernjava.lamda;

public class ConcatenateTraditional implements ConcatenateInterface{

	@Override
	public String sconcat(String a, String b) {
		// TODO Auto-generated method stub
		return a+" "+b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcatenateTraditional concatenateTraditional = new  ConcatenateTraditional();
		
		System.out.println(concatenateTraditional.sconcat("apple", "box")); // o/p : applebox
	}

	

}
