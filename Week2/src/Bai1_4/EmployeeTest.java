package Bai1_4;

import static org.junit.Assert.*;

import org.junit.Test;


public class EmployeeTest {

	Employee p=new Employee(1,"Nhu","Nguyen",1000);
	@Test
	public void testEmployee() {
		assertEquals(1,p.id);
		assertEquals("Nhu",p.firstName);
		assertEquals("Nguyen",p.lastName);
		assertEquals(1000,p.salary);
	}

	@Test
	public void testGetId() {
		assertEquals(1,p.id);
	}

	@Test
	public void testGetSalary() {
		assertEquals(1000,p.salary);
	}

	@Test
	public void testSetSalary() {
		p.setSalary(2000);
		assertEquals(2000,p.salary);
	}

	@Test
	public void testGetFirstName() {
		assertEquals("Nhu",p.firstName);
	}

	@Test
	public void testGetLastName() {
		assertEquals("Nguyen",p.lastName);
	}

	@Test
	public void testGetName() {
		assertEquals("Nhu Nguyen",p.getName());
	}

	@Test
	public void testGetAnnualSalary() {
		assertEquals(1000*12,p.getAnnualSalary());
	}

	@Test
	public void testRaiseSalary() {
		assertEquals((1000*10/100)+p.salary,p.raiseSalary(10));
	}

	@Test
	public void testToString() {
		assertEquals("Employee[id="+p.id+",name="+p.getName()+",salary="+p.salary+"]",p.toString());
	}

}
