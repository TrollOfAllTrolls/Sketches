import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class Spiral {

	public static void main(String[] args) {
		Tortoise.show();

		for (int i = 0; i < 1500; i++) {
			Tortoise.setPenColor(Colors.getRandomColor());
			Tortoise.setSpeed(10);
			Tortoise.move(5 * i);
			Tortoise.turn(360 / 4);
			Tortoise.setPenWidth(i);
		}
	}
}