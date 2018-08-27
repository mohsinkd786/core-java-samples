package com.ibm.java.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

import com.ibm.java.beans.Employee;

public class HashCodeSample {

	public static void main(String[] args) {

		Set<Employee> employees = new HashSet<>();
		// employees.add(new Employee(1, "Mohsin", "mo@gmail.com"));
		// employees.add(new Employee(1, "Mohsin", "mo@gmail.com"));
		employees.add(new Employee(2, "Bob", "bob@gmail.com"));
		employees.add(new Employee(2, "Bob", "iambob@gmail.com"));
		// employees.add(null);
		for (Employee em : employees) {
			System.out.println(em.getName());
		}
		// lambda for each
		employees.forEach(emp -> {
			if (emp.getId() == 1)
				System.out.println(emp);
		});

		ArrayList<Employee> lst = new ArrayList<>();
		lst.add(new Employee(2, "Bob", "bob@gmail.com"));
		lst.add(null);
		// stream api
		Stream<Employee> empStream = lst.stream();
		// find first
		Optional<Employee> emp1 = empStream.findFirst();
		if (emp1.get() != null)
			System.out.println(emp1.get().toString());
	}
}
