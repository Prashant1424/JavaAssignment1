package com.assignment3.java;

import java.util.Scanner;

public class SortingArray {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter size of Array : ");
		
		int size = scan.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the Elements in Array of length "+size+".");
		
		for(int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		
		int temp;
		
		for(int i = 0; i < size; i++) {
			for (int j = i; j < size; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("Shorted Array is : ");
		
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
	}

}
