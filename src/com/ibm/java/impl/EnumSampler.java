package com.ibm.java.impl;

import java.util.Arrays;
import java.util.List;

import com.ibm.java.enums.Month;

public class EnumSampler {

	public static void main(String[] args) {
		Month[] months = Month.values();
		for (Month m : months) {
			System.out.println(m.getVacation().getVacations(m.name()));
		}
		//
		Generix<Integer> gens = new Generix<>();
		gens.getValues(Arrays.asList(1, 2, 3, 4));
	}
}

class Generix<T> {
	public void getValues(List<? super Integer> values) {
		values.forEach(v -> System.out.println(v));
	}
}
