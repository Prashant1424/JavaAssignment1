package com.assignment3.java;

import java.util.Arrays;
import java.util.Scanner;

public class PrintingDuplicateElementOfArray {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter size of Array : ");
		
		int size = scan.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the Elements in Array of length "+size+".");
		
		for(int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		
//		Arrays.sort(arr);
		int[] temp = new int[arr.length];
		int c,count,temp2=0;
		temp[0]=arr[0];
		for(int i = 0; i < size; i++) {
			c=i;
			count=0;
			for(int j=i+1; j<size; j++) {
				if(arr[i]!=arr[j]) {
					temp[c++]=arr[i];
					count++;
					temp2=arr[j];
				}
			}
			
//			arr=temp;
			if(count>0)System.out.println(temp2);
//if(c>0)System.out.println(temp);
		}
		
		
	}

}
