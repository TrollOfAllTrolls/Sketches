
public class repeatWithChar {
	String Text;
	String Fill;
	int Times;

	public String repeatWithChar(String text, String fill, int times) {
		Text = text;
		Fill = fill;
		Times = times;
		String finalWord = "";

		for (int i = 0; i < Times - 1; i++) {
			finalWord += Text;
			finalWord += Fill;
		}

		finalWord += Text;

		return finalWord;
	}
}
