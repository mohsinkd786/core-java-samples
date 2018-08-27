package com.ibm.java.api;

public interface Department {

	void verify();

	default int validate(int number) {
		return number;
	}

	static void subtract(int first, int next) {
		int result = first - next;
		System.out.println("Difference is " + result);
	}
}
