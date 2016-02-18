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
	public Time (int hour, int minute, int second) {
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
	public Time (int hour, int minute) {
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
	public Time () {
		this.hour = 0;		
		this.minute = 0;
		this.second = 0;
	}
	
	
	
	/** 
	 * increment hour value by 1
	 */ 		
	private int incrementHour() {
		int incrementHour = 1;
		return this.hour += incrementHour % 23;
	}
	
	/** 
	 * increment minute value by 1
	 */ 		
	private int incrementMinute() {
		int incrementMinute = 1;
		return this.hour += incrementMinute % 59;
	}	
	
	/** 
	 * increment second value by 1
	 */ 	
	private int incrementSecond() {
		int incrementSecond = 1;
		return this.hour += incrementSecond % 59;
	}
	
	
	
	/** 
	 * increment time by 1 second
	 */ 	
	public void tick() {
		int incrementSecond = 1;
		this.hour += incrementSecond % 59;
	}	

	
	
	
	/** 
	 * return representation of time as string
	 * @return time as string
	 */
	@Override
	public String toString() {
		return this.hour + "_"  + this.minute + "_"  + this.second;
	}	
			
	
	
	
}
