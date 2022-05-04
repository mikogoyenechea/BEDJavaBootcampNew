package com.parking;

public class Car extends Vehicle {
	
	
	@Override
	public void drive() {
		System.out.println("Driving a car.");
	}

	public Car() {
		System.out.println("Building a car.");
		
	}

	public Car(int doors, int seats, int wheels) {
		super(doors, seats, wheels);
		System.out.println("Building a car. \n"
				+ "Number of doors: " + doors + "\n"
				+ "Number of seats: " + seats + "\n"
				+ "Number of wheels: " + wheels);
	}
	
	 
	

}
