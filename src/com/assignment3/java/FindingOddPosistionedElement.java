//Write a Java Program to print the elements of an array present on an Odd positions.

package com.assignment3.java;

import java.util.Scanner;

public class FindingOddPosistionedElement {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter size of Array : ");
		
		int size = scan.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the Elements in Array of length "+size+".");
		
		for(int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i = 1; i < size; i += 2) {
			System.out.print("The Element present at position " + i + " is ");
			System.out.println(arr[i]);
		}
		
		
	}

}
