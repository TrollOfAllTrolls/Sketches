import java.awt.Color;

import org.teachingextensions.logo.Tortoise;

	public class SimpleSquare
	{
	  public static void main(String[] args) throws Exception
	  {
	    //  1. Show the tortoise --#1
		  Tortoise.show();
	    //  6. Make the tortoise move as fast as possible --#6
		  Tortoise.setSpeed(10);
	    //  5. Do the following 4 times --#5.1
		  for (int i = 0; i < 4; i++) {
			
		
	    //      4. Change the color of the line the tortoise draws to "blue" --#4
		  Tortoise.setPenColor(Color.blue);
	    //      2. Move the tortoise 50 pixels --#2
		  Tortoise.move(50);
	    //      3. Turn the tortoise to the right (90 degrees) --#3
		  Tortoise.turn(90);
		  
		  }
		  Tortoise.setPenColor(Color.red);
		  Tortoise.move(50);
			  Tortoise.turn(90);
			  Tortoise.move(50);

	  }
	}

