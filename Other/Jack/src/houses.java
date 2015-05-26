import java.awt.Color;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;



public class houses {
	public static void main(String[] args) {
// Copyright Wintriss Technical Schools 2013
		Tortoise.setSpeed(10);
		Tortoise.setX(10);
		Tortoise.setY(900);
		Tortoise.show();
		JacksFirstMethod("small");
		JacksFirstMethod("medium");
		JacksFirstMethod("large");
		JacksFirstMethod("medium");
		JacksFirstMethod("small");
		JacksFirstMethod("small");
		JacksFirstMethod("large");
		JacksFirstMethod("small");
		JacksFirstMethod("medium");
	}
	
   static void JacksFirstMethod(String Lol){
		//This method will draw a house for a height
	    int height = 0;
	if (Lol.equalsIgnoreCase("small")) 
	{
		height = 60;
	
	}

	if (Lol.equalsIgnoreCase("medium")) 
	{
		height = 125;
	
	}

	if (Lol.equalsIgnoreCase("large")) 
	{
		height = 175;
	
	}
		
Tortoise.setPenColor(Colors.getRandomColor());
		Tortoise.move(height);
		Tortoise.turn(45);
		Tortoise.move(30);
		Tortoise.turn(90);
		Tortoise.move(30);
		Tortoise.turn(45);
		Tortoise.move(height);
		Tortoise.turn(-90);
		Tortoise.setPenColor(Color.GREEN);
		Tortoise.move(15);
		Tortoise.turn(-90);
   

   }
   
/*4. draw 9 houses of different heights

5. make the method take a String instead of a height	
	
“small” 		60
“medium”	 	120
“large”			250

6. make the method take a color 

7. make the grass (between houses) always green

8. give the houses peaked roofs

9. extract that into a method “drawPointyRoof” and “drawFlatRoof”

9. make large houses have flat roofs

10. make the roof type selection random

*/
}

