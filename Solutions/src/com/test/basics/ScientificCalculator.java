package com.test.basics;

public class ScientificCalculator extends Calculator {
    @Override
	public double multiply(int num1, int num2) {
        return Math.multiplyExact(num1, num2);
    }

    public static void main(String[] args) {
        ScientificCalculator scientificCalculator = new ScientificCalculator();

        System.out.println("Addition:");
        System.out.println(scientificCalculator.add(2, 3));
        System.out.println(scientificCalculator.add(2.5, 3.7));

        System.out.println("Subtraction:");
        System.out.println(scientificCalculator.subtract(5, 3));
        System.out.println(scientificCalculator.subtract(5.5, 2.3));

        System.out.println("Multiplication (Power):");
        System.out.println(scientificCalculator.multiply(2, 3));
    }
}
