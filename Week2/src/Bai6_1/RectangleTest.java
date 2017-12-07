package Bai6_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RectangleTest {

	Rectangle r1;
	double delta = 0.001;
	@Before
	public void setUp() throws Exception {
		r1 = new Rectangle();
	}

	@Test
	public void testRectangle() {
		assertEquals("red",r1.getColor());
		assertEquals(true,r1.isFilled());
		assertEquals(1.0,r1.getLength(),delta);
		assertEquals(1.0,r1.getWidth(),delta);
	}

	@Test
	public void testRectangleDoubleDouble() {
		Rectangle r2 = new Rectangle(1.2, 1.2);
		assertEquals("red",r2.getColor());
		assertEquals(true,r2.isFilled());
		assertEquals(1.2,r2.getLength(),delta);
		assertEquals(1.2,r2.getWidth(),delta);
	}

	@Test
	public void testRectangleDoubleDoubleStringBoolean() {
		Rectangle r2 = new Rectangle(1.2, 1.2, "blue", false);
		assertEquals("blue",r2.getColor());
		assertEquals(false,r2.isFilled());
		assertEquals(1.2,r2.getLength(),delta);
		assertEquals(1.2,r2.getWidth(),delta);
	}

	@Test
	public void testSetWidth() {
		r1.setWidth(3.52);
		assertEquals(3.52,r1.getWidth(),delta);
	}

	@Test
	public void testSetLength() {
		r1.setLength(2.35);
		assertEquals(2.35,r1.getLength(),delta);
	}

	@Test
	public void testGetArea() {
		r1.setWidth(3.52);
		r1.setLength(2.35);
		assertEquals(2.35*3.52,r1.getArea(),delta);
	}

	@Test
	public void testGetPerimeter() {
		r1.setWidth(3.52);
		r1.setLength(2.35);
		assertEquals(2*(2.35+3.52),r1.getPerimeter(),delta);
	}

	@Test
	public void testToString() {
		String expected = "A Rectangle with width=1.0 and length=1.0, which is a subclass of A Shape with color of red and filled";
		assertEquals(expected,r1.toString());
	}
}
