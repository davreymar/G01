package test;

import junit.framework.*;

import main.MathMethods;

public class TestSum extends TestCase {
	
	
	public void testSumaDosPositivos() {
		assertTrue(4 == MathMethods.sum(2, 2));
	}

	public void testSumaDosNegativos() {
		assertTrue(-4 == MathMethods.sum(-2, -2));
	}
	
	public void testProdDosPositivos() {
		assertTrue(4 == MathMethods.sum(2, 2));
	}

	public void testProdDosNegativos() {
<<<<<<< HEAD
		assertTrue(1 == MathMethods.sum(-1, -1));
=======
		assertTrue(5 == MathMethods.sum(-1, -5));
>>>>>>> test
	}
	
	
}