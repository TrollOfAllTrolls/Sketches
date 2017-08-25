package Encryption;

import java.io.IOException;

import org.omg.Messaging.SyncScopeHelper;

public class EncryptedCommunication {

	// private static Encrypter encrypter = new Encrypter();
	private static Decrypter decrypter = new Decrypter();

	public static void main(String[] args) {
		// try {
		// encrypter.createMappingFile();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// String myText = "likifucrieveritim";
		// // System.out.println(myText);
		// String encrypted = encrypter.encrypt(myText);
		// System.out.println(encrypted);
		String eVar = "fghx rdwnl vd trgy zgri rcin grr bgy geb ecjzv.";
		try {
			decrypter.readMappingFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String dC = decrypter.decode(eVar);
		System.out.println(dC);
	}

}
