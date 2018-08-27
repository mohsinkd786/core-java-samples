package com.ibm.java.impl;

import java.util.ArrayList;
import java.util.List;

public class Cars {

	public static void main(String[] args) {
		ArrayList<BMW> bmws = new ArrayList<>();
		ArrayList<Benz> benzs = new ArrayList<>();
		// bmw
		bmws.add(new BMW());
		bmws.add(new BMW());
		// benz
		benzs.add(new Benz());
		benzs.add(new Benz());
		List<MyCar> cars = new ArrayList<>();
		cars.addAll(bmws);
		cars.addAll(benzs);

		for (MyCar car : cars) {
			car.info();
		}

		BMW<Integer> myBmw = new BMW<>();
		String str = "Hello";
		int i = 1237;
		myBmw.myBMW(i);

		Benz<ArrayList, Integer> myBenz = new Benz<>();
		myBenz.myObj = new ArrayList();
		myBenz.myBenz();

		List<Number> nos = new ArrayList<>();
		nos.add(new Integer(10));
		nos.add(new Float(12));
		nos.add(new Float(35.12));
		Number num = new Integer(10);
		nos.add(num);
		myBenz.myMessage(nos);
		
	}
}
