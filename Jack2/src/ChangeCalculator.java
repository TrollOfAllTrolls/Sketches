import javax.swing.JOptionPane;

public class ChangeCalculator {

	public static void main(String[] args) {
		double A = 0;
		double B = 0;
		int Nickelstwo = 0;
		int Dimestwo = 0;
		double totalMoney = 0;
		int Quarterstwo = 0;
		// Ask the user how many nickels they have
		String Nickels = JOptionPane
				.showInputDialog("Yo Yo Yo, Wasup Man, My Name Is Cc (Bad Name, Isn't It). So Tell Me, Person Of The World, How Many Nickels You Go, Hrm?");
		// Convert their answer to an int using Integer.parseInt()
		Nickelstwo = Integer.parseInt(Nickels);
		// Ask the user how many dimes they have, and convert their answer
		String Dimes = JOptionPane
				.showInputDialog("Yo Yo Yo, I'm Back, Person Of The World!!! Got Another Question For Ya. How Many Dimes You Got, Hrm?");
		Dimestwo = Integer.parseInt(Dimes);
		// Ask the user how many quarters they have, and convert their answer
		String Quarters = JOptionPane
				.showInputDialog("Yo Man, I Got One More Question For Ya, Mk? Good! How Many Quarters You Got Hrm?");
		Quarterstwo = Integer.parseInt(Quarters);
		// Calculate how much money the user has and save it in a variable
		// called "totalMoney"
		Nickelstwo = Nickelstwo * 5;
		Dimestwo = Dimestwo * 10;
		Quarterstwo = Quarterstwo * 25;
		totalMoney = totalMoney + Nickelstwo + Dimestwo + Quarterstwo;
		totalMoney = totalMoney * .01;
		A = A + totalMoney;
		B = B + A;
		A = (Math.floor(A));
		B = B - A;
		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, "You Have " + A
				+ " Dollars And " + B + " Cents.");

	}
}
