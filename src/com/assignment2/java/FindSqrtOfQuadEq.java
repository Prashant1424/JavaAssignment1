/*Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
 * Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
 * can be found using a formula delta = b*b - 4*a*c
 * Root 1 of x = (-b + sqrt(delta))/(2*a)
 * Root 2 of x = (-b - sqrt(delta))/(2*a)
 * Take a, b, and c as input values to find the roots of x.
 */

package com.assignment2.java;

import java.util.Scanner;
import java.lang.Math;

public class FindSqrtOfQuadEq {

	static int a, b, c;
	
	static double delta, root1, root2;
	
	@SuppressWarnings("resource")

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter value of a : ");
		
		a = scan.nextInt();

		System.out.println("Enter value of b : ");
		
		b = scan.nextInt();

		System.out.println("Enter value of c : ");
		
		c = scan.nextInt();
		
		delta = b*b - 4*a*c;
		
		if( delta == 0) {
			root1 = -b/(2*a);
			System.out.println(root1);
//			root2 = -b/2*a;
			System.out.println("Both roots are real and equal i.e. : " + root1);
		}else if( delta > 0 ) {
			root1 = (-b+Math.sqrt(delta))/(2*a);
			root2 = (-b-Math.sqrt(delta))/(2*a);
			System.out.println("First root of quadratic equation is : " + root1);
			System.out.println("Second root of quadratic equation is : " + root2);
		}else {
			System.out.println("Roots are imaginary");
		}	

	}

}
