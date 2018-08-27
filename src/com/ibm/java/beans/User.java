package com.ibm.java.beans;

import java.io.Serializable;

public class User implements Comparable, Serializable {

	private final long serialVersionID = 1L;
	private int id;
	private String name;
	private transient String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public User(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public int compareTo(Object obj1) {
		User user = (User) obj1;
		if (user.id > this.id) {
			return -1;
		} else if (user.id == this.id) {
			return 0;
		} else {
			return 1;
		}
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
}
