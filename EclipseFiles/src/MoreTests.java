import static org.junit.Assert.*;

import org.junit.Test;

public class MoreTests {

	@Test
	public void testStarString() {
		assertEquals("***de***", starString("abcdefgh", "de"));
		assertEquals("1***", starString("1234", "1"));
		assertEquals("r*****r", starString("racecar", "r"));
	}

	public String starString(String examinedWord, String characters) {

		String resultWord = "";
		String letters = "";

		for (int i = 0; i < examinedWord.length() - characters.length() + 1; i++) {

			for (int j = 0; j < characters.length(); j++) {
				letters += examinedWord.charAt(i + j);
			}

			if (letters.equals(characters)) {
				resultWord += characters;
			} else {
				resultWord += "*";
			}
			letters = "";

		}

		return resultWord;
	}

	@Test
	public void testAddSpecial() {
		assertEquals(6, addSpecial(1, 2, 3));
		assertEquals(10, addSpecial(4, 6, 4));
		assertEquals(2, addSpecial(2, 2, 2));
	}

	public int addSpecial(int firstNum, int secondNum, int thirdNum) {

		if (firstNum == secondNum) {
			secondNum = 0;
		}

		if (firstNum == thirdNum) {
			thirdNum = 0;
		}

		if (secondNum == thirdNum) {
			thirdNum = 0;
		}

		return firstNum + secondNum + thirdNum;
	}

	@Test
	public void testCountEvens() {
		int[] t1 = { 1, 2, 3, 4 };
		int[] t2 = { 2, 2, 2, 2, 2 };
		int[] t3 = { 8, 6, 7, 5, 3, 0, 9 };
		assertEquals(2, countEvens(t1));
		assertEquals(5, countEvens(t2));
		assertEquals(3, countEvens(t3));
	}

	public int countEvens(int[] list) {

		int evens = 0;

		for (int i = 0; i < list.length; i++) {
			if (list[i] % 2 == 0) {
				evens++;
			}
		}

		return evens;
	}

}
