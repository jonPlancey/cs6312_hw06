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
	 * test: proper creation of new time object
	 */	
	@Test
	public void testTimeWhenCreateTimeNew() {	
		Time time = new Time();
		String expect = "0:0:0"; 
		String results = time.toString();
		assertEquals(expect, results);
	}
	
	/** 
	 * test: proper creation of new time object
	 */	
	@Test
	public void testTimeWhenCreateTimeNew246060() {	
		Time time = new Time(23, 59);
		String expect = "23:59:0"; 
		String results = time.toString();
		assertEquals(expect, results);
	}
	
	
	/** 
	 * test: proper creation of new time object
	 */	
	@Test
	public void testTimeWhenCreateTimeNew246060seconds01() {	
		Time time = new Time(23, 59, 59);
		time.tick();
		String expect = "23:59:60"; 
		String results = time.getHour() + ":"  + time.getMinute() + ":"  + time.getSecond();
		assertEquals(expect, results);
	}	
	
	
	
	/** 
	 * test: proper creation of new time object
	 */	
	@Test
	public void testTimeWhenCreateTimeNew053010() {	
		Time time = new Time(5, 30, 10);
		String expect = "5:30:10"; 
		String results = time.getHour() + ":"  + time.getMinute() + ":"  + time.getSecond();
		assertEquals(expect, results);
	}
	
	
	/** 
	 * test: proper creation of new time object
	 */	
	@Test
	public void testTimeWhenCreateTimeNew053010second1() {	
		Time time = new Time(5, 30, 10);
		time.tick();
		String expect = "5:30:11"; 
		String results = time.getHour() + ":"  + time.getMinute() + ":"  + time.getSecond();
		assertEquals(expect, results);
	}	
	
	

}
