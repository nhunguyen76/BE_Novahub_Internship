package Bai4_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CylinderTest {

	Cylinder c1;
	double   delta = 0.00000001;
	
	@Before
	public void setUp() throws Exception {
		c1 = new Cylinder();
	}

	@Test
	public void testCylinder() {
		assertEquals(0.1,c1.getRadius(),delta);
		assertEquals("red",c1.getColor());
		assertEquals(1.0,c1.getHeight(),delta);
	}

	@Test
	public void testCylinderDouble() {
		Cylinder c2 = new Cylinder(2.2);
		assertEquals(2.2,c2.getRadius(),delta);
		assertEquals("red",c2.getColor());
		assertEquals(1.0,c2.getHeight(),delta);
	}

	@Test
	public void testCylinderDoubleDouble() {
		Cylinder c2 = new Cylinder(2.2,3.5);
		assertEquals(2.2,c2.getRadius(),delta);
		assertEquals("red",c2.getColor());
		assertEquals(3.5,c2.getHeight(),delta);
	}

	@Test
	public void testCylinderDoubleDoubleString() {
		Cylinder c2 = new Cylinder(2.2,3.5,"blue");
		assertEquals(2.2,c2.getRadius(),delta);
		assertEquals("blue",c2.getColor());
		assertEquals(3.5,c2.getHeight(),delta);
	}

	@Test
	public void testSetHeight() {
		c1.setHeight(8.2);
		assertEquals(8.2,c1.getHeight(),delta);
	}

	@Test
	public void testGetVolume() {
		c1.setHeight(3.5);
		assertEquals(c1.getArea()*3.5,c1.getVolume(),delta);
	}

	@Test
	public void testToString() {
		String expected = "Cylinder: subclass of Circle[radius=0.1,color=red] height=1.0";
		String actual   = c1.toString();
		assertEquals(expected,actual);
	}
}
