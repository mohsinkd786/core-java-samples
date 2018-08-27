package com.ibm.java;

import static java.lang.System.out;

public class Super {

	class InnerS {
		void metrics() {
			out.print("Inner S Metrics");
		}
	}

	void hello() {
		out.println("Super Hello");
	}

	class Inner extends InnerS {

		void hi() {
			out.println("Inner Hi");
		}
	}

	static class StatInner {
		void stats() {
			out.println("StatInner Stats");
		}

		static void test() {
			out.println("StatInner Test");
		}
	}
}

class Sinherit extends Super.StatInner {
	void message() {
		// non static
		message();
		// static
		test();
	}
}

class Inherit extends Super.Inner {
	public Inherit() {
		new Super().super();
	}

	void message() {
		hi();
	}
}