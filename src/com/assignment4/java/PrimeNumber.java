/* Program for Prime Number :  Prime number is also a special type of number. When the number is divided greater 
 * than 1 and divided by 1 or itself is referred to as the Prime number. 0 and 1 are not counted 
 * as prime numbers. All the even numbers can be divided by 2, so 2 is the only even prime number.
 */

package com.assignment4.java;

import java.util.Scanner;

public class PrimeNumber {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num, count = 0;
		
		System.out.println("Enter a number : ");
		
		num = scan.nextInt();
		
		if(num == 0 || num == 1) {
			System.out.println("Entered number " + num + " is not Prime.");
		}else {
			for(int i = 1; i <= num; i++) {
				if( num % i == 0)
					count++;
			}
		
			if(count == 2)
				System.out.println("Entered number " + num + " is Prime.");
			else
				System.out.println("Entered number " + num + " is not Prime.");
		}
	}

}
