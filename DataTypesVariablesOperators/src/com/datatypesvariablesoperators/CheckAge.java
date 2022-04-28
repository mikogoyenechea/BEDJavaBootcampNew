package com.datatypesvariablesoperators;

public class CheckAge {

	public static void checkAge (int age) {
		
		if(age < 0) {
			System.out.println("That can't be your age");
		} else {
			if (age > 0 && age < 18 ) {
				System.out.println("You're a minor");
			} else if (age >= 18 && age < 60) {
				System.out.println("You're an adult");
			} else {
				System.out.println("You're a senior");
			}
		}
	}
}
