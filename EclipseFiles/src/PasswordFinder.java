
public class PasswordFinder {

	public static void main(String[] args) {
		String yourPassword = "abcAB12";
		if (isValidPassword(yourPassword)) {
			System.out.println(yourPassword + " is a proper password.");
		} else {
			System.out.println(yourPassword + " is not a proper password.");
		}
	}

	public static boolean isValidPassword(String password) {
		boolean validPassword = false;
		int upperCase = 0;
		int digits = 0;
		int specials = 0;
		char testedChar;
		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			if (Character.isUpperCase(c)) {
				upperCase++;
			}
			if (Character.isDigit(c)) {
				digits++;
			}
			if (c == 33 || c == 64 || c == 35 || c == 36 || c == 37 || c == 94 || c == 38 || c == 42 || c == 40
					|| c == 41) {
				specials++;
			}
		}
		if (password.length() > 7 && password.length() < 11 && upperCase > 1 && digits > 1 && specials > 0) {
			validPassword = true;
		}
		return validPassword;
	}
}
