import java.util.Random;

import javax.swing.JOptionPane;

public class HighLow
{

	public static void main(String[] args)
	{
		// 2. Randomly select a number between 1 - 100. Print it out to test.
		int points = 0;

		// 10. do the following 10 times
		for (int i = 1; i == 5; i++)
		{
			Random rand = new Random();
			int Number = rand.nextInt(10);

			// 1. ask for a guess using a pop-up window , and save it
			String N = JOptionPane.showInputDialog(null,
					"Guess A Number Between 1 And 5.");
			// 3. convert the usersÕ answer to an int
			int guess = Integer.parseInt(N);

			// 4. if the guess is correct
			if (guess == Number)
			{
				points++;
				JOptionPane.showMessageDialog(null, "You Guessed Correctly!");

			}
			// 5. win
			// 6. if the guess is high
			if (guess > Number)
			{
				JOptionPane.showMessageDialog(null, "You Guessed Too High!");
			}
			// 7. tell them it's too high
			// 8. if the guess is low
			if (guess < Number)
			{
				JOptionPane.showMessageDialog(null, "You Guessed Too Low!");
			}
			// 9. tell them it's too low
			JOptionPane.showMessageDialog(null, "You Have " + points
					+ " Points!");
			// 11. lose
		}

	}
}
