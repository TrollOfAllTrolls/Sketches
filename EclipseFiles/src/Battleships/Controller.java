package Battleships;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controller implements KeyListener {
	Model model;
	View view;
	boolean xChosen = false;

	public Controller(Model model, View view) {
		this.view = view;
		this.model = model;
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (xChosen == false) {
			try {
				Integer.parseInt(e.getKeyChar() + "");
			} catch (Exception e2) {

			}

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}