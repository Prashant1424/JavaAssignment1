// Write a program to check two strings are equal or not.

package com.assignment.java;

import java.util.Scanner;

public class StringComparision {

	static String a = "Prashant";	//	Static variable : Can be called by Class name or by Object name or Directly inside a class
	String b = "Prashant";			// Non Static or Instance variable : Can be called by Object name only inside a class.
	
	@SuppressWarnings("resource")
	
	public static void main(String[] args) {
		
		String c;
		
		StringComparision sc = new StringComparision();
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println(a);
//		System.out.println(sc.b);
		
		c = scan.next();
		
//		System.out.println(c);
		
//		We can directly compare any default data types with == operators
		
		System.out.println("We are comparing default string a & b and the result is " + (a == sc.b) + ".");
		
//		We can also directly compare any default data types and user inputed data types except String.
//		To compare Default String and User entered string we have to use equal method i.e. .equal() example : str1.equal(str2);
		
		System.out.println("We are comparing default string a & user entered string c and the result is " + (a.equals(c)) + ".");
	}

}
