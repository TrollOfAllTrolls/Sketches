import java.util.ArrayList;

public class SPlane {
	public static void main(String[] args) {
		int PoD;
		int VSnakes = 0;
		int numberOfPassengers;
		ArrayList<SSnake> Snakes = new ArrayList<SSnake>();
		for (int i = 0; i < 100; i++) {
			Snakes.add(new SSnake(SRandomness.random, SRandomness.TF));
			if (Snakes.get(i).isVenemous()) {
				VSnakes = VSnakes + 1;
			}
		}
		PoD = 0;
	}
}
