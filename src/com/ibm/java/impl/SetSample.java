package com.ibm.java.impl;

import java.util.*;

public class SetSample {

	public static void main(String[] args) {
		Set<Car> cars = new HashSet<>();
		cars.add(new Benz<ArrayList<Integer>, Integer>());
		cars.add(new BMW<String>());
		cars.add(new Benz<ArrayList<Integer>, Integer>());
		cars.add(new BMW<String>());

		Iterator<Car> itr = cars.iterator();
		while (itr.hasNext()) {
			itr.next().specs();
		}
	}
}
