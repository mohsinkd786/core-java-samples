package com.ibm.java.impl;

public class BMW<M> extends MyCar implements Car {
	public int carId;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + carId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BMW other = (BMW) obj;
		if (carId != other.carId)
			return false;
		return true;
	}

	@Override
	public void specs() {
		System.out.println("BMW Auto");
	}

	@Override
	void info() {
		System.out.println("BMW Info");
	}

	void myBMW(M t) {
		System.out.println(t);
	}

}
