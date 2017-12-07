package Bai1_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {
	
	double delta=0.00000001;
	@Test
	public void testCircle() {
		Circle c=new Circle();
			assertEquals(1.0,c.getRadius(),delta);
			assertEquals("red",c.getColor());
	}

	@Test
	public void testCircleDouble() {
		Circle c=new Circle(1.2);
		assertEquals(1.2,c.getRadius(),delta);
		assertEquals("red",c.getColor());
	}

	@Test
	public void testCircleDoubleString() {
		Circle c=new Circle(1.2,"blue");
		assertEquals(1.2,c.getRadius(),delta);
		assertEquals("blue",c.getColor());
	}

	@Test
	public void testGetRadius() {
		Circle c=new Circle();
		c.setRadius(2.2);
		assertEquals(2.2,c.getRadius(),delta);
	}

	@Test
	public void testGetColor() {
		Circle c=new Circle();
		c.setColor("blue");
		assertEquals("blue",c.getColor());
	}

	@Test
	public void testSetRadius() {
		Circle c=new Circle();
		c.setRadius(2.1);
		assertEquals(2.1,c.getRadius(),delta);
	}

	@Test
	public void testSetColor() {
		Circle c=new Circle();
		c.setColor("blue");
		assertEquals("blue",c.getColor());
	}

	@Test
	public void testToString() {
		Circle c= new Circle();
		assertEquals("Circle[radius="+c.getRadius()+" color="+c.getColor()+"]",c.toString());
	}

	@Test
	public void testGetArea() {
		Circle c= new Circle();
		c.setRadius(2.2);
		assertEquals(2.2*2.2*Math.PI,c.getArea(),delta);
	}

}
