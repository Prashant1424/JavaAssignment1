// Write a Java Program to print the smallest element in an array

package com.assignment3.java;

import java.util.Scanner;
import java.util.Arrays;

public class FindingSmallestElementInArray {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter size of Array : ");
		
		int size = scan.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the Elements in Array of length "+size+".");
		
		for(int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println("The Smallest no. inside Entered Array is : " + arr[0]);
		
		
	}

}
