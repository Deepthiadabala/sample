package com.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testSayHello() {
		Calculator calculator = new Calculator();
		assertEquals("welcomeHello", calculator.sayHello("Hello"));
	}

}
