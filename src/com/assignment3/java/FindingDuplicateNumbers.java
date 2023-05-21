package com.assignment3.java;

import java.util.Scanner;

public class FindingDuplicateNumbers {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.print("Enter size of array : ");
		
		int size = scan.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("");
		
		System.out.println("Enter " + size + " elements in array.");
		
		for(int i = 0; i < size; i++) {
		
			arr[i] = scan.nextInt();
		
		}
		
		System.out.println("");
		
		System.out.print("The Duplicate numbers in above array are : ");
		
		for(int i = 0; i < size; i++) {
			
			for(int j = i+1; j < size; j++) {
				
				if(arr[i] == arr[j]) System.out.print(arr[i] + " ");
			}
		}
		
	}

}
