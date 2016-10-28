import static org.junit.Assert.*;

import org.junit.Test;

public class PracticeTests {

	@Test
	public void testGetFirstThreeChars() {
		assertEquals("can", getFirstThreeChars("canalope"));
		assertEquals("app", getFirstThreeChars("application"));
		assertEquals("Sev", getFirstThreeChars("Seven"));

	}

	public String getFirstThreeChars(String word) {
		String finalWord = "";
		for (int i = 0; i < word.length(); i++) {
			if (i < 3) {
				finalWord += word.charAt(i);
			}
		}
		return finalWord;
	}

	@Test
	public void testAddUnlessSame() {
		assertEquals(7, addUnlessSame(3, 4));
		assertEquals(0, addUnlessSame(10, 10));
		assertEquals(25, addUnlessSame(20, 5));
		assertEquals(0, addUnlessSame(1, 1));
	}

	public int addUnlessSame(int num1, int num2) {
		int finalNum = 0;
		if (num1 != num2) {
			finalNum = num1 + num2;
		}
		return finalNum;
	}

	@Test
	public void testReduceArrayByHalf() {
		double[] a1 = { 10.0, 5.0, 24.0 };
		double[] a2 = { 5.0, 2.5, 12.0 };

		assertArrayEquals(a2, reduceArrayByHalf(a1), 0.001);
	}

	public double[] reduceArrayByHalf(double[] array) {
		double[] finalArray = { 0.0, 0.0, 0.0 };
		for (int i = 0; i < array.length; i++) {
			finalArray[i] = array[i] / 2;
		}
		return finalArray;
	}
}
