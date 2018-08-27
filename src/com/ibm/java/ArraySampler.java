package com.ibm.java;

import static java.lang.System.out;

public class ArraySampler {

	public static void main(String[] args) {

		int[] numbers = new int[5];

		numbers[0] = 11;
		numbers[1] = 22;
		numbers[2] = 33;
		numbers[3] = 44;
		numbers[4] = 55;

		String[] countries = { "USA", "UK", "CANADA", "FRANCE", "RUSSIA", "ITALY" };

		Object[] objects = new Object[3];
		objects[0] = new String("Hello");
		objects[1] = "Hello";
		objects[2] = 11;
		int ii = 12;
		objects[2] = ii;
		objects[2] = new ArraySampler();

		countries[2] = "INDIA";
		for (int j = 0; j < numbers.length; j++) {
			if (j < (numbers.length - 1)) {
				numbers[j] = numbers[j + 1];
			}
			out.println(numbers[j]);
		}

		// for each loop
		for (int number : numbers) {
			out.println(number);
		}

		for (String country : countries) {
			out.println(country);
			country = "INDIA";
		}
		for (String country : countries) {
			out.println(country);
		}

		// 2d arrays
		int[][] matrix = new int[2][2];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = 1;
			}
		}
		for (int[] i : matrix) {
			for (int j : i) {
				out.println("value is " + j);
			}
		}

		//
		String[][] countryStates = { { "Alaska", "Arizona", "New York" }, { "Delhi", "Karnataka", "Maharashtra" } };
		String[][] states = new String[2][3];
		String[][] myStates = new String[2][];
		myStates[0] = new String[2];
		myStates[1] = new String[2];

		myStates[0][0] = "Bihar";
		myStates[0][1] = "Kerela";
		for (String[] stats : myStates) {
			for (String myState : stats) {
				out.println(myState);
			}
		}
		for (int i = 0; i < myStates.length; i++) {
			for (int j = 0; j < myStates[i].length; j++) {
				myStates[i][j] = "Arizona";
			}
		}
		int[][] nums = new int[2][2];
		int[] vals = { 1, 2 };

		int[] moreVals = { 3, 4 };

		nums[0] = vals;
		nums[1] = moreVals;

	}
}
