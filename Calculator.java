package co.misbah;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Calculator {
	//sum
	public int doSum(int a , int b , int c ) {
		return a+b+c;
		
	}
	//product
	public int doProduct (int a, int b) {
		return a*b;
		
	}
	@Test
	public void testSum() {
		
		int expectedResult = 17;
		int actualResult = doSum(12, 3, 2);
		assertEquals(actualResult,expectedResult);
	}


}
