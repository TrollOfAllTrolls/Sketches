
public class NumberCubeQuestion {

	public static int[] getCubeTosses(NumberCube cube, int length) {
		int[] rolls = new int[length];

		for (int i = 0; i < length; i++) {
			rolls[i] = cube.toss();
		}

		return rolls;
	}

	public static int getLongestRun(int[] rolls) {
		int longestRun = 1;
		int lRStart = 0;
		int currentRun = 1;
		int cRStart = 0;
		int lastNumber = rolls[0];

		if (rolls.length > 1) {
			for (int i = 1; i < rolls.length; i++) {
				if (rolls[i] == lastNumber) {
					currentRun += 1;
				} else {
					cRStart = i;
					currentRun = 1;
				}
				if (currentRun > longestRun) {
					lRStart = cRStart;
					longestRun = currentRun;
				}

				lastNumber = rolls[i];
			}
		}
		return lRStart;
	}
}
