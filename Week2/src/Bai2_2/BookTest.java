package Bai2_2;

import static org.junit.Assert.*;

import org.junit.Test;


public class BookTest {
	Author x= new Author("Nhu Nguyen","ntqn960607@gmail.com",'f');
	Author y= new Author("An Nguyen","anng@gmail.com",'f');
	Author authors[]= {x,y};
	
	@Test
	public void testBookStringAuthorArrayDouble() {
		Book b = new Book("Comic",authors, 20.5);
		assertEquals("Comic",b.getName());
		assertEquals("Nhu Nguyen",b.getAuthors()[0].getName());
		assertEquals("ntqn960607@gmail.com",b.getAuthors()[0].getEmail());
		assertEquals('f',b.getAuthors()[0].getGender());
		assertEquals("An Nguyen",b.getAuthors()[1].getName());
		assertEquals("anng@gmail.com",b.getAuthors()[1].getEmail());
		assertEquals('f',b.getAuthors()[1].getGender());
		assertEquals(20.5,b.getPrice(),0.000001);
	}

	@Test
	public void testBookStringAuthorArrayDoubleInt() {
		Book b = new Book("Comic",authors, 20.5,100);
		assertEquals("Comic",b.getName());
		assertEquals("Nhu Nguyen",b.getAuthors()[0].getName());
		assertEquals("ntqn960607@gmail.com",b.getAuthors()[0].getEmail());
		assertEquals('f',b.getAuthors()[0].getGender());
		assertEquals("An Nguyen",b.getAuthors()[1].getName());
		assertEquals("anng@gmail.com",b.getAuthors()[1].getEmail());
		assertEquals('f',b.getAuthors()[1].getGender());
		assertEquals(20.5,b.getPrice(),0.000001);
		assertEquals(100,b.getQty());
	}

	@Test
	public void testGetName() {
		Book b = new Book("Comic",authors, 20.5);
		assertEquals("Comic",b.getName());
	}

	@Test
	public void testGetAuthors() {
		Book b = new Book("Comic",authors, 20.5,100);
		assertEquals("Comic",b.getName());
		assertEquals("Nhu Nguyen",b.getAuthors()[0].getName());
		assertEquals("ntqn960607@gmail.com",b.getAuthors()[0].getEmail());
		assertEquals('f',b.getAuthors()[0].getGender());
		assertEquals("An Nguyen",b.getAuthors()[1].getName());
		assertEquals("anng@gmail.com",b.getAuthors()[1].getEmail());
		assertEquals('f',b.getAuthors()[1].getGender());
	}

	@Test
	public void testGetPrice() {
		Book b = new Book("Comic",authors, 20.5);
		assertEquals(20.5,b.getPrice(),0.000001);
	}

	@Test
	public void testSetPrice() {
		Book b = new Book("Comic",authors, 20.5);
		b.setPrice(21);
		assertEquals(21,b.getPrice(),0.000001);
	}

	@Test
	public void testGetQty() {
		Book b = new Book("Comic",authors, 20.5,100);
		assertEquals(100,b.getQty());
	}

	@Test
	public void testSetQty() {
		Book b = new Book("Comic",authors, 20.5,10);
		b.setQty(200);
		assertEquals(200,b.getQty());
	}

	@Test
	public void testToString() {
		Book b = new Book("Comic",authors, 20.5,100);
		assertEquals("Book[name=Comic,authors={Author[name=Nhu Nguyen,email=ntqn960607@gmail.com,gender=f],Author[name=An Nguyen,email=anng@gmail.com,gender=f]},price=20.5,qty=100]",b.toString());
	}

}
