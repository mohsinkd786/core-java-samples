package com.ibm.java.sort;

import java.util.Comparator;

import com.ibm.java.beans.User;

public class UserByCityComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		User obj1 = (User) o1;
		User obj2 = (User) o2;
		return obj2.getCity().compareTo(obj1.getCity());
	}
}
