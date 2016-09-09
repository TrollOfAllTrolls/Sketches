import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BasicTextEditor implements KeyListener {
	JFrame MainFrame = new JFrame("Text Editor");
	JPanel MainPanel = new JPanel();
	JLabel TextLabel = new JLabel();
	String EditorText = "";
	Stack<Character> DeletedChar = new Stack<Character>();

	public static void main(String[] args) {
		BasicTextEditor codeRun = new BasicTextEditor();
		codeRun.run();

	}

	public void run() {
		MainFrame.addKeyListener(this);
		MainFrame.add(MainPanel);
		MainPanel.add(TextLabel);
		MainFrame.setVisible(true);
		MainFrame.setSize(500, 250);

	}

	@Override
	public void keyTyped(KeyEvent e) {
		if (e.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
			if (EditorText.length() > 0) {
				DeletedChar.push(EditorText.charAt(EditorText.length() - 1));
				EditorText = EditorText.substring(0, EditorText.length() - 1);
				TextLabel.setText(EditorText);
			}
		} else if (e.getKeyChar() == KeyEvent.VK_ENTER) {
			if (DeletedChar.size() > 0) {
				EditorText += DeletedChar.pop();
				TextLabel.setText(EditorText);
			}
		} else {
			EditorText += e.getKeyChar();
			TextLabel.setText(EditorText);
		}

	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}
}
