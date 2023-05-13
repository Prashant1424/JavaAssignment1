// Write a program to find the sum of command-line arguments and count the invalid integers entered.

package com.assignment.java;

public class SumOfCMDLineArgs {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int sum = 0;
		int count = 0;
		
		for(int i = 0 ; i < args.length ; i++)
		{
			try {
				sum += Integer.parseInt(args[i]);
			}
			catch(NumberFormatException e) {
				System.out.println("Invalid Integer from Command Line argument is : " + e.toString());
				count++;
			}
		}
		
		System.out.println("Sum of Command line entered input is : " + sum);
		System.out.println("Total number of invalid input (not Integer) is : " + count);
		
	}

}
