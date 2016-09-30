
public class repeatingChar {
	String Word;

	public boolean repeatingChar(String word) {
		Word = word;
		char selectedChar;
		int letters = 0;
		boolean isRepeatingChar = false;

		for (int i = 0; i < Word.length(); i++) {
			selectedChar = Word.charAt(i);
			for (int j = 0; j < Word.length(); j++) {
				if (Word.charAt(j) == selectedChar) {
					letters++;
				}
				if (letters > 1) {
					isRepeatingChar = true;
				}
			}
			letters = 0;
		}

		return isRepeatingChar;
	}
}
