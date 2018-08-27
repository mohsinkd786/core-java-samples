package com.ibm.java.impl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import com.ibm.java.enums.Week;

public class ConcurrentMapExample {

	public static final String myStr = null;

	public static void main(String[] args) {
		Map<Integer, String> cMap = new ConcurrentHashMap<>(1, 1, 1);
		cMap.put(2, "Hello");
		cMap.put(0, "Hi");
		cMap.put(3, "ssup");

		process(cMap);

		for (Map.Entry<Integer, String> entry : cMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		// synchronized array list
		CopyOnWriteArrayList<String> cp = new CopyOnWriteArrayList<>();
		cp.add("Hello");
		cp.add("Hey");
		cp.add("How r u");
		cp.forEach(c -> System.out.println(c));

		// ENUMS vs Strings
		ConcurrentMapExample example = new ConcurrentMapExample();
		example.executeByEnum(Week.FRIDAY);

		Week[] wks = Week.values(); // array of week enum
		for (Week w : wks) {
			w.getMe().getName();
			System.out.println(w.getId() + " " + w.getCode() + "  " + w.getDays());
		}
	}

	public static void process(Map<Integer, String> map) {
		map.put(2, "OMG");
	}

	public void executeByEnum(Week week) {
		switch (week) {
		case MONDAY:
			System.out.println("MONDAY");
			break;
		case TUESDAY:
			System.out.println("TUESDAY");
			break;
		default:
			System.out.println("Default");
		}
	}
}
