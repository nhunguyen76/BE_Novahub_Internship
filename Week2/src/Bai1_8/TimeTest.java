package Bai1_8;

import static org.junit.Assert.*;

import org.junit.Test;

public class TimeTest {
	
	Time x=new Time(7,6,13);
	@Test
	public void testTime() {
		Time y=new Time(13,11,5);
		assertEquals(13,y.getHour());
		assertEquals(11,y.getMinute());
		assertEquals(5,y.getSecond());
	}

	@Test
	public void testGetHour() {
		assertEquals(7,x.getHour());
	}

	@Test
	public void testSetHour() {
		x.setHour(8);
		assertEquals(8,x.getHour());
	}

	@Test
	public void testGetMinute() {
		assertEquals(6,x.getMinute());
	}

	@Test
	public void testSetMinute() {
		x.setMinute(8);
		assertEquals(8,x.getMinute());
	}

	@Test
	public void testGetSecond() {
		assertEquals(13,x.getSecond());
	}

	@Test
	public void testSetSecond() {
		x.setSecond(20);
		assertEquals(20,x.getSecond());
	}

	@Test
	public void testSetTime() {
		x.setTime(13, 11, 20);
		assertEquals(13,x.getHour());
		assertEquals(11,x.getMinute());
		assertEquals(20,x.getSecond());
	}

	@Test
	public void testToString() {
		assertEquals("07:06:13",x.toString());
	}

	@Test
	public void testNextSecond() {
		Time y=new Time(23,59,59);
		y.nextSecond();
		assertEquals("00:00:00",y.toString());
	}

	@Test
	public void testPreviousSecond() {
		Time y=new Time(0,0,0);
		y.previousSecond();
		assertEquals(23,y.getHour());
		assertEquals(59,y.getMinute());
		assertEquals(59,y.getSecond());
	}

}
