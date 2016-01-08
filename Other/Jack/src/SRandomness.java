import java.util.Random;

public class SRandomness {
	Random r = new Random();
	static int random;
	static boolean TF;

	public int rN() {
		random = r.nextInt(10) + 1;

		return random;
	}

	public boolean rTF() {
		return r.nextBoolean();
	}

}
