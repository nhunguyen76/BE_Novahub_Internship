package Bai5_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PointTest {
	
	Point p;
	@Before
	public void setUp() throws Exception {
		p = new Point(2,3);
	}

	@Test
	public void testPoint() {
		assertEquals(2,p.getX());
		assertEquals(3,p.getY());
	}

	@Test
	public void testToString() {
		String expected = "Point: (2,3)";
		assertEquals(expected,p.toString());
	}

	@Test
	public void testSetX() {
		p.setX(4);
		assertEquals(4,p.getX());
	}

	@Test
	public void testSetY() {
		p.setY(5);
		assertEquals(5,p.getY());
	}

	@Test
	public void testSetXY() {
		p.setXY(4, 5);
		assertEquals(4,p.getX());
		assertEquals(5,p.getY());
	}

}
