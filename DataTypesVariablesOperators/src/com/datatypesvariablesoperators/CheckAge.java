package com.datatypesvariablesoperators;

import java.util.Scanner;

public class CheckAge {

	public static void ageProgram () {
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;
		ageMenu();
		System.out.println("Would you like to check your age? y/n");
		while(!exit) {
			String choice = scanner.next();
			switch(choice) {
				case "y":
					ageMenu();
					System.out.println("Enter your age: ");
					int myAge = scanner.nextInt();
					scanner.nextLine();
					checkAge(myAge);
					System.out.println("Would you like to check your age again? y/n");
					break;
				case "n":
//					System.out.println("Thanks for using this program! Goodbye!");
					exit = true;
					break;
			}
		}
	}
	
	private static void checkAge (int age) {
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
	
	private static void ageMenu () {
		System.out.println("Check Your Age: Minor, Adult, or Senior?");
	}
	
}
