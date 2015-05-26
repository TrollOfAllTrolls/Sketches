import org.teachingextensions.logo.Tortoise;

public class Slinky {
	public static void main(String[] args) {
for (int i = 0; i < 11; i++) {
	Circle();
}
	}

	public static void Circle() {
		for (int i = 0; i < 360; i++) {
			Tortoise.setSpeed(10);
			Tortoise.show();
			Tortoise.move(1);
			Tortoise.turn(1);
		}
		Tortoise.turn(90);
		Tortoise.move(5);
		Tortoise.turn(270);
	}
}
