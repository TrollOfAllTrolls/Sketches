import java.util.ArrayList;
import java.util.Random;

public class Forest {
	public static void main(String[] args) {
		int totalHeight = 0;
		Random r = new Random();
		ArrayList<Tree> forest = new ArrayList<Tree>();
		for (int i = 0; i < 100; i++) {
			int randNumber = r.nextInt(81) + 20;
			forest.add(new Tree(randNumber));
		}
		for (int j = 0; j < forest.size(); j++) {
			Tree t = forest.get(j);
			if (j == 0 || j == forest.size() - 1) {
				totalHeight += t.getHeight();
			}
			System.out.println(t.getHeight() + " feet");
		}
		System.out.println("The height of the first and last trees combined is " + totalHeight + " feet.");
	}
}
