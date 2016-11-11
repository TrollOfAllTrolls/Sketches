import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyImage extends JPanel {
	JFrame mainFrame;

	public MyImage() {
		mainFrame = new JFrame("Image");
		mainFrame.add(this);
		mainFrame.pack();
		mainFrame.setSize(150, 150);
		mainFrame.setVisible(true);
	}

	public void paintComponent(Graphics draw) {
		draw.fillRect(15, 15, 30, 30);
		draw.fillRect(105, 15, 30, 30);
		draw.fillRect(15, 90, 120, 30);
	}

	public static void main(String[] args) {
		MyImage image = new MyImage();
	}
}
