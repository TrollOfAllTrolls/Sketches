import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String one = JOptionPane.showInputDialog("Are You Happy?");
		if (one.equalsIgnoreCase("Yes")) {
			String twoo = JOptionPane
					.showInputDialog("Do You Want To Be Happier?");
			if (twoo.equalsIgnoreCase("Yes")) {
				JOptionPane.showMessageDialog(null, "Get A Girlfriend.");
			} else {
				if (twoo.equalsIgnoreCase("No")) {
					JOptionPane.showMessageDialog(null,
							"Just Keep Doing Whatever You're Doing.");
				}
			}
		} else {
			if (one.equalsIgnoreCase("No")) {
				String two = JOptionPane
						.showInputDialog("Do You Want To Be Happy?");
				if (two.equalsIgnoreCase("Yes")) {
					String three = JOptionPane
							.showInputDialog("Do You Want To Change Something About Yourself?");
					if (three.equalsIgnoreCase("Yes")) {
						JOptionPane.showMessageDialog(null,
								"Change Whatever Is Making You Upset.");
					} else {
						if (three.equalsIgnoreCase("No")) {
							JOptionPane.showMessageDialog(null,
									"You Will Never Be Happy.");
						}
					}
				} else {
					if (two.equalsIgnoreCase("No")) {
						JOptionPane.showMessageDialog(null,
								"Just Keep Being Sad.");
					}
				}
			}

		}
	}
}
