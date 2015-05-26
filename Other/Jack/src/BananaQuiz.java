import javax.swing.JOptionPane;

public class BananaQuiz {
	public static void main(String[] args) {

		String d = JOptionPane.showInputDialog(null, "Do Ye Like Bananas?");
		if (d.equalsIgnoreCase("Yes")) {
			String C = JOptionPane.showInputDialog(null,
					"What's Yo Favorite Hobby??");
			JOptionPane.showMessageDialog(null, C
					+ " Is Much Better With Bananas!");
		} else {
			JOptionPane
					.showMessageDialog(
							null,
							"YOU ARE CRAZY LIKE CRAZY DAVE!!!(Either Cuz You Dont Like Bananas Or I Cant Understand You.)");
		}

	}
}
