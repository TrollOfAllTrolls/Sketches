import javax.swing.JOptionPane;

public class SleepyHead
{

	public static void main(String[] args)
	{

		int Day;
		Day = JOptionPane.showConfirmDialog(null, "Is It A Weekend?", "",
				JOptionPane.YES_NO_OPTION);
		if (Day == JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(null, "Good For You! Now Sleep In!");
		}

		if (Day == JOptionPane.NO_OPTION)
		{
			JOptionPane.showMessageDialog(null,
					"Get Up Ya Lazybum! You Have Work To Do!");
		}
		int Holiday;
		Holiday = JOptionPane.showConfirmDialog(null,
				"Is Your Favorite Holiday Christmas?", "",
				JOptionPane.YES_NO_OPTION);
		if (Holiday == JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(null, "You Have A Great Spirit!");
		}

		if (Holiday == JOptionPane.NO_OPTION)
		{
			JOptionPane.showMessageDialog(null,
					"You Are Mean To Jesus Since It's His Birthday!");
		}
		int Dog;
		Dog = JOptionPane
				.showConfirmDialog(null, "Is Your Favorite Animal A Dog?", "",
						JOptionPane.YES_NO_OPTION);
		if (Dog == JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(null, "Dogs Are Awesome!");
		}

		if (Dog == JOptionPane.NO_OPTION)
		{
			JOptionPane.showMessageDialog(null, "You Cat Lovers These Days!");
		}
		int Last;
		Last = JOptionPane.showConfirmDialog(null, "Yes or No?", "",
				JOptionPane.YES_NO_OPTION);
		if (Last == JOptionPane.YES_OPTION)
		{
			JOptionPane
					.showMessageDialog(
							null,
							"You get Hit By A Bus! Then You Get Beat Up By A Bear! Then You Fall Into A Volcano! DON'T ALWAYS SAY YES!!!");
		}

		if (Last == JOptionPane.NO_OPTION)
		{
			JOptionPane
					.showMessageDialog(
							null,
							"You Now Have The Power To Fly! You Are Obsessed With Your Power! You Accidently Fly into The Sun! ALWAYS SAY NO!!!");
		}
	}
}
