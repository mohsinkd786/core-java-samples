package com.ibm.java;

import com.ibm.java.api.Calculator;
import com.ibm.java.api.Hello;
import com.ibm.java.impl.IBMServiceImpl;

public class Executor {

	public void execute() {

		Calculator calc = new Calculator() {

			@Override
			public void operate(String operation, int first, int next) {
				System.out.println("Calculator");
			}
		};
		calc.operate("TEST", 1, 2);
	}

	public static void main(String[] args) {
		IBMServiceImpl service = new IBMServiceImpl();
		service.calculate("ADD", 10, 5);
		service.calculate("SUBTRACT", 10, 5);

		// Lambda expression
		Hello hello = (message) -> {
			return message;
		};
		hello.message("Hello how r u");
	}

}
