//Java Program to print the elements of an array

package com.assignment3.java;

import java.util.Scanner;

public class PrintingArrayElement {	
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter array size : ");		
		
		int size = scan.nextInt();
		
		String sub[] = new String[size];

//		To take input in an Array
		System.out.println("Enter "+ size +" number of elements to the " + sub.getClass().getSimpleName() + " Array : ");
		
		for(int i = 0; i < size; i++)
		{
			sub[i]=scan.next();
		}
		
//		To print elements of an Array

		System.out.println("The entered " + sub.getClass().getSimpleName() + " Array is : ");
		
		for(int i = 0; i < sub.length; i++)
		{
			System.out.println(sub[i]);
		}
			

	}

}