import java.util.ArrayList;

public class Plane {
	static int numberOfPassengers = 50;

	public static void main(String[] args) {
		int totalVenom = 0;
		int percentOfDeath;
		ArrayList<Snake> Snakes = new ArrayList<Snake>();
		for (int i = 0; i < 100; i++) {
			Snakes.add(new Snake(SnakesRandomness.Viciousness(), SnakesRandomness.isVenomous()));
		}
		for (Snake snake : Snakes) {
			if (snake.isVenomous()) {
				totalVenom += snake.getViciousness();
			}
		}
		percentOfDeath = totalVenom * 10 / numberOfPassengers;
		System.out.println(percentOfDeath + "% of passengers on board this plane are likely to die.");
	}
}
