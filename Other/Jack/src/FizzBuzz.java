import javax.swing.JOptionPane;

public class FizzBuzz
{
	public static void main(String[] args)
	{
		JOptionPane.showMessageDialog(null, "FizzBuzz Game!");
		for (int L = 1; L < 21; L++)
		{

			if (L == 3 || L == 6 || L == 9 || L == 12 || L == 18)
			{
				JOptionPane.showMessageDialog(null, "Fizz!");
			} else
			{
				if (L == 5 || L == 10 || L == 20)
				{
					JOptionPane.showMessageDialog(null, "Buzz!");
				} else
				{
					if (L == 15)
					{
						JOptionPane.showMessageDialog(null, "FizzBuzz!");
					} else
					{
						JOptionPane.showMessageDialog(null, L);
					}
				}
			}
		}
	}
}
