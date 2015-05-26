import javax.swing.JOptionPane;


public class MedianFinder {
public static void main(String[] args) {
	String Question1 = JOptionPane.showInputDialog("How many numbers do you want to be included into the equasion?");
	double NumberAmount = Double.parseDouble(Question1);
	double FAN = 0;
	for (double i = 1; i < NumberAmount+1; i++) {
		String AddedNumbers = JOptionPane.showInputDialog("What number would you like to add to the equasion?");
		double AddedNumbers1 = Double.parseDouble(AddedNumbers);
		FAN = FAN + AddedNumbers1;
	}
	double FinalAnswer = FAN/NumberAmount;
	JOptionPane.showMessageDialog(null, "The Median is "+FinalAnswer);
}
}
