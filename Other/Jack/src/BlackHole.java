import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;


public class BlackHole {


	    public static void main(String[] args) {
	    	Tortoise.show();
	   	 // TODO Set Tortoise speed to 10
	   	 Tortoise.setSpeed(10);
	   	 // TODO Set pen color to black
	   	 Tortoise.setPenColor(Colors.Grays.Black);
	   	 // TODO Set pen width to 5
	   	 Tortoise.setPenWidth(5);
	   	 // TODO Call method drawHole()
	   	 drawHole();
	    }
	    
	    // TODO Complete drawHole()
	    public static void drawHole() {
	   	 // TODO Do the following 360 times:
	   	 for (int i = 0; i < 361; i++) {
			
		
	   	 // TODO Call circle with the length 0.5
	   	 circle(0.5);
	   	 // TODO Move the tortoise i
	   	 Tortoise.move(i);
	   	 // TODO Turn the tortoise 46 degrees
	   	 Tortoise.turn(46);
	   	 }
	    }
	    
	    
	    /**
	     * @param lengthOfSide is the length of side
	     */
	    public static void circle(double lengthOfSide){
	   	 // TODO Do the following 360 times
	   	 for (int i = 0; i < 361; i++) {
			
		
	   	 // TODO Move the tortoise lengthOfSide
	   	 Tortoise.move(lengthOfSide);
	   	 // TODO Turn the tortoise the smallest amount
	   	 Tortoise.turn(0.5);
	   	 }
	    }

	}



