import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

public class StringBarf {

	public String reverseMe(String word) {
		Stack<Character> letters = new Stack<Character>();
		String fWord = "";

		for (int i = 0; i < word.length(); i++) {
			letters.add(word.charAt(i));
		}

		for (int j = 0; j < word.length(); j++) {
			fWord += letters.pop();
		}

		return fWord;
	}

	@Test
	public void test() {
		assertEquals("frab", reverseMe("barf"));
	}

}
