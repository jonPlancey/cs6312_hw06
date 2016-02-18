package edu.westga.cs6312.interfaces.model;


/**
 * Homework HW06  
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	02.10.2016
 */
public class Time implements Formatter {

	private int hour;
	private int minute;
	private int second;	


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
	public Time(int hour, int minute, int second) {
		if (hour < 0 || hour > 23) {
			throw new IllegalArgumentException("Invalid hour, hour < 0, hour > 23");
		}
		if (minute < 0 || minute > 60) {
			throw new IllegalArgumentException("Invalid minute, minute < 0,  minute > 60");
		}		
		if (second < 0 || second > 60) {
			throw new IllegalArgumentException("Invalid second, second < 0, second > 60"); 					
		}
		if (hour > -1 && hour < 24) {
			this.hour = hour;
		}
		if (minute > -1 && minute < 61) {
			this.minute = minute;
		}
		if (second > -1 && second < 61) {
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
	public Time(int hour, int minute) {
		if (hour < 0 || hour > 23) {
			throw new IllegalArgumentException("Invalid hour, hour < 0 , hour > 24");
		}
		if (minute < 0 || minute > 60) {
			throw new IllegalArgumentException("Invalid minute, minute < 0,  minute > 60");
		}		
		if (hour > -1 && hour < 24) {
			this.hour = hour;
		}
		if (minute > -1 && minute < 61) {
			this.minute = minute;
		}
		this.second = 0;		
	}	
	
	/** 
	 * 0 parameter constructor that 
	 * initializes the object to midnight
	 */ 	
	public Time() {
		this.hour = 0;		
		this.minute = 0;
		this.second = 0;
	}
	
	
	
	/** 
	 * increment hour value by 1
	 */ 		
	private int incrementHour() {
	    if (this.hour == 24) {
	    	this.hour = 0;
	    }
		this.hour++;
	    return this.hour;
	}
	
	/** 
	 * increment minute value by 1
	 */ 		
	private int incrementMinute() {
	    if (this.minute == 60) {
	    	this.minute = 0;
			this.incrementHour();	    	
	    }
		this.minute++;
	    return this.minute;		
	}	
	
	/** 
	 * increment second value by 1
	 */ 	
	private int incrementSecond() {
	    if (this.second == 60) {
	    	this.second = 0;
	    	this.incrementMinute();
	    }
		this.second++;
	    return this.second;			
	}
	
	
	
	/** 
	 * increment time by 1 second
	 */ 	
	public void tick() {
		this.incrementSecond();		
	}	

	
	
	
	/** 
	 * return representation of time as string
	 * @return time as string
	 */
	@Override
	public String toString() {
		return this.hour + ":"  + this.minute + ":"  + this.second;
	}	
			
	
	
	
	/** 
	 * return formated version of time as string
	 * @return formated time
	 */
	@Override
	public String format() {
		String hoursZero = "";
		String minutesZero = "";
		String secondsZero = "";
		
		if (this.hour < 10) {
			hoursZero  = String.format("%02d", this.hour);
		} else {
			hoursZero = String.valueOf(this.hour);
		}
		
		if (this.minute < 10) {
			minutesZero  = String.format("%02d", this.minute);			
		} else {
			minutesZero  = String.valueOf(this.minute);
		}
		
		if (this.second < 10) {
			secondsZero  = String.format("%02d", this.second);			
		} else {
			secondsZero = String.valueOf(this.second);
		}
		
		return  hoursZero + ":"  + minutesZero + ":"  + secondsZero;
	}		
	
	
	
	
	
	/** 
	 * Gets the minutes value
	 * @return return minutes  
	 */ 	
	public int getMinute() {
		return this.minute;		
	}	

	
	/** 
	 * gets the seconds value
	 * @return return hours 
	 */ 	
	public int getSecond() {
		return this.second;		
	}	

	
	/** 
	 * gets the hours value
	 * @return return hours
	 */ 	
	public int getHour() {
		return this.hour;		
	}	

	


	
	
	
}
