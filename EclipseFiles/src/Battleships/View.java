package Battleships;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View {
	JFrame mainFrame = new JFrame();
	JPanel shipPanel = new JPanel();
	JPanel firePanel = new JPanel();
	JLabel[][] shipLabels = new JLabel[10][10];
	JButton[][] fireButtons;
}
