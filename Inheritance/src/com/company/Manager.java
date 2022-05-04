package com.company;

public class Manager extends Employee {
	
	private int numberOfReportees;
	
	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		super.printDetails();
		System.out.println("Number of reportees: " + numberOfReportees);
	}


	public Manager(int id, String ename, String email, int vacationDays) {
		super(id, ename, email, vacationDays);
		this.numberOfReportees = getCount()-1;
	}

}
