package edu.westga.cs6312.interfaces.testing;

import edu.westga.cs6312.interfaces.model.Time;
import static org.junit.Assert.*;
import org.junit.Test;


/**
 * Homework HW06  
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	02.10.2016
 */
public class TimeWhenCreateTime {

	/** 
	 * test: createst of new time object
	 */	
	@Test
	public void testTimeWhenCreateTimeNew() {	
		Time time = new Time();
		String expect = "0:0:0"; 
		String results = time.toString();
		assertEquals(expect, results);
	}

}
