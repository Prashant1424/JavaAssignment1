// Write a program to demonstrate static variables, methods, and blocks.

package com.assignment.java;

public class StaticVariableMethodBlock {

	static int a = 10;
	static {
		System.out.println("This is a Static Block.");
	
		System.out.println("Calling static variable inside Static Block : " + a);
	}

	static void output() {
		System.out.println("This is a Static Method named <output> Other than main method.");

		System.out.println("Calling static variable inside static method named <output> : " + a);
	}
	public static void main(String[] args) {
		System.out.println("Calling static variable inside main method : " + a);
		output();
	}

}
