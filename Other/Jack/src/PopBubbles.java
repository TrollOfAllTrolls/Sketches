import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class PopBubbles {
	public static void main(String[] args) {
		ArrayList<Bubble> B = new ArrayList<Bubble>();
		B.add(new Bubble("Billy", 10));
		B.add(new Bubble("Bob", 7));
		B.add(new Bubble("Rambo", 9001));
		for (Bubble x : B) {
			x.pop();
		}

	}
}
