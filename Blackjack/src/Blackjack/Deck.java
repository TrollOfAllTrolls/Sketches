package Blackjack;

import java.util.Collections;
import java.util.Stack;

public class Deck {
	public static Stack<Card> deck = new Stack<Card>();

	public Deck() {
		String[] suites = { "Hearts", "Spades", "Diamonds", "Clubs" };
		for (int i = 0; i < 4; i++) {

			for (int j = 1; j < 14; j++) {
				deck.add(new Card(suites[i], j));
			}
		}

		Collections.shuffle(deck);
	}
}
