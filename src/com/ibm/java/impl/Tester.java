package com.ibm.java.impl;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		Test[] tests = { new Test(1, "BB"), new Test(2, "AA"), new Test(0, "AAA") };
		// Arrays.sort(tests);
		Arrays.sort(tests);
		for (Test test : tests) {
			System.out.println(test.name);
		}

	}
}
