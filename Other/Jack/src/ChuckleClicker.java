import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {

	Random RandInt = new Random();
	int Random = 0;
	String Joke = "";
	String PunchLine = "";
	JFrame MainFrame = new JFrame();
	JPanel MainPanel = new JPanel();
	JButton JokeButton = new JButton("Joke");
	JButton PLButton = new JButton("Punch-Line");

	public static void main(String[] args) {
		ChuckleClicker Start = new ChuckleClicker();
		Start.makeButtons();
	}

	public void makeButtons() {
		MainFrame.add(MainPanel);
		MainPanel.add(JokeButton);
		MainPanel.add(PLButton);
		JokeButton.addActionListener(this);
		PLButton.addActionListener(this);
		MainFrame.setVisible(true);
		MainFrame.pack();

	}

	public void actionPerformed(ActionEvent A) {
		if (A.getSource() == JokeButton) {
			Random = RandInt.nextInt(5);
			if (Random == 0) {
				Joke = "What do you call a Priest that becomes a lawyer?";
			}
			if (Random == 1) {
				Joke = "Why did the Walrus go to the Tupperware Store?";
			}
			if (Random == 2) {
				Joke = "When do Ducks Wake Up?";
			}
			if (Random == 3) {
				Joke = "How do you drop an Egg on a Concrete Floor without Cracking it?";
			}
			if (Random == 4) {
				Joke = "Why was the Man putting Grapes on his Ceiling before a Party?";
			}
			JOptionPane.showMessageDialog(null, Joke);
		}
		if (A.getSource() == PLButton) {
			if (Random == 0) {
				PunchLine = "A Father in Law.";
			}
			if (Random == 1) {
				PunchLine = "He wanted to find a Tight Seal!";
			}
			if (Random == 2) {
				PunchLine = "At the Quack of Dawn!";
			}
			if (Random == 3) {
				PunchLine = "It's really Easy, Concrete doesn't crack easily.";
			}
			if (Random == 4) {
				PunchLine = "He was Raisin the Roof!";
			}
			JOptionPane.showMessageDialog(null, PunchLine);
		}
	}
}
