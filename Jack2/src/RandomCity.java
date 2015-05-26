import java.util.Random;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Colors.Greens;
import org.teachingextensions.logo.Tortoise;


public class RandomCity {
	public static void House(String Height) {
int Size = 0;
int Roof =  0;
	if(Height == "large"){
		Size = 200 + (int)(Math.random()*300);
		Roof = 30 + (int)(Math.random()*40);
	}
	if(Height == "medium"){
		Size = 100 + (int)(Math.random()*200);
		Roof = 20 + (int)(Math.random()*30);
	}
	if(Height == "small"){
		Size = 50 + (int)(Math.random()*10);
		Roof = 10 + (int)(Math.random()*20);
	}
	
	int Grass = 10 + (int)(Math.random()*20);
	
	Tortoise.setPenColor(Greens.Green);
	Tortoise.move(Grass);
	Tortoise.setPenColor(Colors.getRandomColor());
	Tortoise.turn(-90);
	Tortoise.move(Size);
	Tortoise.turn(90);
	Tortoise.move(Roof);
	Tortoise.turn(90);
	Tortoise.move(Size);
	Tortoise.turn(-90);

	}
	public static void main(String[] args) {
		int HS = 1;
Tortoise.setX(0);
Tortoise.setY(500);
		Tortoise.setSpeed(10);
		Tortoise.turn(90);
		for (int i = 0; i < 40; i++) {
			HS = 1 + (int)(Math.random()*3);
			if (HS == 1) {
				House("large");
			}
			if (HS == 2) {
				House("medium");
			}
			if(HS == 3){
				House("small");
			}
		}
	}
}
