import javax.swing.*;

import java.awt.event.*;

public class WhackAMole implements ActionListener {
	JFrame MainFrame = new JFrame();
	JPanel MainPanel = new JPanel();

	JButton B1 = new JButton();
	JButton B2 = new JButton();
	JButton B3 = new JButton();
	JButton B4 = new JButton();
	JButton B5 = new JButton();
	JButton B6 = new JButton();
	JButton B7 = new JButton();
	JButton B8 = new JButton();
	JButton B9 = new JButton();

	public static void main(String[] args) {
		WhackAMole StartUp = new WhackAMole();
		StartUp.Start();
	}

	public void Start() {
		MainFrame.add(MainPanel);
		MainPanel.add(B1);
		MainPanel.add(B2);
		MainPanel.add(B3);
		MainPanel.add(B4);
		MainPanel.add(B5);
		MainPanel.add(B6);
		MainPanel.add(B7);
		MainPanel.add(B8);
		MainPanel.add(B9);

		B1.addActionListener(this);
		B2.addActionListener(this);
		B3.addActionListener(this);
		B4.addActionListener(this);
		B5.addActionListener(this);
		B6.addActionListener(this);
		B7.addActionListener(this);
		B8.addActionListener(this);
		B9.addActionListener(this);

		MainFrame.setVisible(true);
		MainFrame.setSize(250, 130);
	}

	public void actionPerformed(ActionEvent arg0) {

	}
}
