import javax.swing.JOptionPane;

public class GuessTheAnimal
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// 1. ask user if it has 4 legs. if yes, it’s a pig if no, it’s a monkey
		// (use JOptionPane.showConfirmDialog)
		JOptionPane
				.showMessageDialog(
						null,
						"This Is A Guessing . Please Just Simply Say Yes or No. Guess Either A Pig, A Cow, A Chicken, A Spider, A Monkey, Or A Snake.");

		if (JOptionPane.showInputDialog(null, "Does It Have Four legs?")
				.equalsIgnoreCase("No"))
		{

			if (JOptionPane.showInputDialog(null, "Does It Have Two legs?")
					.equalsIgnoreCase("No"))
			{
				if (JOptionPane.showInputDialog(null, "Does It Have Six Eyes?")
						.equalsIgnoreCase("Yes"))
				{
					JOptionPane.showMessageDialog(null, "It Must Be A Spider");
					return;
				}
				JOptionPane.showMessageDialog(null, "It Has To Be A Snake!");
				return;
			} else
			{
				JOptionPane.showMessageDialog(null, "It Has To Be A Chicken!");
				return;
			}

		} else
		{
			if (JOptionPane.showInputDialog(null,
					"Does It Have Brown Spots All Over It?").equalsIgnoreCase(
					"Yes"))
			{
				JOptionPane.showMessageDialog(null, "It Must be A Cow!");
				return;
			} else
			{
				if (JOptionPane.showInputDialog(null,
						"Does It Have A Lot Of Hair?").equalsIgnoreCase("yes"))
				{
					JOptionPane.showMessageDialog(null, "It Must Be A Monkey!");
					return;

				} else
				{
					JOptionPane.showMessageDialog(null, "It Must Be A Pig!");
					return;
				}
			}
		}

	}

}
