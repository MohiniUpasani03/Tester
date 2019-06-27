/*package com.junit.demo1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GreetingImplTest {

	private Greeting greet;
	@Before
	public void setup() {
		greet = new GreetingImpl();
	}
	
	@Test
	public void greetShouldReturnValidOutput() {
		String result = greet.greet("Junit");
		assertNotNull(result);
		assertEquals("Hello Junit", result);
	}

	@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowAnException() {
		greet.greet(null);
	}
	@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowAnException_Null() {
		greet.greet(" ");
	}
	
	@After
	public void tearDown() {
		greet = null;
	}
	
}
*/