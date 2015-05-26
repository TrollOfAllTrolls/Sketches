import javax.swing.JOptionPane;

public class OwnAdventure {

	public static void main(String[] args) {

		// 1. ask user if they want a red, blue or green pill using a pop-up
		// window , and save it
		String a = JOptionPane
				.showInputDialog("Do You Want A Red Pill, Green Pill, Or Blue Pill?");
		// 2. Store the answer in a string

		// 3. Write an if/else block for this, tell a story, be creative!
		if (a.equalsIgnoreCase("red")) {
			JOptionPane
					.showMessageDialog(null,
							"You Will Learn All of God's Secrets. Then You Wake Up In A Ditch!");
		} else if (a.equalsIgnoreCase("blue")) {
			JOptionPane
					.showMessageDialog(
							null,
							"You Will Wake Up In A Magical Land Where Anything Can Happen And Everone Will Follow Your Commands!");
		} else if (a.equalsIgnoreCase("green")) {
			JOptionPane
					.showMessageDialog(null,
							"You Will Be Hated By Everyone! You Are A Poor Man That Lives On The Street");
		} else {
			JOptionPane
					.showMessageDialog(null,
							"Sorry You Answered Wrong, So You Shall Die Now!Good Day Sir!");
		}
	}

}
