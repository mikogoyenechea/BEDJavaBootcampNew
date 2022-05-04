package com.company;

import java.util.ArrayList;

public class Employee {
	
	private int id;
	private String ename;
	private String email;
	private int vacationDays;
	private static int count;
	
	public Employee(int id, String ename, String email, int vacationDays) {
		this.id = id;
		this.ename = ename;
		this.email = email;
		this.vacationDays = vacationDays;
		addReporties(this);
	}
	
	public void printDetails () {
		System.out.println("Id: " + id + "\n"
				+ "Name: " + ename + "\n"
				+ "E-mail: " + email + "\n"
				+ "Vacation days: " + vacationDays);
	}
	
	// In progress of getting this to return the number of employees excluding managers
	public static void addReporties (Employee employee) {
		ArrayList<Employee> reportees = new ArrayList<Employee>();
		reportees.add(employee);
		count++;
	}

	public static int getCount() {
		return count;
	}
	
}
