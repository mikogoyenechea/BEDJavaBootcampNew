package com.datatypesvariablesoperators;

import java.util.Scanner;

public class CheckMultiples3Or5 {
	
	public static void multipleProgram () {
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;
		multipleMenu();
		System.out.println("Would you like to check a number if it's a multiple of 3 or 5? y/n");
		while(!exit) {
			String choice = scanner.next();
			switch(choice) {
			case "y":
				multipleMenu();
				System.out.println("Type in your number and press Enter");
				int myNumber = scanner.nextInt();
				scanner.nextLine();
				checkMultiple(myNumber);
				System.out.println("Would you like to check another number? y/n");
				break;
			case "n":
//				System.out.println("Thanks for using this program! Goodbye!");
				exit = true;
				break;
			}
		}
		
	}
	
	private static void checkMultiple (int number) {
		if (number < 0) {
			System.out.println("You can only enter positive integers.\n"
					+ "Please enter a valid number.");
		} else {
			if (number % 3 == 0 && number % 5 != 0) {
				System.out.println("Your number is a multiple of 3.");
			} else if (number % 5 == 0 && number % 3 != 0) {
				System.out.println("Your number is a multiple of 5.");
			} else if (number % 5 == 0 && number % 3 == 0) {
				System.out.println("Your number is both a multiple of 3 and 5.");
			} else {
				System.out.println("Your number is not a multiple of 3 nor 5.");
			}
		}
	}
	
	private static void multipleMenu () {
		System.out.println("Multiple of 3 or 5?");
	}

}
