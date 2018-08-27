package com.ibm.java.sort;

import java.util.Arrays;
import java.util.Comparator;

import com.ibm.java.beans.User;

public class UserSort {

	public void natural(User[] users) {
		// Natural Sorting
		Arrays.sort(users);
		for (User u : users) {
			System.out.println(u.toString());
		}
	}

	public void byCity(User[] users) {
		// Sorting by City
		Arrays.sort(users, new UserByCityComparator());
		System.out.println("City Comparator");
		for (User u : users) {
			System.out.println(u.toString());
		}
	}

	public void byName(User[] users) {
		// using Lambda function
		Arrays.sort(users, (o1, o2) -> {
			User u1 = (User) o1;
			User u2 = (User) o2;
			return u1.getName().compareTo(u2.getName());
		});
		System.out.println("Name Comparator");
		for (User u : users) {
			System.out.println(u.toString());
		}
	}

	public void sort(User[] users, String sortBy) {
		class ByName implements Comparator {

			@Override
			public int compare(Object arg0, Object arg1) {
				User u0 = (User) arg0;
				User u1 = (User) arg1;
				return u0.getName().compareTo(u1.getName());
			}
		}
		class ByCity implements Comparator {

			@Override
			public int compare(Object arg0, Object arg1) {
				User u0 = (User) arg0;
				User u1 = (User) arg1;
				return u0.getCity().compareTo(u1.getCity());
			}
		}
		// reference variable of type comparator
		Comparator sortUser;
		switch (sortBy) {
		case "CITY":
			sortUser = new ByCity();
			break;
		case "NAME":
			sortUser = new ByName();
			break;
		default:
			sortUser = new ByName();
		}
		Arrays.sort(users, sortUser);

		for (User u : users) {
			System.out.println(u.toString());
		}
	}
}
