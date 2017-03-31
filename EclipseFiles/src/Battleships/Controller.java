package Battleships;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controller implements KeyListener {
	Model model;
	View view;
	int keyEnters = 0;
	boolean xChosen = false;

	public Controller(Model model, View view) {
		this.view = view;
		this.model = model;
	}

	public void updateView() {
		view.setXState(model.getX() + "");
		view.setYState(model.getY() + "");
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyChar() == KeyEvent.VK_ENTER && keyEnters > 1) {
			System.out.println("Fired");
			keyEnters = 0;
			view.setXState("-");
			view.setYState("-");
			xChosen = false;
		} else if (xChosen == false) {
			try {
				System.out.println(Integer.parseInt(e.getKeyChar() + ""));
				model.setX(Integer.parseInt(e.getKeyChar() + ""));
				updateView();
				keyEnters++;
				xChosen = true;
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} else {
			try {
				System.out.println(Integer.parseInt(e.getKeyChar() + ""));
				model.setY(Integer.parseInt(e.getKeyChar() + ""));
				updateView();
				keyEnters++;
				xChosen = false;
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}