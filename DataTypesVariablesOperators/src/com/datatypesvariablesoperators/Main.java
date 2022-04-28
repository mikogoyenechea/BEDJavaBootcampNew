package com.datatypesvariablesoperators;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		mainMenu();
		
	}
	
	public static void mainMenu () {
		
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;
		
		System.out.println("Exercises: Data Types, Variables, Operators \n");
		
		while(!exit) {
			System.out.println("Choose a program: \n" +
				"1 - Name Printer \n" +
				"2 - Check Your Age \n" +
				"3 - Check a Multiple of 3 or 5 \n" +
				"0 - Exit program");
			try {
				int myProgram = scanner.nextInt();
				scanner.nextLine();
				switch(myProgram) {
					case 1:
						NamePrinter.nameProgram();
						break;
					case 2:
						CheckAge.ageProgram();
						break;
					case 3:
						CheckMultiples3Or5.multipleProgram();
						break;
					case 0:
						System.out.println("Thanks for using this program! Goodbye!");
						exit = true;
						break;
				}
			} catch (Exception e) {
				System.out.println("Oops! It looks like you entered an invalid value \n" +
						"Exiting the program now");
				exit = true;
			}
		}
	}
}


