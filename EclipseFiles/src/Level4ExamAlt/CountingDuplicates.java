import java.util.Scanner;

public class CountingDuplicates {
	public static int duplicateCount(String word) {
		int duplicates = 0;
		for(int i = 0; i < word.length(); i++) {
			for(int j = 0; j < word.length(); j++) {
				if(word.charAt(i) == word.charAt(j) && i != j) {
					word = word.replaceAll("" + word.charAt(i), "");
					duplicates++;
				}
			}
		}
		return duplicates;
	}
}
