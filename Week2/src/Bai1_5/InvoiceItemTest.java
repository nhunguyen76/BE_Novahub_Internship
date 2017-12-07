package Bai1_5;

import static org.junit.Assert.*;

import org.junit.Test;

public class InvoiceItemTest {

	InvoiceItem i=new InvoiceItem("1a","abc",10,80.5);
	double delta=0.000001;
	@Test
	public void testInvoiceItem() {
		assertEquals("1a",i.id);
		assertEquals("abc",i.desc);
		assertEquals(10,i.qty);
		assertEquals(80.5,i.unitPrice,delta);
	}

	@Test
	public void testGetId() {
		assertEquals("1a",i.id);
	}

	@Test
	public void testGetDesc() {
		assertEquals("abc",i.desc);
	}

	@Test
	public void testGetQty() {
		assertEquals(10,i.qty);
	}

	@Test
	public void testSetQty() {
		i.setQty(20);
		assertEquals(20,i.qty);
	}

	@Test
	public void testGetUnitPrice() {
		assertEquals(80.5,i.unitPrice,delta);
	}

	@Test
	public void testSetUnitPrice() {
		double expected=60.2;
		double actual=60.2;
		i.setUnitPrice(actual);
		assertEquals(expected,i.unitPrice,delta);
	}

	@Test
	public void testGetTotal() {
		assertEquals(80.5*10,i.getTotal(),delta);
	}

	@Test
	public void testToString() {
		assertEquals("InvoiceItem[id="+i.id+",desc="+i.getDesc()+",qty="+i.qty+",unitPrice="+i.unitPrice+"]",i.toString());
	}

}
