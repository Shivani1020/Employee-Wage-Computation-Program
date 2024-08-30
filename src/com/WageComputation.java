package com;

import java.util.Random;



public class WageComputation {
	
//	static final int wage_per_hour = 20;
//	static final int full_day_hour = 8;
//	static final int part_time_hour = 4;
//	static final int working_day_per_month = 20;
//	static final int max_working_day = 20;
//	static final int max_working_hour = 100;
	
//	private int total_wage;
//    private int totalWorkingDays;
//    private int totalWorkingHours;
    
//    public WageComputation() // constructor to initialize class variables
//    {
//    	this.total_wage = 0;
//    	this.totalWorkingDays = 0;
//    	this.totalWorkingHours = 0;
//    }
    
    public static void computeEmployeeWage(String company, int wage_per_hour, int max_working_day, int max_working_hour)   
    {
    	int total_wage = 0;
    	int totalWorkingDays = 0;
    	int totalWorkingHours = 0;
    	final int full_day_hour = 8;
    	final int part_time_hour = 4;
    	System.out.println("\t\tWage Computation For "+company);
    	System.out.println("\t--------------------------------------------------------------");
    	while(totalWorkingDays < max_working_day && totalWorkingHours < max_working_hour)
		{
			int attendence = getAttendence();
			totalWorkingDays++;
			int dailywage =0;
			int workedhours = 0;
			
			switch(attendence)
			{
			case 1:
			{
				workedhours = full_day_hour;
				dailywage = calculateDailyWage(workedhours, wage_per_hour);
				System.out.println("\tDay "+totalWorkingDays+": Employee present for Full-time and wage for the day: $"+dailywage );
				
			}
			break;
			
			case 2:
			{
				workedhours = part_time_hour;
				dailywage = calculateDailyWage(workedhours, wage_per_hour);
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
    	//display
    	System.out.println();
    	System.out.println("\tTotal wage for "+company+ ": $"+total_wage);
    	System.out.println("\tTotal Working Days for "+company+": "+ totalWorkingDays);
    	System.out.println("\tTotal Working Hours for "+company+ ": "+totalWorkingHours);
    	System.out.println("\t--------------------------------------------------------------");
    	System.out.println();
    }
	
	static int getAttendence(){
		Random random = new Random();
		return random.nextInt(3);   //0-> Absent, 1-> Full time , 2-> Part time
	}
	
	static int calculateDailyWage(int hours, int wage_per_hour ) {
		return hours * wage_per_hour;
	}

	
	public static void main(String[] args) {
		System.out.println("\t--------------------------------------------------------------");
		System.out.println("\t~~~~~~~~~Welcome to Employee Wage Computation Program~~~~~~~~~");
		System.out.println("\t--------------------------------------------------------------");
		System.out.println();
		
		computeEmployeeWage("Company Abc", 20, 20, 100);
		computeEmployeeWage("Company DEF", 25, 30, 150);
		computeEmployeeWage("Company GHI", 20, 25, 120);

	}

}
