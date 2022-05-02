package com.foreachloop;

import java.util.Scanner;

public class BankAccount {
    String customerName;
    int customerId;
    int balance;

    BankAccount(String cname , int cid) {
        customerName = cname;
        customerId = cid;
    }

    void deposit(int amount) {
        if (amount >= 0) {
            balance += amount;
            System.out.println("An amount of " + amount + " has been deposited to your account");
        } else {
            System.out.println("Please enter a valid amount.");
        }
    }

    void withdraw(int amount) {
        if(balance > amount) {
            balance -= amount;
            System.out.println("An amount of " + amount + " has been withdrawn to your account");
        } else {
            System.out.println("You do not have enough funds");
        }
    }

    void transfer(int amount, int account) {
        if (amount >= 0) {
            balance -= amount;
            System.out.println("An amount of " + amount + " has been deposited to account number: " + account);
        } else {
            System.out.println("You do not have enough funds.");
        }
    }

    void bankMenu() {

        Scanner scanner = new Scanner(System.in);
        boolean bankExit = false;

        System.out.println("Simple Bank App" +
                "\nWelcome, " + customerName +
                "\nAccount number:" + customerId);

        do {
            System.out.println("Type the number of your choice then press Enter" +
                    "\n1 - Check Balance" +
                    "\n2 - Deposit Funds" +
                    "\n3 - Withdraw Funds" +
                    "\n4 - Transfer Funds" +
                    "\n0 - Exit");
            int myTransaction;
            myTransaction = scanner.nextInt();
            switch (myTransaction) {
                case 0:
                	bankExit = true;
                	break;
                case 1:
                    System.out.println("Your account balance is: " + balance);
                    break;
                case 2:
                    System.out.println("Enter an amount to deposit: ");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    break;
                case 3:
                    System.out.println("Enter an amount to deposit: ");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    break;
                case 4:
                    System.out.println("Enter an amount to deposit: ");
                    int amount3 = scanner.nextInt();
                    System.out.println("Enter account number: ");
                    int account = scanner.nextInt();
                    transfer(amount3, account);
                    break;
                default:
                    System.out.println("Invalid input. Please select from the options provided.");
                    break;
            }

        } while (!bankExit); {
            System.out.println("Thank you for using the Bank App.");
        }
    }

}
