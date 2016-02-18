package edu.westga.cs6312.interfaces.view;

import edu.westga.cs6312.interfaces.model.Time;
import java.util.Scanner;
import java.util.ArrayList;


/**
 * Homework HW06  
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	02.10.2016
 */
public class TimeTUI {

	private Scanner userKeyboard;
	private ArrayList<Time> time;

	/**
	 * initialize the instance variable(s).
	 */	
	public TimeTUI() {
		this.userKeyboard = new Scanner(System.in);
		this.time = new ArrayList<Time>();
	}
	
	
	
	/**
	 * controls program flow 
	 **/
	public void run() {
		int userchoice = 0;	
		
		this.displayMenu();		
		

		try {
			userchoice = Integer.parseInt(this.userKeyboard.nextLine());
		} catch (NumberFormatException error) {
			System.out.println("Sorry: [ " + this.getErrorString(error) + " ] is not valid. Enter a number between 1 and 3. \n");
		}
		this.selectionCategories(userchoice);

	}	
	
	
	
	/**
	 * Displays the following numbered 
	 * list of menu options on the console:
	 **/
	public void displayMenu() {
		System.out.println("Welcome to the time collection application");		
		System.out.println("1 - Add an time to the list");
		System.out.println("2 - Print the times in the list"); 
		System.out.println("3 – Quit\n");	
	}
	
	/**
	 * main menu options
	 * prompt user to select 1-3
	 * @param userChoice users menu selection
	 **/
	public void displayMenuInput(int userChoice) {			
		try {
			userChoice = Integer.parseInt(this.userKeyboard.nextLine());
		} catch (NumberFormatException error) {
			System.out.println("Sorry: [ " + this.getErrorString(error) + " ] is not valid. Enter a number between 1 and 3. \n");
		}
		this.selectionCategories(userChoice);
	}	
	
	
	
	/**
	 * Decides what functions execute based on user input
	 * @param userchoice user's menu selection
	 **/	
	public void selectionCategories(int userchoice) {		
		switch (userchoice) {
			case 1:	
				System.out.println("\n    [1 Add a time]");	   
	    		this.addTime();
	    		this.displayMenu();	    		
	    		this.displayMenuInput(userchoice);	
				break;
	        case 2: 
	        	System.out.println("\n*   [2 Display list of time]");
	        	this.displayTime();
	            break;
	        case 3: 
	        	System.out.println("\n    [3 Quit]");
	        	System.out.println("    We hope you enjoyed this program.\n\n");
	            break;
	        default: 
	        	System.out.print("Not valid input. \n\n");
	        	this.displayMenu();
	        	break;		
		}	
	}	

	/**
	 * Display list of animals
	 **/
	public void displayTime() {	
		String result = "";
		
		for (Time currentTime : this.time) {
			result += "    " + currentTime.format() + "\n";
		}	
		System.out.println(result);
	}
	
	
	/**
	 * prompts and captures input to add animal to animal collection
	 **/	
	public void addTime() {
		int newHour = -1;
		int newMinute = -1;
		int newSecond = -1;

		while (newHour < 0) {
			System.out.print("Enter Hour: ");
			newHour = Integer.parseInt(this.userKeyboard.nextLine());
        }

		while (newMinute < 0) {
			System.out.print("Enter Minute: ");
			newMinute = Integer.parseInt(this.userKeyboard.nextLine());
        }	
		
		while (newSecond < 0) {
			System.out.print("Enter Second: ");
			newSecond = Integer.parseInt(this.userKeyboard.nextLine());
        }	
				

		Time newTime = new Time(newHour, newMinute, newSecond);
		this.time.add(newTime);
		System.out.println("\n");
	

	}
	
	
	/**
	 * provides specific text that causes input errors 
	 * @param error accepts ERROR from try catch 
	 * @return returns the value\input responsible for error
	 */
	private String getErrorString(NumberFormatException error) {
		int first = error.getMessage().indexOf("\"", 0) + 1; 
		int second = error.getMessage().lastIndexOf("\"");
	
		return error.getMessage().substring(first, second);		
	}	
	
	
}
