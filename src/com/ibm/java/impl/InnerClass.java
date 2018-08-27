package com.ibm.java.impl;

import static java.lang.System.*;

public class InnerClass {

	public static void main(String[] args) {

		Parent parent = new Parent();
		out.println(parent.message("Hello Parent"));

		// non static child class members

		Parent.Child nonStaticChild = parent.new Child();
		out.println(nonStaticChild.message("what's up"));

		// static child class members
		Parent.StaticChild staticChild = new Parent.StaticChild();
		// static method
		out.println(Parent.StaticChild.verify(12, 11));
		// non static methods
		out.println(staticChild.message(" Finally"));

		Parent.I im = new Parent().new Im();
		im.add();

		MyOuter outr = new MyOuter();
		outr.message();
		//

		// A aa = new A();
		B bb = new B();
		int[] aa = new int[2];
		aa[0] = 1;
		aa[1] = 2;
		int[] a1 = { 1, 2, 3 };

		B[] bbb = new B[3];
		bbb[0] = new B();
		B[] b2 = { new B(), new B(), new B() };

	}
}
