package Battleships;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View {
	JFrame mainFrame = new JFrame();
	JPanel gamePanel = new JPanel();
	JPanel playerPanel = new JPanel();
	JPanel enemyPanel = new JPanel();
	JLabel[][] playerLabels = new JLabel[10][10];
	JLabel[][] enemyLabels = new JLabel[10][10];

	public View() {
		mainFrame.add(gamePanel);
		gamePanel.add(playerPanel);
		playerPanel.setLayout(new GridLayout(10, 10));
		gamePanel.add(enemyPanel);
		enemyPanel.setLayout(new GridLayout(10, 10));
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				playerLabels[i][j] = new JLabel("hi");
				playerPanel.add(playerLabels[i][j]);
				enemyLabels[i][j] = new JLabel("hello");
				enemyPanel.add(enemyLabels[i][j]);
			}
		}
		mainFrame.setVisible(true);
	}

	public void addListener(Controller control) {
		playerPanel.addMouseListener(control);
	}
}