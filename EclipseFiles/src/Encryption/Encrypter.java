package Encryption;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Encrypter {

	public static ArrayList<Character> alphabet = new ArrayList<Character>();
	public static ArrayList<Character> availableChar = new ArrayList<Character>();
	public static HashMap<Character, Character> mapping = new HashMap<Character, Character>();
	private static Random random = new Random();

	public Encrypter() {
		populateAlphabet(alphabet);
		populateAlphabet(availableChar);
	}

	public String encrypt(String clearText) {
		// return the encrypted value!
		String e = "";
		for (char c : clearText.toCharArray()) {
			if (c < 97 || c > 122)
				e += c;
			else
				e += mapping.get(c);
		}
		return e;
	}

	public static void populateAlphabet(ArrayList<Character> a) {
		for (int i = 97; i < 123; i++) {
			a.add((char) i);
		}
	}

	public static Character pickAnyOfTheRemainingChars() {
		// return a random remaining character;
		int x = random.nextInt(availableChar.size());
		char y = availableChar.get(x);
		availableChar.remove(x);
		return y;
	}

	public static void createMappingFile() throws IOException {
		FileWriter fw = new FileWriter("encryptionMap.txt");
		for (Character c : alphabet) {
			char t = pickAnyOfTheRemainingChars();
			mapping.put(c, t);
			fw.write(c + ":" + t); // update that
			fw.write('\n');
		}

		fw.close();
	}
}
