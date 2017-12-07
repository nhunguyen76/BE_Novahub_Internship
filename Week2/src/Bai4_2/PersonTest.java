package Bai4_2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {

	Person p1;
	
	@Before
	public void setUp() throws Exception {
		p1 = new Person("Nhu","DN");
	}

	@Test
	public void testPerson() {
		assertEquals("Nhu",p1.getName());
		assertEquals("DN",p1.getAddress());
	}

	@Test
	public void testGetName() {
		assertEquals("Nhu",p1.getName());
	}

	@Test
	public void testSetAddress() {
		p1.setAddress("VN");
		assertEquals("VN",p1.getAddress());
	}

	@Test
	public void testToString() {
		String expected = "Person[name=Nhu,address=DN]";
		assertEquals(expected,p1.toString());
	}

}
