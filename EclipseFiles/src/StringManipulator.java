import java.util.Stack;

public class StringManipulator {
	public StringManipulator() {

	}

	public String reverseWord(String word) {
		String reversedWord = "";
		Stack<Character> rev = new Stack<Character>();

		for (int i = 0; i < word.length(); i++) {
			rev.push(word.charAt(i));
		}
		for (int j = 0; j < word.length(); j++) {
			reversedWord += rev.pop();
		}
		return reversedWord;
	}

	public String capitalizeWord(String word) {
		word = word.toUpperCase();
		return word;
	}
}
