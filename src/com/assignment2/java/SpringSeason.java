/* Write a program SpringSeason.java that takes two int values m and d from the command line and print
 *  true if day d of month m is between March 20 (m = 3, d=20) and June 20 (m = 6, d = 20), false otherwise.
 */

package com.assignment2.java;

public class SpringSeason {

	public static void main(String[] args) {
				
		int m = Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);
		
		if(m == 3 && d >= 20 && d <= 31)
			System.out.println(true);
		else if(m == 4 && d >= 1 && d <= 30)
			System.out.println(true);
		else if(m == 5 && d >= 1 && d <= 31)
			System.out.println(true);
		else if(m == 6 && d >= 1 && d <= 20)
			System.out.println(true);
		else
			System.out.println(false);
					
	}

}
