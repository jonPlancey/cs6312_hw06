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
public class TimeWhenTick {

	/** 
	 * test: proper creation of new time object
	 */	
	@Test
	public void testTimeWhenCreateTimeNew000() {	
		Time time = new Time();
		String expect = "0:0:0"; 
		String results = time.toString();
		assertEquals(expect, results);
	}
	
	/** 
	 * test: proper creation of new time object
	 */	
	@Test
	public void testTimeWhenCreateTimeNew() {	
		Time time = new Time(4, 5);
		String expect = "4:5:0"; 
		String results = time.toString();
		assertEquals(expect, results);
	}
	
	
	/** 
	 * test: proper creation of new time object
	 */	
	@Test
	public void testTimeWhenCreateTimeNew0405seconds3() {	
		Time time = new Time(4, 5);
		time.tick();
		time.tick();
		time.tick();		
		String expect = "4:5:3"; 
		String results = time.toString();
		assertEquals(expect, results);
	}		
	
	
	
	
	
	
	
	/** 
	 * test: proper creation of new time object
	 * and the tick intrements
	 */	
	@Test
	public void testTimeWhenCreateTimeNewseconds01() {	
		Time time = new Time();
		time.tick();
		String expect = "0:0:1"; 
		String results = time.getHour() + ":"  + time.getMinute() + ":"  + time.getSecond();
		assertEquals(expect, results);
	}	

	/** 
	 * test: proper creation of new time object
	 * and the tick intrements
	 */	
	@Test
	public void testTimeWhenCreateTimeNew2460seconds01() {	
		Time time = new Time(23, 59);
		time.tick();
		String expect = "23:59:1"; 
		String results = time.getHour() + ":"  + time.getMinute() + ":"  + time.getSecond();
		assertEquals(expect, results);
	}
	

	/** 
	 * test: proper creation of new time object
	 * and the tick intrements
	 */	
	@Test
	public void testTimeWhenCreateTimeNew0203seconds01() {	
		Time time = new Time(2, 3);
		time.tick();
		String expect = "2:3:1"; 
		String results = time.getHour() + ":"  + time.getMinute() + ":"  + time.getSecond();
		assertEquals(expect, results);
	}	
	
	/** 
	 * test: proper creation of new time object
	 * and the tick intrements
	 */	
	@Test
	public void testTimeWhenCreateTimeNew246060seconds01() {	
		Time time = new Time(23, 59, 59);
		time.tick();
		String expect = "23:59:60"; 
		String results = time.getHour() + ":"  + time.getMinute() + ":"  + time.getSecond();
		assertEquals(expect, results);
	}	
	

}
