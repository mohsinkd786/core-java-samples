package com.ibm.java.impl;

class MyOuter extends Parent.Child {
	MyOuter() {
		new Parent().super();
	}

	void message() {
		message(" Child via My Outer ");
	}
}

public class Parent {
	String message(String message) {
		return message;
	}

	// inner class
	class Child {
		String message(String message) {
			return "Child " + message;
		}
	}

	class InnerChild extends StaticChild {
		String message() {
			// Child cc = new Child();
			// Super Class attribs
			message(" Hello World ");
			myStaticM();
			StaticChild.verify(5, 2);
			return "Inner Child ";
		}
	}

	abstract class Abs {
		abstract void calc();
	}

	class Inherit extends Abs {

		public void calc() {

		}
	}

	interface I {
		void add();

		default void sub() {

		}
	}

	class Im implements I {
		public void add() {

		}
	}

	static class StaticChild implements I {

		public void add() {

		}

		String message(String message) {
			return "Static Child " + message;
		}

		void myStaticM() {

		}

		static String verify(int i, int j) {
			String message = " is Greater than ";
			return i > j ? i + message + j : j + message + i;
		}
	}
}

class Outer extends Parent.Child {
	Outer() {
		new Parent().super();
	}

	void message() {
		System.out.println("Outer Class ");
		System.out.println(message(" Hello "));
		// System.out.println(myMessage());
	}
}