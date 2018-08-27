package com.ibm.java.impl;

import static java.lang.System.out;

import java.util.List;

import com.ibm.java.api.UserService;
import com.ibm.java.beans.User;
import com.ibm.java.enums.UserOperation;
import com.ibm.java.exceptions.UserException;

public class UserSample {

	public static void main(String[] args) {
		new UserSample().process();
	}

	private void process() {
		User user = new User(34, "ROGER", "Chennai");
		try {
			UserService service = new UserServiceImpl();
			// FETCH ALL
			execute(UserOperation.FETCHALL, service, user);
			// ADD a new user
			execute(UserOperation.ADD, service, user);
			// FETCH the users
			execute(UserOperation.FETCH, service, user);

		} catch (UserException ex) {
			out.println(ex.getMessage());
		}
		new EmployeeServiceImpl().addUser(user);
	}

	private void execute(UserOperation operation, UserService service, User user) throws UserException {
		switch (operation) {
		case FETCHALL:
			getUsers(service);
			break;
		case FETCH:
			getUser(service, user);
			break;
		case ADD:
			addUser(service, user);
			break;
		default:
			out.println("None of the choices met");
		}
	}

	private void getUsers(UserService service) {
		service.getUsers().forEach(out::println);
	}

	private void getUser(UserService service, User user) throws UserException {
		out.println(service.getUser(user.getId()));
	}

	private void addUser(UserService service, User user) throws UserException {
		service.addUser(user);
	}
}