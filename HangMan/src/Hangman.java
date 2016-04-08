import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Hangman implements KeyListener {
	Stack<String> puzzles = new Stack<String>();
	JFrame MainFrame = new JFrame("Hangman");
	JPanel MainPanel = new JPanel();
	ArrayList<JLabel> JLabels = new ArrayList<JLabel>();
	String currentWord;
	int lettersCorrect;

	public Hangman() {
		createUI();
		createPuzzles();
		String Popped = puzzles.pop();
		playPuzzle(Popped);
	}

	private void createUI() {
		MainFrame.addKeyListener(this);
		MainFrame.add(MainPanel);
		MainFrame.setVisible(true);
		MainFrame.setSize(300, 50);
	}

	private void createPuzzles() {
		puzzles.push("pineapple");
		puzzles.push("carrot");
		puzzles.push("apple");
		puzzles.push("banana");
		puzzles.push("blueberry");

	}

	public static void main(String[] args) {
		new Hangman();
	}

	private void playPuzzle(String word) {
		currentWord = word;
		lettersCorrect = 0;
		for (int i = 0; i < word.length(); i++) {
			JLabel Labeler = new JLabel();
			MainPanel.add(Labeler);
			Labeler.setText("_");
			JLabels.add(Labeler);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		char typed = e.getKeyChar();
		for (int i = 0; i < currentWord.length(); i++) {
			if (typed == currentWord.charAt(i)) {
				if (JLabels.get(i).equals("_")) {

					lettersCorrect = lettersCorrect + 1;
				}
			}
			if (lettersCorrect == currentWord.length()) {
				if (typed == '\n') {
					MainFrame.remove(MainPanel);
					MainPanel = new JPanel();
					MainFrame.add(MainPanel);
					JLabels.forEach(l -> MainPanel.remove(l));
					currentWord = puzzles.pop();
					playPuzzle(currentWord);
					lettersCorrect = 0;
				}

			}
		}

		for (int i = 0; i < currentWord.length(); i++) {
			if (currentWord.charAt(i) == typed) {
				JLabels.get(i).setText("" + typed + "");
			}

		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// Do not need this
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}
}
