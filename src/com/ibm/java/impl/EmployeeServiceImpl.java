package com.ibm.java.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.ibm.java.beans.User;

public class EmployeeServiceImpl extends UserServiceImpl {

	private static List<User> users;
	// Instance Block;
	{
		users = new ArrayList<>();
		users.add(new User(55, "Roger", "Bengaluru"));
	}

	@Override
	public void addUser(User user) throws RuntimeException {
		users.add(user);
	}
}
