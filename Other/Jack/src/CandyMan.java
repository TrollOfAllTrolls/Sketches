import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CandyMan implements ActionListener {
	int ChantCount = 0;
	JFrame MainFrame = new JFrame();
	JPanel MainPanel = new JPanel();
	JButton CandyButton = new JButton("Chant for the Candy Man!");

	public static void main(String[] args) {
		CandyMan StartUp = new CandyMan();
		StartUp.Start();
	}

	public void Start() {
		MainFrame.add(MainPanel);
		MainPanel.add(CandyButton);
		MainFrame.setVisible(true);
		MainFrame.pack();
		CandyButton.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		ChantCount = ChantCount + 1;
		System.out.println("Candy Man!");
		if (ChantCount == 5) {
			JOptionPane.showMessageDialog(null, "Boo!");
		}
	}
}
