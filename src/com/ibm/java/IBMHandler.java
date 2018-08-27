package com.ibm.java;

import static com.ibm.java.Consumer.message;
import static java.lang.System.out;

import java.util.Scanner;

/*
 * author  Mohsin 
 * description 
 * 
 * */

public class IBMHandler {
	
	//instance variable
	int userId;
	String userName;
	final int projectId = 778886;
	//static/ class  variable
	static int appId;	
	
	static {
		out.println("Static Block");
	}
	//instance block
	{
		out.println("Instance Block");
	}
	
	// constructor 
	IBMHandler(){
		out.println("Param less Constructor");
	}
	
	IBMHandler(int userId,int projectId){
		this.userId= userId;
	}
	
	IBMHandler(String userName){
		this.userName=userName;
	}
	public static void main(String[] args) {
		// Creating Instance for the class
		IBMHandler handler = new IBMHandler(23,446);
		IBMHandler handlerWithUserName = new IBMHandler("mohsin.khursheed");
		//Initializing the instance
		//handler.userId = 10;
		
		// appId =12;
		IBMHandler.appId = 15;
		
		out.println("Multiply ");
		out.println(handler.userId +" " + IBMHandler.appId);
		out.println(message);
		
		// loops 
		// for loop
		 // initialization 
		// limit / condition
		// counter / 
		
		for(int a = 10;a > 0;a--) {
			//even number
			/*if(a / 2 == 4 && a % 2 == 0 ) {
				out.println("Eight "+a);
			}else {
				out.println(a);
			}*/
			if(a == 5) {
				continue;
				// this will work
			}	
			out.println(a);
		}
		
		
		// StringBuffer
		
		StringBuffer sb=new StringBuffer("Hello String Buffer");
		sb.append(" ");
		sb.append("World");
		out.println(sb);
		sb.delete(0, 5);
		out.println(sb);
		String fromBuffer =sb.toString();
		out.println(fromBuffer);
		
		// String Builder
		StringBuilder builder=new StringBuilder();
		builder.append(fromBuffer);
		
		out.println(builder);
		
		String message = "This is a simple String, its a complex object";
		String msgSubSet =message.substring(0,5);
		out.println(msgSubSet);
		char[] msgChars = message.toCharArray();
		out.println(msgChars);
		
		String[] subString = message.split(",");
		out.println(subString[1]);
		// Scanner API
		Scanner read = new Scanner(System.in);
		out.println("Please enter your number :");
		int scannerInt= read.nextInt();
		out.println(scannerInt);
		
		read.close();
	}
}
