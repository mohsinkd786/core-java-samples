package com.ibm.java.impl;

import com.ibm.java.EmployController;
import com.ibm.java.beans.Employ;

public class JdbcSample {

	public static void main(String[] args) {
		executeEmploy();

		/*
		 * CallableDAO dao = new CallableDAO(); try { System.out.println("SUM is " +
		 * dao.calculate(55, 13)); System.out.println("Factorial of 5 is " +
		 * dao.factorial(5, "while"));
		 * 
		 * } catch (SQLException e) { e.printStackTrace(); }
		 */
		/*
		 * try {
		 * 
		 * Dao.calculate(10, 2); Dao.sum(15, 10);
		 * 
		 * Dao.fetchEmployees().stream().forEach(System.out::println);
		 * System.out.println("$$$$$$$$$$$$$$$$$$$$$$$"); Employ emp =
		 * Dao.fetchEmployee(3, 2); if (emp != null) System.out.println(emp.toString());
		 * } catch (SQLException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
	}

	public static void executeEmploy() {
		EmployController control = new EmployController();
		// fetch all records
		// control.fetchAll().stream().forEach(System.out::println);
		// fetch one record
		// System.out.println(control.fetchOne(3));
		// add record
		Employ emp = new Employ(15, "Bagheera", "bag@yahoo.com", 2, 453000);
		control.employTransact(emp);
		control.fetchAll().stream().forEach(System.out::println);

	}
}
