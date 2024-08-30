package com;

import java.util.Random;

public class WageComputation {
	
	static final int wage_per_hour = 20;
	static final int full_day_hour = 8;
	static final int part_time_wage = 4;
	
	static int getAttendence(){
		Random random = new Random();
		return random.nextInt(3);   //0-> Absent, 1-> Full time , 2-> Part time
	}
	
	static int calculateDailyWage(int hours) {
		return hours * wage_per_hour;
	}
	
	public static void main(String[] args) {
		System.out.println("--------------------------------------------------------------");
		System.out.println("~~~~~~~~~Welcome to Employee Wage Computation Program~~~~~~~~~");
		System.out.println("--------------------------------------------------------------");
		
		int attendence = getAttendence();  // 2 indicates that either 0 or 1 is generated.
		 
		if(attendence == 1)  //  1-> Full time
		{
			System.out.println("Employee is Present for Full time.");
			int dailywage = calculateDailyWage(full_day_hour);
			System.out.println("Daily wage of Full Time Employee: "+dailywage);
		}
		else if(attendence == 2)  //2-> Part time
		{
			System.out.println("Employee is present for Part time");
			int dailywage = calculateDailyWage(part_time_wage);
			System.out.println("Daily wage of Part time Employee: "+dailywage);
		}
		else   // 0-> Absent
		{
			System.out.println("Employee is Absent.");
		}
		
		
	}

}
