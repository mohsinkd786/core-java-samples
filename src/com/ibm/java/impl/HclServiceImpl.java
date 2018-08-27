package com.ibm.java.impl;

import com.ibm.java.api.Department;
import com.ibm.java.api.Service;

public class HclServiceImpl implements Service, Department {

	@Override
	public void verify() {

	}

	@Override
	public void verify(String str) {

	}

	public int add(int i, int j) {
		return i + j;
	}

	@Override
	public int validate(int number) {
		// TODO Auto-generated method stub
		return number;
	}
}
