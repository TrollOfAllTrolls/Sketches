import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;


public class FlamingNinjaStar {
	public static void main(String[] args) {
		Tortoise.setX(400);

		for (int i = 0; i < 25; i++) {
			
		
		Tortoise.setSpeed(10);
		Tortoise.show();
		Tortoise.turn(45);
		Tortoise.move(50);
		Tortoise.turn(320);
		Tortoise.setPenColor(Colors.Oranges.Orange);
		Tortoise.move(160);
		Tortoise.turn(170);
		Tortoise.move(170);
		Tortoise.setPenColor(Colors.Grays.Black);
		Tortoise.turn(424);
		Tortoise.move(270);
		}
	}

}
