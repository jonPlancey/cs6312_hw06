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
		
	
		
	}
	
}
