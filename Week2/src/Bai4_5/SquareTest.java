package Bai4_5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SquareTest {

	Square s1;
	double delta = 0.001;
	
	@Before
	public void setUp() throws Exception {
		s1 = new Square();
	}

	@Test
	public void testSquare() {
		assertEquals(1.0,s1.getLength(),delta);
		assertEquals(1.0,s1.getWidth(),delta);
		assertEquals("red",s1.getColor());
		assertEquals(true,s1.isFilled());
	}

	@Test
	public void testSquareDouble() {
		Square s2 = new Square(2.7);
		assertEquals(2.7,s2.getLength(),delta);
		assertEquals(2.7,s2.getWidth(),delta);
		assertEquals("red",s2.getColor());
		assertEquals(true,s2.isFilled());
	}

	@Test
	public void testSquareDoubleStringBoolean() {
		Square s2 = new Square(2.2, "yellow", false);
		assertEquals(2.2,s2.getLength(),delta);
		assertEquals(2.2,s2.getWidth(),delta);
		assertEquals("yellow",s2.getColor());
		assertEquals(false,s2.isFilled());
	}
	
	@Test
	public void testSetWidth() {
		s1.setWidth(5);
		assertEquals(5,s1.getLength(),delta);
		assertEquals(5,s1.getWidth(),delta);
	}

	@Test
	public void testSetLength() {
		s1.setLength(1.2);
		assertEquals(1.2,s1.getLength(),delta);
		assertEquals(1.2,s1.getWidth(),delta);
	}

	@Test
	public void testSetSide() {
		s1.setSide(2.3);
		assertEquals(2.3,s1.getLength(),delta);
		assertEquals(2.3,s1.getWidth(),delta);
	}

	@Test
	public void testToString() {
		String expected = "A Square with side=1.0, which is a subclass of "
						 +"A Rectangle with width=1.0 and length=1.0, which is a subclass of "
						 +"A Shape with color of red and filled";
		assertEquals(expected,s1.toString());
	}
}
