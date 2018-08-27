package com.ibm.java.impl;

import java.util.Comparator;

public class TestByNameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Test prev = (Test) o1;
		Test next = (Test) o2;

		return prev.name.compareTo(next.name);
	}

}
