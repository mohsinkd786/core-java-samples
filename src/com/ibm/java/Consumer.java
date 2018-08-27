package com.ibm.java;

import static java.lang.System.out;

public class Consumer {

	static String message = "Consumer Class";
	static {
		out.println("Static Block");
	}
	{
		out.println("Instance Block");
	}
	static void main(String [] abc) {
		
	}
}
