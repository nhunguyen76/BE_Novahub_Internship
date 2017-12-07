package Bai2_7;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {

	@Test
	public void testCustomer() {
		Customer customer=new Customer(1,"Nhu",50);
		assertEquals(1,customer.getID());
		assertEquals("Nhu",customer.getName());
		assertEquals(50,customer.getDiscount());
	}

	@Test
	public void testGetID() {
		Customer customer=new Customer(1,"Nhu",50);
		assertEquals(1,customer.getID());
	}

	@Test
	public void testGetName() {
		Customer customer=new Customer(1,"Nhu",50);
		assertEquals("Nhu",customer.getName());
	}

	@Test
	public void testGetDiscount() {
		Customer customer=new Customer(1,"Nhu",50);
		assertEquals(50,customer.getDiscount());
	}

	@Test
	public void testSetDiscount() {
		Customer customer=new Customer(1,"Nhu",50);
		customer.setDiscount(70);
		assertEquals(70,customer.getDiscount());
	}

	@Test
	public void testToString() {
		Customer customer=new Customer(1,"Nhu",50);
		assertEquals("Nhu(1)",customer.toString());

	}

}
