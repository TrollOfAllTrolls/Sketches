import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	int Counter = 0; // counter
	static JPanel MainPanel = new JPanel();
	static JFrame MainFrame = new JFrame();
	static JLabel LetterLabel = new JLabel();
	char currentLetter;

	public static void main(String[] args) {
		new TypingTutor().MainAction();
	}

	public void MainAction() {
		currentLetter = generateRandomLetter();
		LetterLabel.setText("" + currentLetter);
		MainFrame.add(MainPanel);
		MainPanel.add(LetterLabel);
		MainFrame.setVisible(true);
		MainFrame.setSize(200, 200);
		MainFrame.addKeyListener(this);
		LetterLabel.setFont(LetterLabel.getFont().deriveFont(28.0f));
		LetterLabel.setHorizontalAlignment(JLabel.CENTER);

	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyPressed(KeyEvent Event) {
		// TODO Auto-generated method stub
		char LetterPressed = Event.getKeyChar();
		System.out.println("You typed: " + LetterPressed);
		if (LetterPressed == currentLetter) {
			MainFrame.setBackground(Color.green);
		} else {
			MainFrame.setBackground(Color.red);
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		LetterLabel.setText("" + currentLetter);
		Counter = Counter + 1;
		if (Counter > 10) {
			showTypingSpeed(10);

		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
		Date timeAtEnd = new Date();
		long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
		long gameInSeconds = (gameDuration / 1000) % 60;
		double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
		int charactersPerMinute = (int) (charactersPerSecond * 60);
		JOptionPane.showMessageDialog(null, "Your typing speed is "
				+ charactersPerMinute + " characters per minute.");
	}

	Date timeAtStart = new Date();

}
