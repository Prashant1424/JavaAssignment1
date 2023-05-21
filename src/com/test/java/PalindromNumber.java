package com.test.java;

import java.util.Scanner;

public class PalindromNumber {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		int num, temp, temp1 = 0;
		
		System.out.print("Enter any number : ");
		
		num = scan.nextInt();
		
		temp = num;
		
		while(temp > 0) {
			
			temp1 = temp1 * 10 + temp % 10;
			
			temp = temp/10;
		
		}
		
		System.out.println("");
		
		if(num == temp1)

			System.out.println("Entered number " + num + " is a Palindrom number.");
		
		else
			
			System.out.println("Entered number " + num + " is not a Palindrom number.");
		
	}

}
