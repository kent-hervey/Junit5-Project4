package io.javabrains;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void testAdd() {
		MathUtils mathUtils = new MathUtils();
		int expected = 2;
		int actual = mathUtils.add(1,1);
		assertEquals(expected, actual, "the add mthod shoudl add two numbers");
		
	}
	
	
	@Test
	void testDivide() {
		MathUtils mathUtils = new MathUtils(); 
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "Divide by zero should throw");  //first argument is exception that needs to be thrown, second is the thing that should cause it
		
	}
	

	@Test
	void testComputeCircleArea() {
		MathUtils mathUtils = new MathUtils();
		assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "Should return right circle area");
	}
	
	
}
