import javax.swing.JOptionPane;

public class AutomatedPhoneService
{
	public static void main(String[] args)
	{
		// 1. Use JOptionPane.showInputDialog, Set the value to String
		String a = JOptionPane
				.showInputDialog(
						null,
						"Welcome to Wintriss Banks. �For account information, enter �1�. �To speak to a representative, enter �0�.");
		// 2. Use an if/else statement to check
		if (a.matches("1"))
		{
			String b = JOptionPane
					.showInputDialog(
							null,
							"Please listen carefully to the following menu options: To hear your account balance, press �1�. �To hear a list of recent transactions, press �2�. �To change your account password, press �3�. �To speak to a representative, press �0�.");

			if (b.matches("1"))
			{
				JOptionPane.showMessageDialog(null,
						"Your current balance is $1,300.52");
			}
			if (b.matches("2"))
			{
				JOptionPane.showMessageDialog(null,
						"There have been no transactions in the last 7 days.");
			}
			if (b.matches("3"))
			{
				JOptionPane
						.showMessageDialog(null,
								"Please enter your new password.  It must be at least 4 characters longs.");
			}
			if (a.matches("0"))
			{
				JOptionPane
						.showMessageDialog(
								null,
								"Please stay on the line.  I will connect you to a customer service representative.");
			}
			if (b.matches("0"))
			{
				JOptionPane
						.showMessageDialog(
								null,
								"Please stay on the line.  I will connect you to a customer service representative.");

			}
		}
	}
}
