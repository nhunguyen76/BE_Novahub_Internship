package Bai1_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	double delta = 0.0000001;
	@Test
	public void testRectangle() {
		Rectangle r = new Rectangle();
		assertEquals(1.0,r.getLength(),delta);
		assertEquals(1.0,r.getWidth(),delta);
	}

	@Test
	public void testRectangleFloatFloat() {
		Rectangle r = new Rectangle(2.2f,3.5f);
		assertEquals(2.2,r.getLength(),delta);
		assertEquals(3.5,r.getWidth(),delta);
	}

	@Test
	public void testGetLength() {
		Rectangle r = new Rectangle();
		r.setLength(2.5f);
		assertEquals(2.5,r.getLength(),delta);
	}

	@Test
	public void testSetLength() {
		Rectangle r = new Rectangle();
		r.setLength(2.5f);
		assertEquals(2.5,r.getLength(),delta);
	}

	@Test
	public void testGetWidth() {
		Rectangle r = new Rectangle();
		r.setWidth(2.5f);
		assertEquals(2.5,r.getWidth(),delta);
	}

	@Test
	public void testSetWidth() {
		Rectangle r = new Rectangle();
		r.setWidth(2.5f);
		assertEquals(2.5,r.getWidth(),delta);
	}

	@Test
	public void testGetArea() {
		Rectangle r = new Rectangle(2.2f,3.5f);
		assertEquals(2.2f*3.5f,r.getArea(),delta);
	}

	@Test
	public void testGetPerimeter() {
		Rectangle r = new Rectangle(2.2f,3.5f);
		assertEquals((2.2f+3.5f)*2.0f,r.getPerimeter(),delta);
	}

	@Test
	public void testToString() {
		Rectangle r = new Rectangle();
		assertEquals("Rectangle[length="+r.length+",width="+r.width+"]",r.toString());
	}

}
