package com.ibm.java;

public class InnerClassDemo {

	public static void main(String[] args) {
		Super supr = new Super();
		supr.hello();
		//non static inner
		Super.Inner inner = supr.new Inner();
		inner.hi();

		// static inner
		Super.StatInner statsInner= new Super.StatInner();
		statsInner.stats();
		//statsInner.test();
		Super.StatInner.test();
		
		// Outer Class
		MySuper outerObj = new MySuper();
		// with local inner class
		outerObj.superM();
		// Inner Class - Non Static
		MySuper.Inner innerObj = outerObj.new Inner();
		innerObj.innerMethod();
		// Inner Class - Static
		MySuper.StaticInner staticInnerObj = new MySuper.StaticInner();
		staticInnerObj.nonStaticMethod();
		// static method with static inner class - ref. via. Class Name 
		MySuper.StaticInner.staticInnerMethod();
		
		
	}

}

class MySuper {
	void superM() {
		System.out.println("Super M");
		class LocalInner{
			void localInnerMethod() {
				System.out.println("localInnerMethod");		
			}
		}
		LocalInner local=new LocalInner();
		local.localInnerMethod();
	}
	class Inner{
		void innerMethod() {
			System.out.println("InnerMethod");	
		}
	}
	static class StaticInner{
		void nonStaticMethod() {
			System.out.println("Static Class Static Method ");	
		}
		static void staticInnerMethod() {
			System.out.println("Static Inner Class Method");	
		}
	}
}