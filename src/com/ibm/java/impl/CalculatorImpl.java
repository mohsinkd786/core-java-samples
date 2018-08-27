package com.ibm.java.impl;

import com.ibm.java.calc.api.Calculator;

public class CalculatorImpl implements Calculator {

	public int result;

	@Override
	public void add(int first, int next) {
		this.result = first + next;
	}

	@Override
	public void diff(int first, int next) {
		this.result = first - next;
	}

	@Override
	public void product(int first, int next) {
		result = first * next;
	}
}
