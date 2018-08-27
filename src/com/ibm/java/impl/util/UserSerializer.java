package com.ibm.java.impl.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.ibm.java.beans.User;

public class UserSerializer {

	// write object
	public static void write(User u) throws Exception {
		FileOutputStream file = new FileOutputStream("myuser.ser");
		ObjectOutputStream objectU = new ObjectOutputStream(file);
		objectU.writeObject(u);
		// close the streams
		objectU.close();
		file.close();
	}

	// read object
	public static User read() throws Exception {
		FileInputStream file = new FileInputStream("myuser.ser");
		ObjectInputStream obj = new ObjectInputStream(file);
		User u = (User) obj.readObject();
		obj.close();
		file.close();
		return u;
	}
}
