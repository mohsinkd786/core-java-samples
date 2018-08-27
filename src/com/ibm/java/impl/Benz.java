package com.ibm.java.impl;

import java.util.ArrayList;
import java.util.List;

public class Benz<T extends ArrayList, V extends Integer> extends MyCar implements Car {

	public T myObj;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((myObj == null) ? 0 : myObj.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Benz other = (Benz) obj;
		if (myObj == null) {
			if (other.myObj != null)
				return false;
		} else if (!myObj.equals(other.myObj))
			return false;
		return true;
	}

	@Override
	public void specs() {
		System.out.println("Benz Auto");
	}

	@Override
	void info() {
		System.out.println("Benz Info");
	}

	void myBenz() {

	}

	void myMessage(List<? extends Number> obj) {
		for (Number n : obj) {
			System.out.println(n);
		}
	}
}
