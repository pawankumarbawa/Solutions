package com.test.abstractclassexample;

public class Car extends Vehicle {
	private int numDoors;

	public Car(String brand, double price, int numDoors) {
		super(brand, price);
		this.numDoors = numDoors;
	}

	@Override
	public void displayInfo() {
		System.out.println("Car Details:");
		System.out.println("Brand: " + brand);
		System.out.println("Price: $" + price);
		System.out.println("Number of Doors: " + numDoors);
	}
}
