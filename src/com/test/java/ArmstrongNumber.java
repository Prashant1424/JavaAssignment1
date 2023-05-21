package com.test.java;

import java.util.Scanner;

import java.lang.Math;

public class ArmstrongNumber {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num, temp;
		
		double temp1 = 0;
		
		System.out.print("Enter any number : ");
		
		num = scan.nextInt();
		
		temp = num;
		
		while( temp > 0) {
			
			temp1 = temp1 + Math.pow((temp % 10),3);
			
			temp = temp / 10;
		}
		
		System.out.println("");
		
		if( num == temp1)
			
			System.out.println("The Entered number " + num + " is an Armstrong number.");
		
		else
			
			System.out.println("The Entered number " + num +" is not an Armstrong number.");
			
	}

}
