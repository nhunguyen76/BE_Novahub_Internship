package Bai8_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyIntStackTest {
	
	MyIntStack stack;
	
	@Before
	public void setUp() throws Exception {
		stack = new MyIntStack(5);
	}

	@Test
	public void testPushPopPeek() {
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		assertEquals(4, stack.peek());
        assertEquals(3, stack.pop());
	}

	@Test
	public void testIsEmpty() {
		assertEquals(true, stack.isEmpty());
		stack.push(5);
		assertEquals(false, stack.isEmpty());
	}

	@Test
	public void testIsFull() {
		stack.push(0);
		stack.push(1);
		assertEquals(false, stack.isFull());
		stack.push(2);
		stack.push(3);
		stack.push(4);
		assertEquals(true, stack.isFull());
	}

	@Test
	public void testPushCheckStack() {
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.pushCheckStack(4);
		assertEquals(true, stack.isFull());
	//	stack.pushCheckStack(5);
	//	assertEquals(4, stack.peek());
	}

	@Test
	public void testPushCheck() {
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		assertEquals(true, stack.pushCheck(4));
		assertEquals(false, stack.pushCheck(5));
		assertEquals(4, stack.peek());
	}

	@Test
	public void testPushResize() {
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.pushResize(4);
		assertEquals(true, stack.isFull());
		stack.pushResize(5);
		assertEquals(5, stack.peek());
	}

}
