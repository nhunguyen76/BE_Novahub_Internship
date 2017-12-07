package Bai4_5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ShapeTest {
	
	Shape s1;
	
	@Before
	public void setUp() throws Exception {
		s1 = new Shape();
	}

	@Test
	public void testShape() {
		assertEquals("red",s1.getColor());
		assertEquals(true,s1.isFilled());
	}

	@Test
	public void testShapeStringBoolean() {
		Shape s2 = new Shape("black", false);
		assertEquals("black",s2.getColor());
		assertEquals(false,s2.isFilled());
	}

	@Test
	public void testSetColor() {
		s1.setColor("yellow");
		assertEquals("yellow",s1.getColor());
	}

	@Test
	public void testSetFilled() {
		s1.setFilled(false);
		assertEquals(false,s1.isFilled());
	}

	@Test
	public void testToString() {
		String expected = "A Shape with color of red and filled";
		assertEquals(expected,s1.toString());
		s1.setFilled(false);
		expected = "A Shape with color of red and Not filled";
		assertEquals(expected,s1.toString());
	}

}
