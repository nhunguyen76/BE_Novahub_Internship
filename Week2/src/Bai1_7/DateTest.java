package Bai1_7;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateTest {

	Date x=new Date(7,6,1996);
	@Test
	public void testDate() {
		assertEquals(7,x.day);
		assertEquals(6,x.month);
		assertEquals(1996,x.year);
	}

	@Test
	public void testGetDay() {
		assertEquals(7,x.day);
	}

	@Test
	public void testSetDay() {
		x.setDay(13);
		assertEquals(13,x.day);
	}

	@Test
	public void testGetMonth() {
		assertEquals(6,x.month);
	}

	@Test
	public void testSetMonth() {
		x.setMonth(13);
		assertEquals(13,x.month);
	}

	@Test
	public void testGetYear() {
		assertEquals(1996,x.year);
	}

	@Test
	public void testSetDate() {
		x.setDate(13,11,1994);
		assertEquals(13,x.day);
		assertEquals(11,x.month);
		assertEquals(1994,x.year);
	}

	@Test
	public void testToString() {
		assertEquals("07/06/1996",x.toString());
	}

}
