package Bai2_7;

import static org.junit.Assert.*;

import org.junit.Test;

public class InvoiceTest {
	Customer customer=new Customer(1,"Nhu",50);
	Invoice invoice=new Invoice(2, customer, 100);
	@Test
	public void testInvoice() {
		Invoice i=new Invoice(2, customer, 100);
		assertEquals(2,i.getID());
		assertEquals(1,i.getCustomer().getID());
		assertEquals("Nhu",i.getCustomerName());
		assertEquals(50,i.getCustomer().getDiscount());
		assertEquals(100,i.getAmount(),0.0000001);
	}

	@Test
	public void testGetID() {
		assertEquals(2,invoice.getID());
	}

	@Test
	public void testGetCustomer() {
		assertEquals(1,invoice.getCustomer().getID());
		assertEquals("Nhu",invoice.getCustomerName());
		assertEquals(50,invoice.getCustomer().getDiscount());
	}

	@Test
	public void testSetCustomer() {
		Customer customer2=new Customer(5,"An",65);
		invoice.setCustomer(customer2);
		assertEquals(5,invoice.getCustomer().getID());
		assertEquals("An",invoice.getCustomerName());
		assertEquals(65,invoice.getCustomer().getDiscount());
	}

	@Test
	public void testGetAmount() {
		assertEquals(100,invoice.getAmount(),0.0000001);
	}

	@Test
	public void testSetAmount() {
		invoice.setAmount(150.2);
		assertEquals(150.2,invoice.getAmount(),0.0000001);
	}

	@Test
	public void testGetCustomerName() {
		assertEquals("Nhu",invoice.getCustomerName());
	}

	@Test
	public void testGetAmountAfterDiscount() {
		assertEquals(50,invoice.getAmountAfterDiscount(),0.00000001);
	}

}
