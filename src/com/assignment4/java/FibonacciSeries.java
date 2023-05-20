/* Write a program to print Fibonacci series : This is a special type of series in which
 * the next term is the sum of the previous two terms. For example, if 0 and 1 are the
 *  two previous terms in a series, then the next term will be 1(0+1).
 */

package com.assignment4.java;

import java.util.Scanner;

public class FibonacciSeries {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int size;
		
		System.out.print("Enter the size for the Fibonacci series : ");
		
		size = scan.nextInt();
		
		int a = 0;
		
		int b = 1;
		
		int temp;
		
		System.out.println("");
		
		System.out.print("The Fibonacci series for size " + size + " is : ");
		
		System.out.print(a + " ");
		
		System.out.print(b + " ");
		
		for(int i = 2; i < size; i++) {
			
			temp = a + b;
			
			a = b;
			
			b = temp;
			
			System.out.print(temp + " ");
		}
		
	}

}
