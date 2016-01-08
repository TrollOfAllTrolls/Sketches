import java.util.ArrayList;

public class SPlane {
	public static void main(String[] args) {
		int PoD;
		int VSnakes = 0;
		int Viciousness = 0;
		int numberOfPassengers = 366;
		ArrayList<SSnake> Snakes = new ArrayList<SSnake>();
		for (int i = 0; i < 100; i++) {
			Snakes.add(new SSnake(new SRandomness().rN(), new SRandomness().rTF()));
			Viciousness = Viciousness + Snakes.get(i).getViciousness();
			if (Snakes.get(i).isVenemous()) {
				VSnakes = VSnakes + 1;
			}
		}
		PoD = VSnakes * Viciousness / numberOfPassengers;
		System.out.println("The Probability of Death is " + PoD);
	}
}
