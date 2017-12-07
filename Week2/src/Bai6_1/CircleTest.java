package Bai6_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CircleTest {
	
	Circle c1;
	
	@Before
	public void setUp() throws Exception {
		c1 = new Circle();
	}

	@Test
	public void testCircle() {
		assertEquals("red",c1.getColor());
		assertEquals(true,c1.isFilled());
		assertEquals(0.1,c1.getRadius(),0.001);
	}

	@Test
	public void testCircleDouble() {
		Circle c2 = new Circle(1.2);
		assertEquals("red",c2.getColor());
		assertEquals(true,c2.isFilled());
		assertEquals(1.2,c2.getRadius(),0.001);
	}

	@Test
	public void testCircleDoubleStringBoolean() {
		Circle c2 = new Circle(1.5, "black", false);
		assertEquals("black",c2.getColor());
		assertEquals(false,c2.isFilled());
		assertEquals(1.5,c2.getRadius(),0.001);
	}

	@Test
	public void testSetRadius() {
		c1.setRadius(2.2);
		assertEquals(2.2,c1.getRadius(),0.001);
	}

	@Test
	public void testGetArea() {
		c1.setRadius(2.2);
		assertEquals(2.2*2.2*Math.PI,c1.getArea(),0.001);
	}

	@Test
	public void testGetPerimeter() {
		c1.setRadius(2.2);
		assertEquals(2*2.2*Math.PI,c1.getPerimeter(),0.001);
	}

	@Test
	public void testToString() {
		Circle c2 = new Circle(1.5, "black", true);
		String expected = "A Circle with radius=1.5, which is a subclass of A Shape with color of black and filled";
		assertEquals(expected,c2.toString());
	}
}

