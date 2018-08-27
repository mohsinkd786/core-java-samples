package com.ibm.java.exceptions;

import java.sql.SQLException;

public class UserException extends SQLException {

	private static final long serialVersionUID = 1L;

	public UserException() {
		super();
	}

	public UserException(String message) {
		super(message);
	}
}
