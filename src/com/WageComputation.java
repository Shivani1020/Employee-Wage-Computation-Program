package com;

import java.util.Random;

public class WageComputation {
	
	static final int wage_per_hour = 20;
	static final int full_day_hour = 8;
	static final int part_time_hour = 4;
	static final int working_day_per_month = 20;
	static final int max_working_day = 20;
	static final int max_working_hour = 100;
	
	static int getAttendence(){
		Random random = new Random();
		return random.nextInt(3);   //0-> Absent, 1-> Full time , 2-> Part time
	}
	
	static int calculateDailyWage(int hours) {
		return hours * wage_per_hour;
	}
	
	public static void main(String[] args) {
		System.out.println("\t--------------------------------------------------------------");
		System.out.println("\t~~~~~~~~~Welcome to Employee Wage Computation Program~~~~~~~~~");
		System.out.println("\t--------------------------------------------------------------");
		int total_wage = 0;
		int totalWorkingDays = 0;
		int totalWorkingHours = 0;
		
		while(totalWorkingDays < max_working_day && totalWorkingHours < max_working_hour)
			{
				int attendence = getAttendence(); // 2 indicates that either 0 or 1 is generated.
				totalWorkingDays++;
				int dailywage =0;
				int workedhours = 0;
				
				switch(attendence)
				{
				case 1:
				{
					workedhours = full_day_hour;
					dailywage = calculateDailyWage(workedhours);
					System.out.println("\tDay "+totalWorkingDays+": Employee present for Full-time and wage for the day: $"+dailywage );
					
				}
				break;
				
				case 2:
				{
					workedhours = part_time_hour;
					dailywage = calculateDailyWage(workedhours);
					System.out.println("\tDay "+totalWorkingDays+": Employee present for Part-time and wage for the day: $"+dailywage );
					
				}
				break;
				
				case 0:
					//System.out.println("Employee is Absent.");
					System.out.println("\tDay "+totalWorkingDays+": Employee Absent and wage for the day: $0" );
					
					break;
				}
				total_wage += dailywage;
				totalWorkingHours += workedhours; 
			}
		
		
		System.out.println();
		System.out.println("\tTotal wage of Employee for one month: $"+total_wage);
		System.out.println("\tTotal Working Days: "+ totalWorkingDays);
		System.out.println("\tTotal Working Hour: "+totalWorkingHours);
		
	}

}
