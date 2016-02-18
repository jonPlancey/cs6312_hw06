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
	 * Precondition: hour < 0 || hour > 24, minute < 0 || minute > 60, second < 0 || second > 60
	 * Postcondition: An animal of whose type is kind and is
	 *                covered with covering
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
}
