package Bai6_4;

import static org.junit.Assert.*;

import org.junit.Test;

public class ResizableCircleTest {
	ResizableCircle rc = new ResizableCircle(1.2);
	
	@Test
	public void testResizableCircle() {
		assertEquals(1.2,rc.getRadius(),0.001);
	}

	@Test
	public void testResize() {
		assertEquals(0.96,rc.resize(20),0.001);
	}

}
