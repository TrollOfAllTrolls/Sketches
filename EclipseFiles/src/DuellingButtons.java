import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DuellingButtons implements ActionListener {
	
	public static void main(String[] args) {
		new DuellingButtons().createUI();
	}

	JButton leftButton = new JButton();
	JButton rightButton = new JButton();
	
	Dimension BIG = new Dimension(400,400);
	Dimension SMALL = new Dimension(200,200);
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	private void createUI() {
		// 1. Add the panel to the frame
frame.add(panel);
		// 2. Make the frame visible
frame.setVisible(true);
		// 3. Set the text of the leftButton to "Click me!"
leftButton.setText("Click Me!");
leftButton.setPreferredSize(SMALL);
		// 4. Set the text of the rightButton to "Click me!"
rightButton.setText("No, Click Me!");
rightButton.setPreferredSize(BIG);
		// 5. Add an action listener to the leftButton
leftButton.addActionListener(this);
		// 6. Add an action listener to the rightButton
rightButton.addActionListener(this);
		// 7. Add the leftButton to the panel
panel.add(leftButton);
		// 8. Add the rightButton to the panel
panel.add(rightButton);
		// 9. Pack the frame
frame.pack();
		// 10. Set the title of the frame to "Demanding Buttons"
frame.setTitle("Demanding Buttons");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		
		
		/* If the buttonPressed was the leftButton....*/
			// Set the text of the rightButton to "No, click Me!"
		if(buttonPressed==rightButton){
			rightButton.setText("Click Me!");	
			leftButton.setText("No, Click Me!");
			leftButton.setPreferredSize(BIG);
			rightButton.setPreferredSize(SMALL);
		}
		if(buttonPressed==leftButton){
			leftButton.setText("Click Me!");	
			rightButton.setText("No, Click Me!");
			rightButton.setPreferredSize(BIG);
			leftButton.setPreferredSize(SMALL);
		}
			// Set the preferred size of the rightButton to BIG
			// Set the text of the leftButton to "Click Me!"
			// Set the preferred size of the leftButton to SMALL
		
		
		/* If the buttonPressed was the rightButton, do the opposite. */
		

		frame.pack();
	}
}
