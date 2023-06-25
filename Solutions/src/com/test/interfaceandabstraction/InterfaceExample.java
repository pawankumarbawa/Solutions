package com.test.interfaceandabstraction;

public class InterfaceExample {

	public static void main(String[] args) {
		Person employee = new Employee("John Doe", 30, 50000.0);
		Person customer = new Customer("Jane Smith", 25, "CUST123");

		employee.displayInfo();
		System.out.println();
		customer.displayInfo();
		
		Customer customer1 = new Customer("Jane Smith", 25, "CUST123");
		customer1.makePayment();
	}

}
