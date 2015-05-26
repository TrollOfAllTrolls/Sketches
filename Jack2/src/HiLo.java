import java.util.Random;

import javax.swing.JOptionPane;

public class HiLo {
	public static void main(String[] args) {

		String Hi = JOptionPane
				.showInputDialog("Guess A Number, 1 Through 50!");
		int RNR = new Random().nextInt(50);
		for (int i = 0; i < 10; i++) {
			int lol = Integer.parseInt(Hi);
			if (lol == (RNR)) {
				JOptionPane.showMessageDialog(null,
						"You Got The Number! It Was " + RNR + "!");
				System.exit(1);
			}

			if (lol < (RNR)) {
				Hi = JOptionPane.showInputDialog("Higher!");
			}

			if (lol > (RNR)) {
				Hi = JOptionPane.showInputDialog("Lower!");
			}

		}
	}
}
