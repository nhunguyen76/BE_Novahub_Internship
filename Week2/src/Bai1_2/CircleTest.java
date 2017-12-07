package Bai1_2;

import static org.junit.Assert.*;

import org.junit.Test;


public class CircleTest {
	double delta=0.0000001;
	@Test
	public void testCircle() {
		Circle c = new Circle();
		assertEquals(1.0,c.getRadius(),delta);
	}

	@Test
	public void testCircleDouble() {
		Circle c=new Circle(1.2);
		assertEquals(1.2,c.getRadius(),delta);
	}

	@Test
	public void testGetRadius() {
		Circle c=new Circle();
		c.setRadius(2.2);
		assertEquals(2.2,c.getRadius(),delta);
	}

	@Test
	public void testSetRadius() {
		Circle c=new Circle();
		c.setRadius(2.1);
		assertEquals(2.1,c.getRadius(),delta);
	}

	@Test
	public void testGetArea() {
		Circle c= new Circle();
		c.setRadius(2.2);
		assertEquals(2.2*2.2*Math.PI,c.getArea(),delta);
	}

	@Test
	public void testGetCircumference() {
		Circle c= new Circle();
		assertEquals(Math.PI,c.getCircumference(),delta);
	}

	@Test
	public void testToString() {
		Circle c= new Circle();
		assertEquals("Circle[radius="+c.getRadius()+"]",c.toString());
	}

}
