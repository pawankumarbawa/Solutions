package com.test.abstractclassexample;

public class AbstractClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car = new Car("Toyota", 25000.0, 4);
		Vehicle motorcycle = new Motorcycle("Harley Davidson", 15000.0, false);

		car.displayInfo();
		System.out.println();
		motorcycle.displayInfo();
	}
}


