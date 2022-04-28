package com.datatypesvariablesoperators;

import java.util.Scanner;

public class NamePrinter {
	
	public static void nameProgram () {
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;
		nameMenu();
		System.out.println("Would you like to print out your full name? y/n");
		while(!exit) {
			String choice = scanner.next();
			switch(choice) {
				case "y":
					nameMenu();
					System.out.println("Enter your first name: ");
					String firstName = scanner.next();
					scanner.nextLine();
					System.out.println("Enter your last name: ");
					String lastName = scanner.next();
					scanner.nextLine();
					NamePrinter.printName(firstName, lastName);
					System.out.println("Would to print another complete name? y/n");
					break;
				case "n":
					System.out.println("Thanks for using this program! Goodbye!");
					exit = true;
					break;
			}
		}
	}
	
	private static void printName (String firstName, String lastName) {
		System.out.println("Your full name is: " + firstName + ' ' + lastName);
	}
	
	private static void nameMenu () {
		System.out.println("Print Your Full Name");
	}

}
