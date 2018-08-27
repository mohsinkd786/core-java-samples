package com.ibm.java.impl;

import java.io.IOException;

public class ExceptionSample {

	public static void main(String[] args) {
		ExceptionSample sample = new ExceptionSample();
		try {
			sample.verify(new Inner(), 10, 1);
			new Inner().render();

		} catch (NullPointerException | IOException ex) {
			System.out.println("Exception ex");
		}
		try {
			new Inner().render();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void verify(Inner inn, int i, int j) {
		try {
			inn.execute(i, j == 0 ? 1 : j);
			// verify(inn, i, j);
		} catch (NullPointerException ex) {
			// System.out.println("Exception in verify method");
			throw new NullPointerException("Exception in verify method");
		}
	}

}

class Inner {
	public void execute(int i, int j) {
		if (j == 0) {
			j = 1;
			// throw new Exception("Division by Zero is not permitted");
		}
		System.out.println(i / j);
	}

	public void render() throws IOException {
		throw new IOException("Render Method");
	}
}
