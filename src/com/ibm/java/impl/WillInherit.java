package com.ibm.java.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class WillInherit {

	void collect() {

	}

	public static void main(String arhs[]) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Hi");
		al.add("Hello");
		al.add("Hoy!");
		al.add("Hola!");
		al.remove(1);
		// Array list to Array
		String[] arr = (String[]) al.toArray();
		// Array to Array List
		List als = Arrays.asList(arr);
		List<String> lst = new ArrayList<>();
		lst.add("Hi");
		lst.addAll(al);
		// iterator
		Iterator itr = lst.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Vector");
		// Vector
		Vector<String> vect = new Vector<>();
		vect.addAll(lst);
		Iterator itr1 = lst.listIterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
}
