package com.ibm.java.enums;

public enum Week {
	MONDAY(1, "MON"), TUESDAY(2, "TUE"), WEDNESDAY(3, "WED"), THURSDAY(4, "THU"), FRIDAY(5, "FRI"), SATURDAY(6, "SAT"),
	SUNDAY(7, "SUN");

	private int id;
	private String code;

	private Me me = new Me();

	public Me getMe() {
		return this.me;
	}

	public int getId() {
		return this.id;
	}

	public String getCode() {
		return this.code;
	}

	public int getDays() {
		return this.ordinal();
	}

	private Week(int id, String code) {
		this.id = id;
		this.code = code;
	}

	public class Me {
		public void getName() {
			System.out.println("Me class called");
		}
	}

	public Week byName(String name) {
		return Week.valueOf(name);
	}
}
