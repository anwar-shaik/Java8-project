package com.modernjava.funcprogramming;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Instructor> instructors = Instructors.getAll();
		
		//loop through all the instructors and print the values of the instructors
		Consumer<Instructor> c1 = (s1)-> System.out. println(s1);
		instructors.forEach(c1);
		
/*		o/p :
 * 		Instructor [name=Mike, yearsOfExperience=10, title=software developer, gender=male, onlineCourses=true, courses=[java programming, c++ programming, python programming]]
		Instructor [name=Jenny, yearsOfExperience=5, title=engineer, gender=male, onlineCourses=true, courses=[multi threading, CI/CD, unit testing]]
		Instructor [name=Gene, yearsOfExperience=6, title=manager, gender=male, onlineCourses=true, courses=[c++ programming, c programming, react js]]
		Instructor [name=Antony, yearsOfExperience=15, title=senior developer, gender=male, onlineCourses=true, courses=[java programming, Angular programming, react js]]
		Instructor [name=Syed, yearsOfExperience=15, title=software developer, gender=male, onlineCourses=true, courses=[java programming, multi threading, react js]]*/

	
		
		//loop through all the instructors and print their names
		Consumer<Instructor> c2 = (s1)-> System.out. println(s1.getName());
		instructors.forEach(c2);

		/* o/p :
		Mike
		Jenny
		Gene
		Antony
		Syed*/
	
		//loop through all the instructors and print their names and their courses
		Consumer<Instructor> c3 = (s1)-> System.out. println(s1.getName() + " " + s1.getCourses());
		instructors.forEach(c3);
		/* o/p :
 		Mike [java programming, c++ programming, python programming]
		Jenny [multi threading, CI/CD, unit testing]
		Gene [c++ programming, c programming, react js]
		Antony [java programming, Angular programming, react js]
		Syed [java programming, multi threading, react js]*/
		
		//this can also be done like this
		Consumer<Instructor> c4 = (s1)-> System.out. println(s1.getCourses());
		instructors.forEach(c2.andThen(c4));
		
		/* o/p :
		Mike
		[java programming, c++ programming, python programming]
		Jenny
		[multi threading, CI/CD, unit testing]
		Gene
		[c++ programming, c programming, react js]
		Antony
		[java programming, Angular programming, react js]
		Syed
		[java programming, multi threading, react js]*/

		
	}

}
