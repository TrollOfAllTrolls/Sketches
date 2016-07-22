import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball{

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args){
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int RandomNumber = new Random().nextInt(3);
	// 3. Print out this variable
System.out.println(RandomNumber);
	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog(null, "Ask a yes or no question.");
	// 5. If the random number is 0
if(RandomNumber == 0){
	// -- tell the user "Yes"
JOptionPane.showMessageDialog(null,"Yes");
}
else if(RandomNumber == 1){
	// 6. If the random number is 1

	// -- tell the user "No"
JOptionPane.showMessageDialog(null,"No");
}
else if(RandomNumber == 2){
	// 7. If the random number is 2

	// -- tell the user "Maybe?"
JOptionPane.showMessageDialog(null,"Possibly");
}
else if(RandomNumber == 3){
	// 8. If the random number is 3
JOptionPane.showMessageDialog(null,"Doubt it");
}
	// -- write your own answer
}
}

