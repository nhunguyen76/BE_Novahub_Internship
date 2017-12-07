package Bai2_8;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {
	Customer customer = new Customer(13,"Nhu",'f');
	@Test
	public void testCustomer() {
		Customer customer2 = new Customer(11,"An",'f');

		assertEquals(11, customer2.getID());
		assertEquals("An", customer2.getName());
		assertEquals('f', customer2.getGender());
	}

	@Test
	public void testGetID() {
		assertEquals(13, customer.getID());
	}

	@Test
	public void testGetName() {
		assertEquals("Nhu", customer.getName());
	}

	@Test
	public void testGetGender() {
		assertEquals('f', customer.getGender());
	}

	@Test
	public void testToString() {
		assertEquals("Nhu(13)", customer.toString());

	}

}
