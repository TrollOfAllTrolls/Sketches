import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class TortoiseSlave {
	static void drawSquare(int length) {
		for (int i = 0; i < 400; i = i+5) {
		Tortoise.move(i);
		Tortoise.turn(90);
		}
	}
		static void drawTriangle(int length) {
			for (int i = 0; i < 400; i = i+5) {
			Tortoise.move(i);
			Tortoise.turn(120);
			}
		}
			static void drawPentagon(int length) {
				for (int i = 0; i < 1000; i++) {
				Tortoise.move(i);
				Tortoise.turn(60);
				}
			

	}

	public static void main(String[] args) {
		Tortoise.show();
		Tortoise.setSpeed(10);
		String Shape = JOptionPane.showInputDialog("What Shape Do You Want? A Square, Pentagon, or Triangle");
		if (Shape.equalsIgnoreCase("Square")) {
			drawSquare(1);
			}
		else
		{
		if (Shape.equalsIgnoreCase("Triangle")) {
			drawTriangle(1);
		}
		else
		{
			if (Shape.equalsIgnoreCase("Pentagon")) {
				drawPentagon(1);
			}
		}
		}
	}
}

		
	

