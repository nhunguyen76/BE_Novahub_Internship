package Bai3_4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyTimeTest {

	MyTime mytime;
	@Before
	public void setUp() throws Exception {
		mytime=new MyTime(7, 6, 13);
	}

	@Test
	public void testMyTimeIntIntInt() {
		assertEquals(7,mytime.getHour());
		assertEquals(6,mytime.getMinute());
		assertEquals(13,mytime.getSecond());
	}

	@Test
	public void testSetTime() {
		mytime.setTime(10, 10, 10);
		assertEquals(10,mytime.getHour());
		assertEquals(10,mytime.getMinute());
		assertEquals(10,mytime.getSecond());
	}

	@Test
	public void testGetHour() {
		assertEquals(7,mytime.getHour());
	}

	@Test
	public void testGetMinute() {
		assertEquals(6,mytime.getMinute());
	}

	@Test
	public void testGetSecond() {
		assertEquals(13,mytime.getSecond());
	}

	@Test
	public void testSetHour() {
		mytime.setHour(10);
		assertEquals(10,mytime.getHour());
	}

	@Test
	public void testSetMinute() {
		mytime.setMinute(10);
		assertEquals(10,mytime.getMinute());
	}

	@Test
	public void testSetSecond() {
		mytime.setSecond(11);
		assertEquals(11,mytime.getSecond());
	}

	@Test
	public void testToString() {
		assertEquals("07:06:13",mytime.toString());
	}

	@Test
	public void testNextSecond() {
		mytime.nextSecond();
		assertEquals("07:06:14",mytime.toString());
		
		mytime.setTime(23, 59, 59);
		mytime.nextSecond();
		assertEquals("00:00:00",mytime.toString());
	}

	@Test
	public void testNextMinute() {
		mytime.nextMinute();
		assertEquals("07:07:13",mytime.toString());
		
		mytime.setTime(23, 59, 59);
		mytime.nextMinute();
		assertEquals("00:00:59",mytime.toString());
	}

	@Test
	public void testNextHour() {
		mytime.nextHour();
		assertEquals("08:06:13",mytime.toString());
		
		mytime.setTime(23, 59, 59);
		mytime.nextHour();
		assertEquals("00:59:59",mytime.toString());
	}

	@Test
	public void testPreviousSecond() {
		mytime.previousSecond();
		assertEquals("07:06:12",mytime.toString());
		
		mytime.setTime(00, 00, 00);
		mytime.previousSecond();
		assertEquals("23:59:59",mytime.toString());
	}

	@Test
	public void testPreviousMinute() {
		mytime.previousMinute();
		assertEquals("07:05:13",mytime.toString());
		mytime.setTime(00, 00, 10);
		mytime.previousMinute();
		assertEquals("23:59:10",mytime.toString());
	}

	@Test
	public void testPreviousHour() {
		mytime.previousHour();
		assertEquals("06:06:13",mytime.toString());
		
		mytime.setTime(00, 10, 10);
		mytime.previousHour();
		assertEquals("23:10:10",mytime.toString());
	}

}
