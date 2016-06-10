package Blackjack;

import java.util.Scanner;

public class BlackJackGame {
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Deck deck = new Deck();
		Hand dHand = new Hand();
		Hand myHand = new Hand();
		dHand.addCard(Deck.deck.pop());
		dHand.addCard(Deck.deck.pop());
		if (dHand.getCount() == 21 || (dHand.hasAce() && dHand.getCount() == 11)) {
			System.out.println("The dealer's hand totals up to 21. The dealer wins.");
		} else if (dHand.getCount() > 21) {
			System.out.println("The dealer's hand totals up to a number greater than 21. You win.");
		} else {
			System.out.println("This is one of the dealer's cards : " + dHand.cards.get(0));
			myHand.addCard(Deck.deck.pop());
			myHand.addCard(Deck.deck.pop());
			if (myHand.getCount() == 21 || (myHand.hasAce() && myHand.getCount() == 11)) {
				System.out.println("Your hand totals up to 21. You win.");
			} else {
				System.out.println("These are your current cards : " + myHand.cards);
			}

		}
	}

	// public void printHand(Hand hand) {
	// hand.cards;
	// }

	boolean isGameOver() {
		return false;
	}

}
