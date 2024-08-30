package com;

import java.util.Random;

public class WageComputation {
	static final int wage_per_hour = 20;
	static final int full_day_hour = 8;
	
	static int getAttendence(){
		Random random = new Random();
		return random.nextInt(2);
	}
	
	static int calculateDailyWage() {
		return full_day_hour * wage_per_hour;
	}
	
	public static void main(String[] args) {
		System.out.println("--------------------------------------------------------------");
		System.out.println("~~~~~~~~~Welcome to Employee Wage Computation Program~~~~~~~~~");
		System.out.println("--------------------------------------------------------------");
		
		int attendence = getAttendence();  // 2 indicates that either 0 or 1 is generated.
		 
		if(attendence == 1)  // 1 -> Present, 0-> Absent
		{
			System.out.println("Employee is Present.");
			int dailywage = calculateDailyWage();
			System.out.println("Daily wage of Employee: "+dailywage);
		}
		else 
		{
			System.out.println("Employee is Absent.");			
		}
		
		
	}

}
