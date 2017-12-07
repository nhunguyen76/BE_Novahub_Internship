package Bai6_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ShapeTest {

	Shape circle1 = new Circle(2.2, "black", false);

	@Test
	public void testShapeStringBoolean() {
		assertEquals("black",circle1.getColor());
		assertEquals(false,circle1.isFilled());
	}

	@Test
	public void testGetSetColor() {
		circle1.setColor("blue");
		assertEquals("blue",circle1.getColor());
	}

	@Test
	public void testGetSetFilled() {
		circle1.setFilled(true);
		assertEquals(true,circle1.isFilled());
	}

	@Test
	public void testToString() {
		String expected = "A Circle with radius=2.2, which is a subclass of A Shape with color of black and Not filled";
		assertEquals(expected,circle1.toString());
		circle1.setFilled(true);
		expected = "A Circle with radius=2.2, which is a subclass of A Shape with color of black and filled";
		assertEquals(expected,circle1.toString());
	}


}
