package com;

import java.util.Random;

public class WageComputation {
	
	static final int wage_per_hour = 20;
	static final int full_day_hour = 8;
	static final int part_time_wage = 4;
	static final int working_day_per_month = 20;
	
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
		int total_wage = 0;
		
		
		for(int day=1; day<=working_day_per_month; day++)
		{
			int dailywage =0;
			int attendence = getAttendence();  // 2 indicates that either 0 or 1 is generated.
			switch(attendence)
			{
			case 1:
			{
				//System.out.println("Employee is Present for Full time.");
				dailywage = calculateDailyWage(full_day_hour);
				System.out.println("Day "+day+": Employee present for Full-time and wage for the day: $"+dailywage );
				
				
			}
			break;
			
			case 2:
			{
				//System.out.println("Employee is present for Part time");
				dailywage = calculateDailyWage(part_time_wage);
				System.out.println("Day "+day+": Employee present for Part-time and wage for the day: $"+dailywage );
				
			}
			break;
			
			case 0:
				//System.out.println("Employee is Absent.");
				System.out.println("Day "+day+": Employee Absent and wage for the day: $0" );
				
				break;
			}
			total_wage += dailywage;
		}
		
		System.out.println();
		System.out.println("Total wage of Employee for one month: $"+total_wage);
		
	}

}
