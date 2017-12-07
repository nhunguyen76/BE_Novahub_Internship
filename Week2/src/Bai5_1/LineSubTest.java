package Bai5_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LineSubTest {

	LineSub line1;
	Point begin = new Point(-1,-1);
	Point end = new Point(2,5);
	
	@Before
	public void setUp() throws Exception {
		line1=new LineSub(begin, end);
	}

	@Test
	public void testLineSubIntIntIntInt() {
		LineSub line2 = new LineSub(1, 2, 3, 4);
		assertEquals(1,line2.getBeginX());
		assertEquals(2,line2.getBeginY());
		assertEquals(3,line2.getEndX());
		assertEquals(4,line2.getEndY());
	}

	@Test
	public void testLineSubPointPoint() {
		assertEquals(-1,line1.getBeginX());
		assertEquals(-1,line1.getBeginY());
		assertEquals(2,line1.getEndX());
		assertEquals(5,line1.getEndY());
	}
	
	@Test
	public void testToString() {
		String expected = "Line: ((-1,-1),(2,5))";
		assertEquals(expected,line1.toString());
	}

	@Test
	public void testSetBegin() {
		Point p1 = new Point(2,0);
		line1.setBegin(p1);
		assertEquals(p1.toString(),line1.getBegin().toString());
	}

	@Test
	public void testSetEnd() {
		Point p1 = new Point(1,0);
		line1.setEnd(p1);
		assertEquals(p1,line1.getEnd());
	}

	@Test
	public void testSetBeginX() {
		line1.setBeginX(-2);
		assertEquals(-2,line1.getBeginX());
	}

	@Test
	public void testSetBeginY() {
		line1.setBeginY(-2);
		assertEquals(-2,line1.getBeginY());
	}

	@Test
	public void testSetBeginXY() {
		line1.setBeginXY(-2, -2);
		assertEquals(-2,line1.getBeginX());
		assertEquals(-2,line1.getBeginY());
	}

	@Test
	public void testSetEndX() {
		line1.setEndX(4);
		assertEquals(4,line1.getEndX());
	}

	@Test
	public void testSetEndY() {
		line1.setEndY(3);
		assertEquals(3,line1.getEndY());
	}

	@Test
	public void testSetEndXY() {
		line1.setEndXY(3, 3);
		assertEquals(3,line1.getEndX());
		assertEquals(3,line1.getEndY());
	}

	@Test
	public void testGetLength() {
		double expected = Math.sqrt((2-(-1))*(2-(-1)) + (5-(-1))*(5-(-1)));
		assertEquals(expected,line1.getLength(),0.001);
	}

	@Test
	public void testGetGradient() {
		double expected = Math.atan2(5-(-1),2-(-1));
		assertEquals(expected,line1.getGradient(),0.001);
	}

}
