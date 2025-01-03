package junitexamples.demo;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTests {

	@Test
	@DisplayName("1 + 1 = 2")
	void testAddsTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
	}
	
	@Test
	@DisplayName("checknullvalues")
	void testAddsTwoNumbersResultAsNull() {
		Calculator calculator = new Calculator();
		assertNotEquals(null,calculator.add(15, 10),"15 + 10 should equal 25");
	}
	
	@Test
	@DisplayName("1 + 12 = 13")
	void testAddsTwoNumbersWrongResults() {
		Calculator calculator = new Calculator();
		assertNotEquals(2, calculator.add(1, 12), "1 + 1 should equal 13");
	}
	
	
	@Test
	@DisplayName("15 / 10 =1 ")
	void testDivideTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(1, calculator.divison(15, 10), "1 / 0 should give an error");
	}
	
	@Test
	@DisplayName("1 / 0 = ")
	void testDivideTwoNumbersExceptions() {
		Calculator calculator = new Calculator();
		assertThrows(ArithmeticException.class, ()->calculator.divison(1, 0), "1 / 0 should give an error");
		//assertThrows(null, null)
	}
}
