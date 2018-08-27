package com.ibm.java.enums;

public enum Month {
	JAN(1), FEB(2), MAR(3), APR(4), MAY(5), JUN(6), JUL(7), AUG(8), SEP(9), OCT(10), NOV(11), DEC(12);
	private int monthIndex;
	private Vacation vacation = new Vacation();

	public int getMonthIndex() {
		return this.monthIndex;
	}

	public Vacation getVacation() {
		return vacation;
	}

	Month(int monthIndex) {
		this.monthIndex = monthIndex;
	}

	public class Vacation {
		public int getVacations(String key) {
			return Month.valueOf(key).getMonthIndex();
		}
	}
}
