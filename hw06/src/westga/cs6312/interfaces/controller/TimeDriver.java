package westga.cs6312.interfaces.controller;


/**
 * Homework HW06  
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	02.10.2016
 */
public class TimeDriver {

	/**
	 * This method is the entry point of the application
	 * @param args Command line arguments, not used
	 */ 
	public static void main(String[] args) {
		TimeUI gui = new TimeTUI();
		gui.run();		

	}

}
