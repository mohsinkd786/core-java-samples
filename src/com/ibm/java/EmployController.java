package com.ibm.java;

import java.sql.SQLException;
import java.util.List;

import com.ibm.java.beans.Employ;
import com.ibm.java.services.EmployService;

public class EmployController {

	private EmployService service;
	{
		service = new EmployService();
	}

	public List<Employ> fetchAll() {
		try {
			return service.fetchAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Employ fetchOne(int id) {
		try {
			return service.fetchOne(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void add(Employ t) {
		try {
			service.add(t);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateOne(Employ t) {
		try {
			service.updateOne(t);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
