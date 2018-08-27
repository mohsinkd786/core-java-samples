package com.ibm.java.impl;

public class A {
	A() {
		System.out.println("A Called");
	}

	class C {
		C() {
			System.out.println("C Called");
		}
	}

	static class MyStatic {
		MyStatic() {
			System.out.println("My Static Called");
		}

		void hello() {
			System.out.println("Hello Called");
		}

		static void hi() {
			System.out.println("Hi Called");
		}
	}
}