
public class myProgram {
	public static String autocorrect(String input) {
		int counter = 0;
		String finalSentence = "";
		String[] words = input.split(" ");
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length(); j++) {
				if (words[i].charAt(j) != 'Y' && words[i].charAt(j) != 'y' && words[i].charAt(j) != 'O'
						&& words[i].charAt(j) != 'o' && words[i].charAt(j) != 'U' && words[i].charAt(j) != 'u') {
					counter++;
				}
			}
			if (counter == 0) {
				words[i] = "your sister";
			}
			counter = 0;
			finalSentence += words[i] + " ";
		}
		return finalSentence.trim();
	}
}
