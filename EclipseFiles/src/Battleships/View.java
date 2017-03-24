package Battleships;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View {
	JFrame mainFrame = new JFrame("Battleships");
	JPanel gamePanel = new JPanel();
	JPanel playerPanel = new JPanel();
	JPanel enemyPanel = new JPanel();
	JPanel controlPanel = new JPanel();
	JLabel[][] playerLabels = new JLabel[10][10];
	JLabel[][] enemyLabels = new JLabel[10][10];
	JLabel xLabel = new JLabel("    X: ");
	JLabel xState = new JLabel("-");
	JLabel yLabel = new JLabel("    Y: ");
	JLabel yState = new JLabel("-");

	public View() {
		mainFrame.add(gamePanel);
		gamePanel.add(playerPanel);
		playerPanel.setLayout(new GridLayout(10, 10));
		gamePanel.add(enemyPanel);
		enemyPanel.setLayout(new GridLayout(10, 10));
		gamePanel.add(controlPanel);
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				playerLabels[i][j] = new JLabel(" □ ");
				playerLabels[i][j].setOpaque(true);
				playerLabels[i][j].setBackground(Color.cyan);
				playerPanel.add(playerLabels[i][j]);
				enemyLabels[i][j] = new JLabel(" □ ");
				enemyLabels[i][j].setOpaque(true);
				enemyLabels[i][j].setBackground(Color.cyan);
				enemyPanel.add(enemyLabels[i][j]);
			}
		}
		controlPanel.add(xLabel);
		controlPanel.add(xState);
		controlPanel.add(yLabel);
		controlPanel.add(yState);
		mainFrame.setLayout(new GridLayout(2, 1));
		mainFrame.setSize(320, 400);
		mainFrame.setVisible(true);
	}

	public void addListener(Controller control) {
		playerPanel.addKeyListener(control);
	}
}