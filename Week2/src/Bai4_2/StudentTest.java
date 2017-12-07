package Bai4_2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {

	Student s1;
	
	@Before
	public void setUp() throws Exception {
		s1 = new Student("Nhu", "DN", "CNTT", 2014, 5000);
	}

	@Test
	public void testStudent() {
		assertEquals("Nhu",s1.getName());
		assertEquals("DN",s1.getAddress());
		assertEquals("CNTT",s1.getProgram());
		assertEquals(2014,s1.getYear());
		assertEquals(5000,s1.getFee(),0.000001);
	}

	@Test
	public void testSetProgram() {
		s1.setProgram("Y Duoc");
		assertEquals("Y Duoc",s1.getProgram());
	}

	@Test
	public void testSetYear() {
		s1.setYear(2012);
		assertEquals(2012,s1.getYear());
	}

	@Test
	public void testSetFee() {
		s1.setFee(3500);
		assertEquals(3500,s1.getFee(),0.00001);
	}

	@Test
	public void testToString() {
		String expected = "Student[Person[name=Nhu,address=DN],program=CNTT,year=2014,fee=5000.0]";
		assertEquals(expected,s1.toString());
	}
}
