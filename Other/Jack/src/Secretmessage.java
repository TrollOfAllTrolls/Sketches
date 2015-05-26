import javax.swing.JOptionPane;

public class Secretmessage
{
	public static void main(String[] args)
	{

		String Password = JOptionPane.showInputDialog("Password");
		String Message = JOptionPane.showInputDialog("Message");
		for (int i = 0; i < 10000; i++)
		{
			String RetypePassword = JOptionPane
					.showInputDialog("Retype Password");
			if (Password.equals(RetypePassword))
			{
				JOptionPane.showMessageDialog(null, Message);
				break;
			}

			else
			{
				JOptionPane.showMessageDialog(null, "Wrong Answer!");
			}
		}
	}

}
