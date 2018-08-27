package com.ibm.java.impl;

public class CalcMain {

	public static void main(String[] args) {
		CalculatorImpl calculate = new CalculatorImpl();
		CalculatorImpl calculate1 = new CalculatorImpl();

		int first = 15;
		int next = 10;
		// Addition
		calculate.add(first, next);
		calculate1.add(first, next);
		System.out.println("Sum is " + calculate.result);
		System.out.println("Sum is " + calculate1.result);

		// Subtract
		calculate.diff(first, next);
		System.out.println("Difference is " + calculate.result);
		calculate1.diff(first, next);
		System.out.println("Difference is " + calculate1.result);

		// Product
		calculate.product(first, next);
		System.out.println("Product is " + calculate.result);
		calculate1.product(20, 2);
		System.out.println("Product is " + calculate1.result);

	}
}
