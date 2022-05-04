package com.parking;

public class Vehicle {
	
	private int doors;
	private int seats;
	private int wheels;
	
	public Vehicle() {
		System.out.println("Building a vehicle \n"
				+ "Number of doors =  " + doors + "\n"
				+ "Number of seats =  " + seats + "\n"
				+ "Number of wheels = " + wheels);
	}

	public Vehicle(int doors, int seats, int wheels) {
		this.doors = doors;
		this.seats = seats;
		this.wheels = wheels;
	}
	
	public void drive() {
		System.out.println("Driving a vehicle");
	}
	
	

}
