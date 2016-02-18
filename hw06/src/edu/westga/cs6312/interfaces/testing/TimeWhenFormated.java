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
public class TimeWhenFormated {

	/** 
	 * test: format of creation of new time object
	 */	
	@Test
	public void testTimeWhenCreatedFormated080603() {	
		Time time = new Time(8, 6, 3);
		String expect = "08:06:03"; 
		String results = time.format();
		assertEquals(expect, results);
	}
	
	/** 
	 * test: format of creation of new time object
	 */	
	@Test
	public void testTimeWhenCreatedFormated111111() {	
		Time time = new Time(11, 11, 11);
		String expect = "11:11:11"; 
		String results = time.format();
		assertEquals(expect, results);
	}
	
	
	/** 
	 * test: format of creation of new time object
	 */	
	@Test
	public void testTimeWhenCreatedFormated101010() {	
		Time time = new Time(10, 10, 10);
		String expect = "10:10:10"; 
		String results = time.format();
		assertEquals(expect, results);
	}		

	
	
	/** 
	 * test: format of creation of new time object
	 */	
	@Test
	public void testTimeWhenCreatedFormated101000() {	
		Time time = new Time(10, 10);
		String expect = "10:10:00"; 
		String results = time.format();
		assertEquals(expect, results);
	}
	
	
	
	/** 
	 * test: format of creation of new time object
	 */	
	@Test
	public void testTimeWhenCreatedFormated245959second01() {	
		Time time = new Time(12, 10, 6);
		time.tick();
		String expect = "12:10:07"; 
		String results = time.format();
		assertEquals(expect, results);
	}		

}
