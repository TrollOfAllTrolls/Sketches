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

	public void updateXView() {
		view.setXState(model.getX() + "");
	}

	public void updateYView() {
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
			if (model.fire(model.getX(), model.getY()) == true) {
				view.sinkShip(model.getX(), model.getY());
			} else {
				view.markSpot(model.getX(), model.getY());
			}
		} else if (xChosen == false) {
			try {
				System.out.println("X Chosen: " + Integer.parseInt(e.getKeyChar() + ""));
				model.setX(Integer.parseInt(e.getKeyChar() + ""));
				updateXView();
				keyEnters++;
				xChosen = true;
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} else {
			try {
				System.out.println("Y Chosen: " + Integer.parseInt(e.getKeyChar() + ""));
				model.setY(Integer.parseInt(e.getKeyChar() + ""));
				updateYView();
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