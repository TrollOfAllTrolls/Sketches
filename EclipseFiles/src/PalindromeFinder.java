import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Stack;

public class PalindromeFinder {
	public static void main(String[] args) {
		System.out.println('\n' + "There are " + findPalindromes() + " palindromes.");
	}

	public static int findPalindromes() {
		int palindromes = 0;
		String word = "";
		try {
			FileReader files = new FileReader(new File("Words.txt"));
			int c = 0;
			while ((c = files.read()) != -1) {
				char letter = (char) c;
				if (letter == '\n') {
					if (isPalindrome(word)) {
						palindromes += 1;
						System.out.println(word + " is a palindrome.");
					}
					word = "";
				} else {
					word += letter;
				}

			}
		} catch (Exception e) {
			System.out.println("Error loading file");
		}
		return palindromes;
	}

	public static boolean isPalindrome(String word) {
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
