package com.ibm.java.api;

import java.util.List;

import com.ibm.java.beans.User;
import com.ibm.java.exceptions.UserException;

public interface UserService {
	void addUser(User user) throws UserException;

	User getUser(int id) throws UserException;

	List<User> getUsers();

}
