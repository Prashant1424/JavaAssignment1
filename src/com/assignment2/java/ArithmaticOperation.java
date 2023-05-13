/*Enter three numbers and do the following arithmetic Operations find max and min between the 4 results.
	i) a+b*c 		ii) c+a/b
	iii) a%b+c 		iV) a*b+c
*/

package com.assignment2.java;

import java.util.Scanner;

public class ArithmaticOperation {

	static int a, b, c;
		
	@SuppressWarnings("resource")
	
	public static void main(String[] args) {
		
		double res1, res2, res3, res4;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter value of a : ");
		a = scan.nextInt();
		System.out.println("Enter value of b : ");
		b = scan.nextInt();
		System.out.println("Enter value of c : ");
		c = scan.nextInt();
		
//		Calculating Arithmetic Operations :
		
		res1 = a+b*c;
		res2 = c+a/b;
		res3 = a%b+c;
		res4 = a*b+c;
		
		System.out.println("Result of arithmatic operation a+b*c is : " + res1);
		System.out.println("Result of arithmatic operation c+a/b is : " + res2);
		System.out.println("Result of arithmatic operation a%b+c is : " + res3);
		System.out.println("Result of arithmatic operation a*b+c is : " + res4);
		
//		Finding out the maximum value between the 4 outputs
		
		if(res1 > res2 && res1 > res3 && res1 > res4)
			System.out.println("The max from all 4 results is res1 : " + res1);
		else if(res2 > res3 && res2 > res4)
			System.out.println("The max from all 4 results is res2 : " + res2);
		else if(res3 > res4)
			System.out.println("The max from all 4 results is res3 : " + res3);
		else
			System.out.println("The max from all 4 results is res4 : " + res4);
		
//		Finding out the maximum value between the 4 outputs
		
		if(res1 < res2 && res1 < res3 && res1 < res4)
			System.out.println("The min from all 4 results is res1 : " + res1);
		else if(res2 < res3 && res2 < res4)
			System.out.println("The min from all 4 results is res2 : " + res2);
		else if(res3 < res4)
			System.out.println("The min from all 4 results is res3 : " + res3);
		else
			System.out.println("The min from all 4 results is res4 : " + res4);
		
		
	}

}
