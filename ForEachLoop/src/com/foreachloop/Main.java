package com.foreachloop;

import java.util.Random;
import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
//		Calculator.calculator();
//		bankLoginPage();
		mainMenu();

	}
	
	public static void mainMenu () {
		Scanner scanner = new Scanner(System.in);
		boolean mainExit = false;
		while(!mainExit) {
//			System.out.println("Program for ForEach Loop Exercise \n"
//					+ "Choose a program: \n"
//					+ "1 - Calculator \n"
//					+ "2 - Bank Application \n"
//					+ "0 - Exit");
			try {
				System.out.println("Program for ForEach Loop Exercise \n"
						+ "Choose a program: \n"
						+ "1 - Calculator \n"
						+ "2 - Bank Application \n"
						+ "0 - Exit");
				int myProgram = scanner.nextInt();
				scanner.nextLine();
				switch(myProgram) {
					case 1: 
						Calculator.calculator();
						break;
					case 2:
						bankLoginPage();
						break;
					case 0:
						System.out.println("Thank you for using this program. Goodbye!");
						mainExit = true;
						break;
					default:
						System.out.println("You selected an invalid option.");
						break;
				}
			} catch (Exception e) {
				System.out.println("Oops! We encountered an error. \n" +
						"Exiting the program now");
				mainExit = true;
			}
		}
		
	}
	
	public static void bankLoginPage() {
		Scanner login = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = login.nextLine();
        Random random = new Random();
        int id = random.nextInt(100000);
        BankAccount myAccount = new BankAccount(name, id);
        myAccount.bankMenu();
		
	}

}
