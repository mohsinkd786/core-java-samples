package com.ibm.java.api;

@FunctionalInterface
public interface Calculator {
	void operate(String operation, int first, int next);

	default void verify() {

	}

	static void validate() {

	}
}
