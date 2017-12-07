package Bai6_4;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {

	Circle c = new Circle(1.2);
	
	@Test
	public void testCircle() {
		assertEquals(1.2,c.getRadius(),0.001);
	}

	@Test
	public void testGetRadius() {
		assertEquals(1.2,c.getRadius(),0.001);
	}

	@Test
	public void testGetPerimeter() {
		assertEquals(2*1.2*Math.PI,c.getPerimeter(),0.001);
	}

	@Test
	public void testGetArea() {
		assertEquals(1.2*1.2*Math.PI,c.getArea(),0.001);
	}

}
