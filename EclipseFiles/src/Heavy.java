import java.io.IOException;

import javax.swing.JOptionPane;

public class Heavy {
	int health;
	String name;
	String chatdialog;

	Heavy(String name, int health) {
		this.health = health;
		this.name = name;
	}

	void Move(int movelength) {
		System.out.println("*Moves " + movelength + " steps*");
	}

	void Chat(String chatdialog) {

		try {
			Runtime.getRuntime().exec("say " + chatdialog);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
