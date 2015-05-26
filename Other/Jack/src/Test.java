import javax.swing.JOptionPane;

/**
 * Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your
 * friends can read it.
 * 
 * Toolbox: String variables, main() method, JOptionPane.showInputDialog,
 * JOptionPane.showMessageDialog, String.equals, if statement
 */

public class Test
{
	public static void main(String[] args)
	{

		String Pwd = JOptionPane.showInputDialog(null,
				"Give Me A Password Plz!");
		String Msg = JOptionPane
				.showInputDialog(null, "Give Me A Message Plz!");
		if (JOptionPane.showInputDialog(null, "Retype The Password Plz!")
				.equals(Pwd))
		{
			JOptionPane.showMessageDialog(null, Msg);

		}
	}

}
