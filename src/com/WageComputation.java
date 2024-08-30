package com;

import java.util.Random;



public class WageComputation {
	
	static final int wage_per_hour = 20;
	static final int full_day_hour = 8;
	static final int part_time_hour = 4;
	static final int working_day_per_month = 20;
	static final int max_working_day = 20;
	static final int max_working_hour = 100;
	
	private int total_wage;
    private int totalWorkingDays;
    private int totalWorkingHours;
    
    public WageComputation() // constructor to initialize class variables
    {
    	this.total_wage = 0;
    	this.totalWorkingDays = 0;
    	this.totalWorkingHours = 0;
    }
    
    public void computeEmployeeWage()   // method to calculate employee wage
    {
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
    	display();
    }
	
	static int getAttendence(){
		Random random = new Random();
		return random.nextInt(3);   //0-> Absent, 1-> Full time , 2-> Part time
	}
	
	static int calculateDailyWage(int hours) {
		return hours * wage_per_hour;
	}
	
	public void display() {
		System.out.println();
		System.out.println("\tTotal wage of Employee for one month: $"+total_wage);
		System.out.println("\tTotal Working Days: "+ totalWorkingDays);
		System.out.println("\tTotal Working Hour: "+totalWorkingHours);
	}
	
	public static void main(String[] args) {
		System.out.println("\t--------------------------------------------------------------");
		System.out.println("\t~~~~~~~~~Welcome to Employee Wage Computation Program~~~~~~~~~");
		System.out.println("\t--------------------------------------------------------------");
		
		WageComputation employee = new WageComputation();
		employee.computeEmployeeWage();
		
//		int total_wage = 0;
//		int totalWorkingDays = 0;
//		int totalWorkingHours = 0;
	}

}
