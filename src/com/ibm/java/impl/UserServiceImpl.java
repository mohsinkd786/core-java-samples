package com.ibm.java.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.ibm.java.api.UserService;
import com.ibm.java.beans.User;
import com.ibm.java.exceptions.UserException;

public class UserServiceImpl implements UserService {

	private static List<User> users;
	// Instance Block;
	{
		users = new ArrayList<>();
		users.add(new User(1, "Mohsin", "Bengaluru"));
		users.add(new User(2, "Adam", "New York"));
		users.add(new User(4, "Steve", "London"));
	}

	@Override
	public void addUser(User user) throws UserException {
		if (users == null)
			throw new UserException("List of Users is yet to be defined");
		users.add(user);

	}

	@Override
	public User getUser(int id) throws UserException {
		List<User> usr = users.stream().filter(u -> {
			return u.getId() == id;
		}).collect(Collectors.toList());

		if (usr.size() == 0) {
			throw new UserException("Please verify the User Id");
		}
		return usr.get(0);
	}

	@Override
	public List<User> getUsers() {
		return users;
	}
}
