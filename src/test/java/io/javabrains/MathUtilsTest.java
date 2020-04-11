package io.javabrains;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

@DisplayName("When running MathUtils")
class MathUtilsTest {
	
	MathUtils mathUtils;
	
	@BeforeEach
	void init() {
		mathUtils = new MathUtils();
		
	}


	@Test
	@DisplayName("Testing Add Method")
	void testAdd() {
		int expected = 2;
		int actual = mathUtils.add(1,1);
		assertEquals(expected, actual, "the add mthod shoudl add two numbers");
		
	}
	
	@Test
	@Disabled
	@DisplayName("TDD method....Testing add method...but disabled")
	void testDisabled() {
		fail("This test should be disabled");
	}
	
	@Test
	//@EnabledOnOs(value= {OS.MAC, OS.WINDOWS})
	@EnabledOnOs(value= {OS.LINUX})
	@DisplayName("testing Enable On OS annotation using Subtract Class")
	void testSubtract() {
		int expected = 4;
		int actual = mathUtils.subtract(10, 6);
		assertEquals(expected, actual, "the add mthod shoudl add two numbers");
	}
	
	
	
	@Test
	void testDivide() {
		boolean testValue = true;
		assumeTrue(testValue);  //run only if true
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "Divide by zero should throw");  //first argument is exception that needs to be thrown, second is the thing that should cause it
		
	}
	

	@Test
	void testComputeCircleArea() {
		assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "Should return right circle area");
	}
	
	@Nested
	@DisplayName("add method [nested]")
	class AddNestedTest {
		
		@Test
		@DisplayName("when addign two positive numbers")
		void testAddPositive() {
			assertEquals(2, mathUtils.add(1, 1), "should return the right sum");
		}
		
		@Test
		@DisplayName("when adding two negative numbers")
		void testAddNegative() {
			//assertEquals(-2, mathUtils.add(-1, -1), "should return the right sum");
			int expected = -2;
			int actual = mathUtils.add(-1, -1);
			//assertEquals(expected, actual, "should return sum " + expected + " but returned " + actual);
			assertEquals(expected, actual, () -> "should return sum " + expected + " but returned " + actual);
		}
		
		
	}
	
	@RepeatedTest(7)
	@DisplayName("multiply method")
	void testMultiply() {
		//assertEquals(2, mathUtils.multiply(2, 1), "should return correct product");
		assertAll(
				() -> assertEquals(4, mathUtils.multiply(2, 2)),
				() -> assertEquals(0, mathUtils.multiply(2, 0)),
				() -> assertEquals(-2, mathUtils.multiply(2, -1))
				);
	}
	
	
}
