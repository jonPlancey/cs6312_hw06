package edu.westga.cs6312.interfaces.model;


/**
 * Homework HW06  
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	02.10.2016
 */
public class Time {

	public int hour;
	public int minute;
	public int second;	


	/** 
	 * 3 parameter constructor that accepts the hour 
	 * minute and second values for the new time object
	 * @param hour 		unit of time hours
	 * @param minute 	unit of time in minutes
	 * @param second 	unit of time in seconds
	 * 
	 * Precondition: 	hour < 0 || hour > 24, minute < 0 || minute > 60, second < 0 || second > 60
	 * Postcondition: 	hour > -1 && hour < 25, minute > -1 && minute < 61, second > -1 && second < 61
	 * 			 		set minute, hour and second variables
	 */ 	
	private Time (int hour, int minute, int second) {
		if (hour < 0 || hour > 24) {
			throw new IllegalArgumentException("Invalid number, hour must no be less than 0");
		}
		if (minute < 0 || minute > 60) {
			throw new IllegalArgumentException("Invalid number, minute must no be less than 0");
		}		
		if (second < 0 || second > 60) {
			throw new IllegalArgumentException("Invalid number, second must no be less than 0"); 					
		}
		if (hour > -1 && hour < 25){
			this.hour = hour;
		}
		if (minute > -1 && minute < 61){
			this.minute = minute;
		}
		if (second > -1 && second < 61){
			this.second = second;
		}
		
	}
	
	
	/** 
	 * 2 parameter constructor that accepts the 
	 * hour and minute values for the new time object
	 * @param hour 		unit of time hours
	 * @param minute 	unit of time in minutes
	 * 
	 * Precondition: 	hour < 0 || hour > 24, minute < 0 || minute > 60, second < 0 || second > 60
	 * Postcondition: 	hour > -1 && hour < 25, minute > -1 && minute < 61, set minute, hour variables
	 */ 	
	private Time (int hour, int minute) {
		if (hour < 0 || hour > 24) {
			throw new IllegalArgumentException("Invalid number, hour must no be less than 0");
		}
		if (minute < 0 || minute > 60) {
			throw new IllegalArgumentException("Invalid number, minute must no be less than 0");
		}		
		if (hour > -1 && hour < 25){
			this.hour = hour;
		}
		if (minute > -1 && minute < 61){
			this.minute = minute;
		}
		this.second = 0;		
	}	
	
	/** 
	 * 0 parameter constructor that 
	 * initializes the object to midnight
	 */ 	
	private Time () {
		this.hour = 0;		
		this.hour = 0;
		this.minute = 0;
	}
	
	/** 
	 * 0 parameter constructor that 
	 * initializes the object to midnight
	 */ 	
	private int incrementHour() {
		int incrementHour = 1;
		return this.hour += incrementHour % 24;
	}	
			
	
	
	
}
