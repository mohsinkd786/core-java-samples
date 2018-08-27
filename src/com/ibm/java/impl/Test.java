package com.ibm.java.impl;

public class Test implements Comparable {

	public int id;
	public String name;

	public Test(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Object arg0) {
		Test t = (Test) arg0;
		return this.id - t.id;
	}
}
