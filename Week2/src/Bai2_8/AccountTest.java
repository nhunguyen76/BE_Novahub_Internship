package Bai2_8;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {
	Customer customer = new Customer(13,"Nhu",'f');
	
	@Test
	public void testAccountIntCustomerDouble() {
		Account account=new Account(1,customer,999999.99);
		assertEquals(1, account.getID());
		assertEquals("Nhu(13)", account.getCustomer().toString());
		assertEquals('f', account.getCustomer().getGender());
		assertEquals(999999.99, account.getBalance(), 0.00001);
	}

	@Test
	public void testAccountIntCustomer() {
		Account account=new Account(1,customer);
		assertEquals(1, account.getID());
		assertEquals("Nhu(13)", account.getCustomer().toString());
	}

	@Test
	public void testGetID() {
		Account account=new Account(1,customer,999999.99);
		assertEquals(1, account.getID());
	}

	@Test
	public void testGetCustomer() {
		Account account=new Account(1,customer,999999.99);
		assertEquals("Nhu(13)", account.getCustomer().toString());
		assertEquals('f', account.getCustomer().getGender());
	}

	@Test
	public void testGetBalance() {
		Account account=new Account(1,customer,999999.99);
		assertEquals(999999.99, account.getBalance(), 0.00001);
	}

	@Test
	public void testSetBalance() {
		Account account=new Account(1,customer,999999.99);
		account.setBalance(1000000);
		assertEquals(1000000, account.getBalance(), 0.00001);
	}

	@Test
	public void testToString() {
		Account account=new Account(1,customer,999999.99);
		assertEquals("Nhu(13) balance=$999999.99", account.toString());
	}

	@Test
	public void testGetCustomerName() {
		Account account=new Account(1,customer,999999.99);
		assertEquals("Nhu",account.getCustomerName());
	}

	@Test
	public void testDeposit() {
		Account account=new Account(1,customer,999999.99);
		account.deposit(0.01);
		assertEquals(999999.99+0.01,account.getBalance(),0.0000001);
		assertEquals(1, account.getID());
		assertEquals("Nhu(13)", account.getCustomer().toString());
		assertEquals('f', account.getCustomer().getGender());
	}

	@Test
	public void testWithdraw() {
		Account account=new Account(1,customer,999999.99);
		//if amount>balance
		assertEquals(999999.99, account.withdraw(10000000).getBalance(),0.0000001);
		//if amount<balance
		assertEquals(999999.00, account.withdraw(0.99).getBalance(), 0.000001);
		
	}
}

