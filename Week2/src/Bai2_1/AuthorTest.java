package Bai2_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class AuthorTest {

	
	@Test
	public void testAuthor() {
		Author x= new Author("Nhu Nguyen","ntqn960607@gmail.com",'f');
		assertEquals("Nhu Nguyen", x.getName());
		assertEquals("ntqn960607@gmail.com", x.getEmail());
		assertEquals('f', x.getGender());
	}

	@Test
	public void testGetName() {
		Author x= new Author("Nhu Nguyen","ntqn960607@gmail.com",'f');
		assertEquals("Nhu Nguyen", x.getName());
	}

	@Test
	public void testGetEmail() {
		Author x= new Author("Nhu Nguyen","ntqn960607@gmail.com",'f');
		assertEquals("ntqn960607@gmail.com", x.getEmail());
	}

	@Test
	public void testSetEmail() {
		Author x= new Author("Nhu Nguyen","ntqn960607@gmail.com",'f');
		x.setEmail("nhu123@gmail.com");
		assertEquals("nhu123@gmail.com", x.getEmail());
	}

	@Test
	public void testGetGender() {
		Author x= new Author("Nhu Nguyen","ntqn960607@gmail.com",'f');
		assertEquals('f', x.getGender());
	}

	@Test
	public void testToString() {
		Author x= new Author("Nhu Nguyen","ntqn960607@gmail.com",'f');
		assertEquals("Author[name=Nhu Nguyen,email=ntqn960607@gmail.com,gender=f]", x.toString());
	}

}
