/*Write a LeapYear.java program that takes a year as input and outputs the Year is a Leap Year or
 *  not a Leap Year. The LeapYear program only works for year >= 1582, corresponding to a year in
 *  the Gregorian calendar. So ensure to check for the same. Further, the Leap Year is a Year 
 *  divisible by 4 and not 100 unless it is divisible by 400. For e.g. 1800 is not a Leap Year and
 *  2000 is a Leap Year.
*/

package com.assignment.java;

import java.util.*;

public class ProgramForLeapYear {

	static int year;
	
	@SuppressWarnings("resource")
	
	public static void main(String[] args) {
		
		System.out.println("Enter any year after 1582.");
		
		Scanner scan = new Scanner(System.in);
		
		year = scan.nextInt();
	
		System.out.println("Your Inputed year is : " + year);
		
		if(year > 1582)
		{
			if(year % 400 == 0) {
				System.out.println("Your Entered Year : " + year + " is a leap year");
			}
			else if(year % 4 == 0 && year % 100 !=0) {
				System.out.println("Your Entered Year : " + year + " is a leap year");			
			}
			else {
				System.out.println("Your Entered Year : " + year + " is not a leap year");	
			}
		}
	}

}
