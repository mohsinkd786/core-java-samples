package com.ibm.java.api;

public interface Service {
	void verify();

	void verify(String str);

	default int validate(int number) {
		return number;
	}

	static void add(int first, int next) {
		int result = first + next;
		System.out.println("Sum is " + result);
	}
}
