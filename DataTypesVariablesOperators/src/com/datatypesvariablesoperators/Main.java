package com.datatypesvariablesoperators;

import java.util.Scanner;

public class Main {

	public static void menu () {
		System.out.println("Check Your Age: Minor, Adult, or Senior?");
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;
		menu();
		System.out.println("Would you like to check your age? y/n");
		while(!exit) {
			String choice = scanner.next();
			switch(choice) {
			case "y":
				menu();
				System.out.println("Enter your age: ");
				int myAge = scanner.nextInt();
				scanner.nextLine();
				CheckAge.checkAge(myAge);
				System.out.println("Would you like to check your age again? y/n");
				break;
			case "n":
				System.out.println("Thanks for using this program! Goodbye!");
				exit = true;
				break;
			}
			
		}
		
	}

}
