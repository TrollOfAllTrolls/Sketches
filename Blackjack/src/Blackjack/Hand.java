package Blackjack;

import java.util.ArrayList;

public class Hand {
	public ArrayList<Card> cards = new ArrayList<Card>();

	public Hand() {

	}

	public int getCount() {
		int total = 0;
		for (Card card : cards) {
			total += card.getValueForCount();
		}
		return total;
	}

	public boolean hasAce() {
		boolean hAce = false;
		for (Card card : cards) {
			if (card.getValueForCount() == 1) {
				hAce = true;
			}
		}
		return hAce;
	}

	public void addCard(Card card) {
		cards.add(card);
	}

	public boolean isOver21() {
		boolean over21 = false;
		if (getCount() > 21) {
			over21 = true;
		}
		return over21;
	}

	public boolean isOver16() {
		boolean over16 = false;
		if (getCount() > 16) {
			over16 = true;
		}
		return over16;
	}

}
