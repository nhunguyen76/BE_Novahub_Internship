package Bai4_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CircleTest {
	
	Circle c1;
	double delta = 0.0000001;
	@Before
	public void setUp() throws Exception {
		c1 = new Circle();
	}

	@Test
	public void testCircle() {
		assertEquals(0.1,c1.getRadius(),delta);
		assertEquals("red",c1.getColor());		
	}

	@Test
	public void testCircleDouble() {
		Circle c2 = new Circle(2.2);
		assertEquals(2.2,c2.getRadius(),delta);
		assertEquals("red",c2.getColor());
	}

	@Test
	public void testCircleDoubleString() {
		Circle c2 = new Circle(2.2,"blue");
		assertEquals(2.2,c2.getRadius(),delta);
		assertEquals("blue",c2.getColor());
	}

	@Test
	public void testGetRadius() {
		c1.setRadius(2.2);
		assertEquals(2.2,c1.getRadius(),delta);
	}

	@Test
	public void testSetRadius() {
		c1.setRadius(2.2);
		assertEquals(2.2,c1.getRadius(),delta);
	}

	@Test
	public void testGetColor() {
		c1.setColor("red");
		assertEquals("red",c1.getColor());
	}

	@Test
	public void testSetColor() {
		c1.setColor("red");
		assertEquals("red",c1.getColor());
	}

	@Test
	public void testGetArea() {
		c1.setRadius(2.2);
		assertEquals(2.2*2.2*Math.PI,c1.getArea(),delta);
	}

	@Test
	public void testToString() {
    	String expected = "Circle[radius=0.1,color=red]";
		String actual   = c1.toString();
    	assertEquals(expected,actual);
	}

}
