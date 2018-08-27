package com.ibm.java.impl;

import com.ibm.java.api.Service;
import static com.ibm.java.api.Service.add;
import static com.ibm.java.api.Department.subtract;
import static java.lang.System.out;

import com.ibm.java.api.Calculator;

public class IBMServiceImpl implements Service {

	@Override
	public void verify() {
		out.println("Verify Method");
	}

	@Override
	public void verify(String str) {
		// TODO Auto-generated method stub

	}

	@Override
	public int validate(int number) {
		return number + 10;
	}

	public void calculate(String operation, int first, int next) {
		/*
		 * switch (operation) { case "ADD": add(first, next); break; case "SUBTRACT":
		 * subtract(first, next); break; default:
		 * System.out.println("Please verify ur choice"); }
		 */
		Calculator calc = new Calculator() {

			@Override
			public void operate(String operation, int first, int next) {

				switch (operation) {
				case "ADD":
					add(first, next);
					break;
				case "SUBTRACT":
					subtract(first, next);
					break;
				default:
					System.out.println("Please verify ur choice");
				}

			}

		};
		calc.operate(operation, first, next);
	}
}
