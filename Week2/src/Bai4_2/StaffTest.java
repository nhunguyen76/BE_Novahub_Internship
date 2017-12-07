package Bai4_2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StaffTest {

	Staff s1;
	
	@Before
	public void setUp() throws Exception {
		s1 = new Staff("Nhu", "DN", "BKDN", 13000);
	}

	@Test
	public void testStaff() {
		assertEquals("Nhu",s1.getName());
		assertEquals("DN",s1.getAddress());
		assertEquals("BKDN",s1.getSchool());
		assertEquals(13000,s1.getPay(),0.001);
	}

	@Test
	public void testSetSchool() {
		s1.setSchool("DHDN");
		assertEquals("DHDN",s1.getSchool());
	}

	@Test
	public void testSetPay() {
		s1.setPay(15000);
		assertEquals(15000,s1.getPay(),0.001);
		
	}

	@Test
	public void testToString() {
		String expected = "Staff[Person[name=Nhu,address=DN],school=BKDN,pay=13000.0]";
		assertEquals(expected,s1.toString());
	}

}
