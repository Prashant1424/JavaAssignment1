package com.assignment3.java;

import java.util.Scanner;

public class ReversingArray {
	
	static Scanner scan = new Scanner(System.in);
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Enter the size of the Array : ");
		
		int size = scan.nextInt();
		
		int arr[] = new int[size];

		System.out.println("Enter " + size + " number of elements in Array.");
		
		for(int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("The reverse of the above Array is : ");
		
		for(int i = size-1; i >=0; i--) {
			System.out.println(arr[i]);
		}
		
	}

}
