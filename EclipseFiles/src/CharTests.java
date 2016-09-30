import static org.junit.Assert.*;

import org.junit.Test;

public class CharTests {

	@Test
	public void testRepeatWithChar() {
		String string1 = "bobxbobxbob";
		String string2 = "AabcAabcAabcA";

		repeatWithChar c = new repeatWithChar();

		assertEquals(string1, c.repeatWithChar("bob", "x", 3));
		assertEquals(string2, c.repeatWithChar("A", "abc", 4));
	}

	@Test
	public void testRepeatingChar() {
		String string1 = "turtle";
		String string2 = "name";
		String string3 = "ladder";
		String string4 = "computer";

		repeatingChar c = new repeatingChar();

		assertTrue(c.repeatingChar(string1));
		assertFalse(c.repeatingChar(string2));
		assertTrue(c.repeatingChar(string3));
		assertFalse(c.repeatingChar(string4));
	}

}
