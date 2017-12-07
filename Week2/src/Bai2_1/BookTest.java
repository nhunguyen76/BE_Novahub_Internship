package Bai2_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class BookTest {

	Author x= new Author("Nhu Nguyen","ntqn960607@gmail.com",'f');
	
	@Test
	public void testBookStringAuthorDouble() {
		Book b = new Book("Comic",x, 20000);
		
		assertEquals("Comic", b.getName());
		assertEquals("Author[name=Nhu Nguyen,email=ntqn960607@gmail.com,gender=f]",b.getAuthor().toString());
		assertEquals(20000, b.getPrice(),0.000001);
	}

	@Test
	public void testBookStringAuthorDoubleInt() {
		Book b = new Book("Comic",x, 20000,100);
		
		assertEquals("Comic", b.getName());
		assertEquals("Nhu Nguyen",b.getAuthor().getName());
		assertEquals("ntqn960607@gmail.com",b.getAuthor().getEmail());
		assertEquals('f',b.getAuthor().getGender());
		assertEquals(20000, b.getPrice(),0.000001);
		assertEquals(100,b.getQty());
	}

	@Test
	public void testGetName() {
		Book b = new Book("Comic",x, 20000,100);
		assertEquals("Comic", b.getName());
	}

	@Test
	public void testGetAuthor() {
		Book b = new Book("Comic",x, 20000);
		assertEquals("Nhu Nguyen",b.getAuthor().getName());
		assertEquals("ntqn960607@gmail.com",b.getAuthor().getEmail());
		assertEquals('f',b.getAuthor().getGender());
	}

	@Test
	public void testGetPrice() {
		Book b = new Book("Comic",x, 20000);
		assertEquals(20000, b.getPrice(),0.000001);
	}

	@Test
	public void testSetPrice() {
		Book b = new Book("Comic",x, 20.5);
		b.setPrice(25);
		assertEquals(25, b.getPrice(),0.000001);
	}

	@Test
	public void testGetQty() {
		Book b = new Book("Comic",x, 20,100);
		assertEquals(100, b.getQty());
	}

	@Test
	public void testSetQty() {
		Book b = new Book("Comic",x, 20,100);
		b.setQty(110);
		assertEquals(110, b.getQty());
	}

	@Test
	public void testToString() {
		Book b = new Book("Comic",x,20.5,100);
		assertEquals("Book[name=Comic,Author[name=Nhu Nguyen,email=ntqn960607@gmail.com,gender=f],price=20.5,qty=100]", b.toString());
	}
}


