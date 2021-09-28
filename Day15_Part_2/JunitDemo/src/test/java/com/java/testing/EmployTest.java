package com.java.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployTest {

	@Test
	public void testConstructor() {
		Employ employ = new Employ();
		assertNotNull(employ);
	}
	
	@Test
	public void testSum() {
		assertEquals(5, 2+3);
	}

}
