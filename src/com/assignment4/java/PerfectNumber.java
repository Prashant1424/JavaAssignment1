/* Write a program to find Perfect Number : The Perfect Number is a special type of positive number.
 * When the number is equal to the sum of its positive divisors excluding the number, it is called
 *  a Perfect Number. For example, 28 is the perfect number because when we sum the divisors of 28,
 *   it will result in the same number.
 *	The divisors of 28 are 1, 2, 4, 7, and 14. So,
 * 28 = 1+2+4+7+14
 * 28 = 28
 */

package com.assignment4.java;

import java.util.Scanner;

public class PerfectNumber {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num, temp = 0;
		
		System.out.println("Enter a positive Number : ");
		
		num = scan.nextInt();
		
		
		for(int i = 1; i < num; i++) {
			
			if(num % i == 0) temp = temp + i;
		
			
		}
		
		if(temp == num)
			
			System.out.println("Entered number " + num + " is a Perfect number.");
		
		else

			System.out.println("Entered number " + num + " is not a Perfect number.");

		
		
	}

}
