package com.ibm.java.impl;

public class B extends A.MyStatic {

	void message() {
		hello();
		hi();
		// A.MyStatic.hi();
	}
}