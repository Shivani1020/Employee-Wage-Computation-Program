package com;

import java.util.Random;

public class WageComputation {
	
	public static void main(String[] args) {
		System.out.println("--------------------------------------------------------------");
		System.out.println("~~~~~~~~~Welcome to Employee Wage Computation Program~~~~~~~~~");
		System.out.println("--------------------------------------------------------------");
		
		Random random = new Random();
		int attendence = random.nextInt(2);   // 2 indicates that either 0 or 1 is generated. 
		if(attendence == 1)  // 1 -> Present, 0-> Absent
		{
			System.out.println("Employee is Present.");
		}
		else 
		{
			System.out.println("Employee is Absent.");
		}
		
	}

}
