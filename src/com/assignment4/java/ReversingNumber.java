package com.assignment4.java;

import java.util.Scanner;

public class ReversingNumber {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int num, temp = 0;
		
		System.out.print("Enter any number : ");
		
		num = scan.nextInt();
		
		while( num > 0) {
			
			temp = temp * 10 + num % 10;
			
			num = num/10;
			
		}
		
		System.out.println("");
		
		System.out.print("Reverse of entered number is : " + temp);
		
	}

}
