package com.company;


public class CompanyDemo {

	public static void main(String[] args) {
		Employee employeeOne = new Employee(5242, "John", "john@company.com", 0);
		Employee employeeTwo = new Employee(9374, "Joe", "joe@company.com", 0);
		employeeOne.printDetails();
		employeeTwo.printDetails();
		System.out.println(Employee.getCount());
		Manager managerOne = new Manager(7362, "Mike", "mike@company.com", 1);
		managerOne.printDetails();
	}
	
	
}
