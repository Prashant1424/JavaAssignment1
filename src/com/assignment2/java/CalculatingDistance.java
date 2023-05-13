/*Write a program Distance.java that takes two integer command-line arguments x and y and prints 
 * the Euclidean distance from the point (x, y) to the origin (0, 0). The formulae to calculate
 * distance = sqrt(x*x + y*y). Use Math.power function
*/
package com.assignment2.java;

import java.util.Scanner;
import java.lang.Math;

public class CalculatingDistance {

	static int x, y;
	static double d;
	
	@SuppressWarnings("resource")
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter x co-ordinate : ");
		
		x = scan.nextInt();
		
		System.out.println("Enter y co-ordinate : ");
		
		y = scan.nextInt();
		
		d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		
		System.out.println("The Total Distance between (" + x + "," + y +") and Origin (0,0) is " + d +" .");

	}

}
