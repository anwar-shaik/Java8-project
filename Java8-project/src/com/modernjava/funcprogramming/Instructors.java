package com.modernjava.funcprogramming;

import java.util.Arrays;
import java.util.List;

public class Instructors {
	public static List<Instructor> getAll(){
		Instructor instructor1 = new Instructor("Mike", 10, "software developer", "male", true, Arrays.asList("java programming","c++ programming","python programming"));
		Instructor instructor2 = new Instructor("Jenny", 5, "engineer", "male", true, Arrays.asList("multi threading","CI/CD","unit testing"));
		Instructor instructor3 = new Instructor("Gene", 6, "manager", "male", true, Arrays.asList("c++ programming","c programming","react js"));
		Instructor instructor4 = new Instructor("Antony", 15, "senior developer", "male", true, Arrays.asList("java programming","Angular programming","react js"));
		Instructor instructor5 = new Instructor("Syed", 15, "software developer", "male", true, Arrays.asList("java programming","multi threading","react js"));
		List<Instructor> list = Arrays.asList(instructor1,instructor2,instructor3,instructor4,instructor5);
		return list;
	}
}
