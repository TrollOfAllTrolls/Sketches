import java.util.ArrayList;
import java.util.Random;

public class LongChipCompetition {
	double LongestChip = 0;
	String LongestChipOwner = "";
	/**
	 * The Beatles are eating lunch and playing a game to see who has the
	 * longest chip. (In England, french fries are called "chips".)
	 * 
	 * Find the Beatle with the longest chip. You may not edit the Chip or
	 * Beatle classes. Make sure to initialize The Beatles before you start your
	 * search.
	 * 
	 **/

	private ArrayList<Beatle> theBeatles = new ArrayList<Beatle>();

	public static void main(String[] args) {
		LongChipCompetition StartUp = new LongChipCompetition();
		StartUp.initializeBeatles();
		StartUp.findLongestChip();
	}

	private void findLongestChip() {
		for (Beatle name : theBeatles) {
			for (Chip chip : name.getChips()) {
				if (chip.getLength() > LongestChip) {
					LongestChip = chip.getLength();
					LongestChipOwner = name.getName();
				}
			}
		}
		System.out
				.println(LongestChipOwner + " has the longest chip. His longest chip is " + LongestChip + "cm long.");
	}

	private void initializeBeatles() {
		Beatle george = new Beatle("George");
		Beatle john = new Beatle("John");
		Beatle paul = new Beatle("Paul");
		Beatle ringo = new Beatle("Ringo");

		theBeatles.add(george);
		theBeatles.add(john);
		theBeatles.add(paul);
		theBeatles.add(ringo);
	}
}

class Beatle {
	private String name;
	private ArrayList<Chip> chips = new ArrayList<Chip>();

	public Beatle(String name) {
		this.name = name;
		initializePlateOfChips();
	}

	private void initializePlateOfChips() {
		int numberOfChips = new Random().nextInt(4) + 1;
		for (int i = 0; i < numberOfChips; i++) {
			chips.add(new Chip(Math.round(new Random().nextDouble() * 1000.0) / 100.0));
		}
	}

	public ArrayList<Chip> getChips() {
		return this.chips;
	}

	public String getName() {
		return this.name;
	}

}

class Chip {
	private double length;

	public double getLength() {
		return length;
	}

	Chip(double d) {
		this.length = d;
	}
}
