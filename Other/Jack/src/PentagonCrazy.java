import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class PentagonCrazy {
	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}

	private void makePrettyThings() {
		Tortoise.show();
		Tortoise.setSpeed(10);
		int side = 5;
		for (int i = 0; i < 2000; i++) {
			Tortoise.move(i);
			// 6. make the tortoise move "i" pixels instead of 100 (donÕt need
			Tortoise.setPenColor(Colors.getRandomColor());

			// 3. turn the tortoise 360 degrees divided by the number of sides
			Tortoise.turn(360 / side + 1);
			// 7. turn the tortoise one more degree
			Tortoise.turn(1);
		}

	}
	// Variations:
	// *8. make the pattern really huge
	// change the color of the pattern
	// *9. create a method called, "adjustPen()"
	// make the pen get increasingly bigger
	// stop the pen getting too big (less than 4)
	// *10. choose 5 colors and change them every time adjustPen() is called
	// *11. experiment with different shapes
}
