package com.ibm.java.impl;

import static com.ibm.java.impl.util.UserSerializer.read;
import static com.ibm.java.impl.util.UserSerializer.write;

import java.util.Arrays;

import com.ibm.java.beans.User;
import com.ibm.java.sort.UserByCityComparator;
import com.ibm.java.sort.UserSort;

public class UserMain {

	public static void main(String[] args) throws Exception {
		// [] users;
		User myUser = new User(2, "Mohsin", "Delhi");
		User[] users = { myUser, new User(1, "Khursheed", "Mumbai"), new User(5, "John", "Bengaluru") };

		UserSort sort = new UserSort();
		// sort.byCity(users);
		// sort.byName(users);

		//
		sort.sort(users, "NAME");
		System.out.println("By City ");
		sort.sort(users, "CITY");

		// Serialization / De serialization
		write(myUser);
		User newUsr = read();
		System.out.println("De serialized Object " + " city is " + newUsr.getCity());
	}
}
