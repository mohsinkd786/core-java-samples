package com.ibm.java.dao;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

public class CallableDAO {

	public int calculate(int first, int next) throws SQLException {
		String sql = "{ call calculate(?,?,?) }";
		CallableStatement state = Connection.conn.prepareCall(sql);
		state.setInt(1, first);
		state.setInt(2, next);
		state.registerOutParameter(3, Types.INTEGER);
		state.execute();
		return state.getInt(3);
	}

	public int factorial(int number, String typeOfIterator) throws SQLException {
		String query = "{ ?= call factorial(?,?) }";
		CallableStatement call = Connection.conn.prepareCall(query);
		call.setInt(2, number);
		call.setString(3, typeOfIterator);
		call.registerOutParameter(1, Types.INTEGER);
		call.execute();
		return call.getInt(1);
	}
}
