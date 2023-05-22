package com.assignment5.java;

import java.util.Random;

import java.util.Scanner;

public class ComputingEmployeeWages {

	int attendance;
	int hourlyWage = 20;
	int fullTimeWorkingHour = 8;
	int partTimeWorkingHour = 4;
	int workingDay = 20;
	int totalWage;

	Scanner scan = new Scanner(System.in);

	Random rand = new Random();
	
	{

		System.out.println("............Welcome to Employee Wage Computation Program...........\n");
	
	}
	
	int presentAbsent() {
	
		for(int i = 0; i < workingDay; i++) {
		
			attendance += rand.nextInt(2);
		
		}
		
		return attendance;
	
	}
	
	void monthlyWageFullTime(int day) {
		
		totalWage = ( day + 8 ) * fullTimeWorkingHour * hourlyWage;
		
		System.out.println("\nMonthly wage of a Full time employee is : " + totalWage);
		
	}
	
	void monthlyWagePartTime(int day) {
		
		totalWage = ( day + 8 ) * partTimeWorkingHour * hourlyWage;
		
		System.out.println("\nMonthly wage of a Part time employee is : " + totalWage);

	}

	public static void main(String[] args) {

		int dailyWageFullTime;

		int dailyWagePartTime;

		ComputingEmployeeWages ew = new ComputingEmployeeWages();

		dailyWageFullTime = ew.fullTimeWorkingHour * ew.hourlyWage;

		System.out.println("Daily wage of a Full time employee is : " + dailyWageFullTime +"\n");

		dailyWagePartTime = ew.partTimeWorkingHour * ew.hourlyWage;

		System.out.println("Daily wage of a Part time employee is : " + dailyWagePartTime +"\n");

		int present = ew.presentAbsent();

		System.out.println("Total number of days when employee is present is : " + present +"\n");

		System.out.println("Enter 1. For Full time employee.\nEnter 2. For Part time employee.\n");

		int empType = ew.scan.nextInt();

		switch(empType) {

			case 1 :	if(present >= 12) 
							ew.monthlyWageFullTime(present);
						else
							System.out.println("\nTo get your monthly wage you need to be present more than " + present + " days.");
						break;

			case 2 :	if(present >= 12) 
							ew.monthlyWagePartTime(present);
						else
							System.out.println("\nTo get your monthly wage you need to be present more than " + present + " days.");
						break;

			default : System.out.println("\nPlease enter a valid input.");

		}

	}

}
