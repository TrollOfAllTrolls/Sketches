import static org.junit.Assert.*;

import org.junit.Test;

public class MoreAndMoreTests {
	@Test
	public void MultTest() {

		assertEquals("10 x 0 = 0", multiply(10, 0));
		assertEquals("10 x 10 = 100", multiply(10, 10));
		assertEquals("8 x 11 = 88", multiply(8, 11));

	}

	public String multiply(int num1, int num2) {
		return num1 + " x " + num2 + " = " + num1 * num2;
	}

	@Test
	public void PrimeTest() {

		assertTrue(isPrime(3));
		assertTrue(isPrime(5));
		assertTrue(isPrime(541));
		assertFalse(isPrime(4));
		assertFalse(isPrime(12));
		assertFalse(isPrime(527));

	}

	public boolean isPrime(int num) {
		boolean Return = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				Return = false;
			}
		}
		return Return;
	}

	@Test
	public void SquareTest() {

		assertTrue(isSquare(4));
		assertTrue(isSquare(144));
		assertTrue(isSquare(64));
		assertTrue(isSquare(10201));
		assertTrue(isSquare(1));
		assertFalse(isSquare(3));
		assertFalse(isSquare(22));
		assertFalse(isSquare(143));

	}

	public boolean isSquare(int num) {
		boolean square = false;
		if (num % Math.sqrt(num) == 0) {
			square = true;
		}
		return square;
	}

	@Test
	public void CubeTest() {

		assertFalse(isCube(9));
		assertTrue(isCube(27));
		assertTrue(isCube(216));
		assertTrue(isCube(729));
		assertTrue(isCube(1));
		assertFalse(isCube(3));
		assertFalse(isCube(22));
		assertFalse(isCube(143));

	}

	public boolean isCube(int num) {
		boolean cube = false;
		double y = Math.cbrt(num);
		int x = (int)y;
		if (x == y) {
			cube = true;
		}
		return cube;
	}

}
