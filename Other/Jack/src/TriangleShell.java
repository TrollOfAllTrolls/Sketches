import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class TriangleShell {

	public static void main(String[] args) {
		Tortoise.setSpeed(10);
		int length = 25;
		// 6. Do the following 60 times
		for (int a = 0; a < 60; a = a + 1) {
			Tortoise.setPenWidth(4);
			Tortoise.setPenColor(Colors.getRandomColor());
			Tortoise.turn(6);
			drawTriangle(length);
			length = length + 5;
		}
		// 8. Change the color of the line the tortoise draws to a random color
		// 7. Increase the length of the side by 4 pixels

		// 9. Turn the tortoise 6 degrees to the right
	}

	private static void drawTriangle(int length) {
		Tortoise.turn(30);
		Tortoise.move(length);
		Tortoise.turn(120);
		Tortoise.move(length);
		Tortoise.turn(120);
		Tortoise.move(length);
		Tortoise.turn(90);
	}
}
