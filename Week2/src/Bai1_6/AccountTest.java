package Bai1_6;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	
	@Test
	public void testAccountStringString() {
		Account x=new Account("01","Nhu");
		assertEquals("01",x.getId());
		assertEquals("Nhu",x.getName());
	}

	@Test
	public void testAccountStringStringInt() {
		Account x=new Account("01","Nhu",1234);
		assertEquals("01",x.getId());
		assertEquals("Nhu",x.getName());
		assertEquals(1234,x.getBalance());
	}

	@Test
	public void testGetId() {
		Account x=new Account("01","Nhu");
		assertEquals("01",x.getId());
	}

	@Test
	public void testGetName() {
		Account x=new Account("01","Nhu");
		assertEquals("Nhu",x.getName());
	}

	@Test
	public void testGetBalance() {
		Account x=new Account("01","Nhu",1234);
		assertEquals(1234,x.getBalance());
	}

	@Test
	public void testCredit() {
		Account x=new Account("01","Nhu",1234);
		x.credit(10);
		assertEquals(1234+10,x.getBalance());
	}

	@Test
	public void testDebit() {
		Account x=new Account("01","Nhu",1234);
		x.debit(10);
		assertEquals(1234-10,x.getBalance());
		
	}

	@Test
	public void testTransferTo() {
		Account x=new Account("01","Nhu",1234);
		Account y=new Account("02","An",100);
		x.transferTo(y, 1300);
		assertEquals(1234,x.getBalance());
		x.transferTo(y,100);
		assertEquals(100+100,y.getBalance());
		assertEquals(1234-100,x.getBalance());
		
	}

	@Test
	public void testToString() {
		Account x=new Account("01","Nhu",1234);
		assertEquals("Account[id=01,name=Nhu,balance=1234]",x.toString());
	}

}
