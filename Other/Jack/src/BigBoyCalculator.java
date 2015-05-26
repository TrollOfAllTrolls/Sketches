import javax.swing.JOptionPane;


public class BigBoyCalculator {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Welcome To The Nerdulator 5000!");
String Answer =	JOptionPane.showInputDialog("For Radius Converted into Circumference, Type A. For Square Root, Type B.") ;
	if(Answer.equalsIgnoreCase("A"))
	{

String RadiusasString	=	JOptionPane.showInputDialog("Type In The Radius In Number Form");
int Radiusasint = Integer.parseInt(RadiusasString);
int C = 2*22/7*Radiusasint;
JOptionPane.showMessageDialog(null, "The Circumference is "+ C);
	}
	else
	{
		if (Answer.equalsIgnoreCase("B")) 
		{
			String NumberasString	=	JOptionPane.showInputDialog("Type In The Radius In Number Form");
			int NumberasInt = Integer.parseInt(NumberasString);
			Double L = Math.sqrt(NumberasInt);
			JOptionPane.showMessageDialog(null, "The Square Root of "+ NumberasInt 
					+" is "+ L);
		}
		
	}
		
	    
}
}
