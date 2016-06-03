import java.util.ArrayList;

public class DNA {

	ArrayList<String> hCells = new ArrayList<String>();
	ArrayList<String> cCells = new ArrayList<String>();

	public static void main(String[] args) {

	}

	public void populate() {
		hCells.add("TGCATCC");
		hCells.add("AAATTTGGGCCCC");
		hCells.add("ATGCGCTA");
		hCells.add("GGGTACGGAC");
		hCells.add("TTAATTGGG");

		cCells.add("ATTTGCAGG");
		cCells.add("TGCAAATTA");
		cCells.add("AAAGGGCCCTTT");
		cCells.add("TGCGATACGTAGGACCA");
		cCells.add("ACTCATTAGTGC");
		cCells.add("AAACGCTAGACACACAAG");
	}

	// private boolean isOncogene(ArrayList<String> hSequences, ArrayList<String> cSequences, String canidate) {

	// }

	private double frequency(ArrayList<String> cells, String canidate) {
		int canidateCells = 0;
		int percentage = 0;
		for (String cell : cells) {
			if (cells.contains(canidate)) {
				canidateCells++;
			}
		}
		percentage = canidateCells / cells.size();
		percentage *= 100;
		return percentage;
	}
}
