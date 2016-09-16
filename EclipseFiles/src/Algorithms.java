import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms {
	public Algorithms() {

	}

	public static int findBrokenEgg(List<String> eggs) {
		int brokenEggInt = -5;

		for (int i = 0; i < eggs.size(); i++) {
			if (brokenEggInt == -5) {
				if (eggs.get(i).equals("cracked")) {
					brokenEggInt = i;
				}
			}
		}

		return brokenEggInt;
	}

	public static int countPearls(List oysters) {
		int pearls = 0;

		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i).equals(true)) {
				pearls++;
			}
		}

		return pearls;
	}

	public static double findTallest(List<Double> people) {
		double tallestPerson = 0;

		for (int i = 0; i < people.size(); i++) {
			if (people.get(i) > tallestPerson) {
				tallestPerson = people.get(i);
			}
		}

		return tallestPerson;
	}

	public static String findLongestWord(List<String> words) {
		String longestWord = "";

		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > longestWord.length()) {
				longestWord = words.get(i);
			}
		}

		return longestWord;
	}

	public static boolean containsSOS(List<String> morseMessage) {
		boolean containsSOS = false;

		for (int i = 0; i < morseMessage.size(); i++) {
			if (morseMessage.get(i).contains("... --- ...")) {
				containsSOS = true;
			}
		}

		return containsSOS;
	}

	public static List<Double> sortScores(List<Double> scores) {
		Collections.sort(scores);

		return scores;
	}
}
