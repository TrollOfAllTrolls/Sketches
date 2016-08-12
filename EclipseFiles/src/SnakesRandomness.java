import java.util.Random;

public class SnakesRandomness {
	static public boolean isVenomous() {
		Random random = new Random();
		boolean venomous = false;
		int venom = random.nextInt(2);
		if ((venom == 1))
			venomous = true;
		return venomous;
	}

	static public int Viciousness() {
		Random random = new Random();
		int viciousness = random.nextInt(10) + 1;
		return viciousness;
	}
}
