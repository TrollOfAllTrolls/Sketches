import java.util.ArrayList;
import java.util.Stack;

public class PalindromeFinder {
	public static void main(String[] args) {
		ArrayList<String> allWords = readFromFile("Words.txt");
		PalindromeFinder Start = new PalindromeFinder();
		boolean s = Start.findPalindromes();
		System.out.println(s);
	}

	public int findPalindromes(ArrayList<String> words) {
		int palindromes = 0;

		for (String word : words) {
			if (isPalindrome(word)) {
				palindromes++;
			}
		}

		return palindromes;
	}

	public boolean isPalindrome(String word) {
		Stack<Character> letters = new Stack<Character>();
		String compareWord = "";
		boolean isPalindrome = false;

		for (int i = 0; i < word.length(); i++) {
			letters.add(word.charAt(i));
		}

		for (int j = 0; j < word.length(); j++) {
			compareWord += letters.pop();
		}

		if (word.equals(compareWord)) {
			isPalindrome = true;
		}
		return isPalindrome;
	}
}
