package com.ibm.java.impl;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.ibm.java.beans.Employee;
import com.ibm.java.beans.Product;

public class CollectionSamples {

	public static void main(String[] args) {

		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee(2, "John", "joh@gmail.com"));
		emps.add(new Employee(1, "Steve", "stev@gmail.com"));
		emps.add(new Employee(12, "Tom", "tom@gmail.com"));
		emps.add(new Employee(6, "Jerry", "jerr@gmail.com"));

		emps.forEach(emp -> System.out.println(emp.toString()));
		Collections.sort(emps, (obj1, obj2) -> { /* Name Comparator */
			return obj1.getName().compareTo(obj2.getName());
		});

		System.out.println("Sorted ");
		emps.forEach(emp -> System.out.println(emp.toString()));

		Integer[] nos = { 12, 34, 3, 2, 5 };
		List<Integer> noLst = Arrays.asList(nos);
		noLst.forEach(System.out::println);
		out.println("Stream API");
		noLst = noLst.stream().filter(num -> {
			return num % 2 == 0;
		}).collect(Collectors.toList());
		noLst.forEach(out::println);
		collect();
	}

	public static void collect() {

		// Map - interface
		// HashMap - class
		// TreeMap - class
		// HashTable - class

		Map<Employee, String> hm = new HashMap<>();

		hm.put(new Employee(1, "Aman", "aman@gmail.com"), "IBM");
		// hm.put(null, null);
		hm.put(new Employee(2, "Karthik", "k@gmail.com"), "Cognizant");
		hm.put(new Employee(3, "Sameer", "s@gmail.com"), "Capgemini");
		hm.put(new Employee(6, "Raju", "ra@wipro.com"), "Wipro");
		hm.put(new Employee(7, "Raju", "raju@ibm.com"), "IBM");

		// hm.put(null, "Hello");
		// System.out.println(hm.put(5, "TCS"));
		System.out.println("Value is " + hm.get(new Employee(6, "Raju", "ra@wipro.com")));
		for (Map.Entry<Employee, String> el : hm.entrySet()) {
			System.out.println("Key: " + el.getKey().toString() + " Value: " + el.getValue());
		}
		// Set<Employee> ss = hm.keySet();
		List<Employee> empS = hm.keySet().stream().filter(el -> {
			return el.getName().equalsIgnoreCase("Raju");
		}).collect(Collectors.toList());

		// Method Reference
		empS.forEach(out::println);
		//
		Integer[] arrN = { 1, 2, 10, 16, 15, 7, 8 };
		Arrays.asList(arrN).stream().filter(a -> { /* Even Validation */
			return a % 2 == 0 && a < 10;
		});
		// .collect(Collectors.toList())
		// .parallelStream()
		// .filter(a -> {
		// return a < 10;
		// })
		// .forEach(out::println);

		// LAMBDA

		List<List<Integer>> lstWithin = new ArrayList<>();
		lstWithin.add(Arrays.asList(new Integer[] { 1, 2, 3, 4 }));
		lstWithin.add(Arrays.asList(new Integer[] { 5, 6, 7, 8 }));
		lstWithin.add(Arrays.asList(new Integer[] { 9, 10, 11, 12 }));
		CollectionSamples sample = new CollectionSamples();

		lstWithin.stream().flatMap(Collection::stream).collect(Collectors.toList()).forEach(sample::execute);

		String[] strs = new String[5];
		Stream.of(Arrays.asList(new String[] { "Hello", "World", "How", "Are", "You" })).flatMap(Collection::stream)
				.map(String::toUpperCase).collect(Collectors.toSet()).toArray(strs);
		for (String s : strs)
			out.println(s);

		// Map --> list of values -> map<empId,emp>
		Map<Integer, Employee> eMap = Stream.of(hm.keySet()).flatMap(Collection::stream)
				.collect(Collectors.toMap(Employee::getId, emp -> emp));

		for (Map.Entry<Integer, Employee> entry : eMap.entrySet()) {
			out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}
		Map<Integer, String> tree = new TreeMap<>();
		tree.put(23, "TwentyThree");
		tree.put(4, "Four");
		tree.put(2, "Two");

		for (Map.Entry<Integer, String> entry : tree.entrySet()) {
			out.println(entry.getKey() + "   " + entry.getValue());
		}
		Map<Product, String> pTree = new TreeMap<>();
		pTree.put(new Product(3, "iPhone", 130.0), "Apple");
		pTree.put(new Product(1, "Lumia", 45.25), "Nokia");
		pTree.put(new Product(12, "Pixel", 250), "Google");
		for (Map.Entry<Product, String> entry : pTree.entrySet()) {
			out.println(entry.getKey() + "  " + entry.getValue());
		}
		// make the tree map thread safe 
		Collections.synchronizedMap(pTree);
		Map<String,Integer> conMap =new ConcurrentHashMap<>();
	}

	public static void render(Integer number) {
		out.println(number);
	}

	public void execute(Integer number) {
		out.println(number);
	}
}
