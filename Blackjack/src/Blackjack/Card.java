package Blackjack;

public class Card {

	private String suite;
	private int value;

	public Card(String suite, int value) {
		this.suite = suite;
		this.value = value;
	}

	public int getValueForCount() {
		int rValue = 10;
		if (value > 0 && value < 11) {
			rValue = value;
		}
		return rValue;
	}

	public boolean isAce() {
		boolean isAce = false;
		if (value == 1) {
			isAce = true;
		}
		return isAce;
	}

	public String toString() {
		String cValue = "";
		if (value > 1 && value < 11) {
			cValue = value + "";
		} else if (value == 11) {
			cValue = "Jack";
		} else if (value == 12) {
			cValue = "Queen";
		} else if (value == 13) {
			cValue = "King";
		} else if (value == 1) {
			cValue = "Ace";
		}
		return cValue + " of " + suite;

	}

}
