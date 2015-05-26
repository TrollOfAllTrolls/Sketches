
	import java.awt.Component;
	import java.awt.Frame;
	import java.net.MalformedURLException;
	import java.net.URL;

	import javax.swing.Icon;
	import javax.swing.ImageIcon;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;

	public class PhotoQuiz {

		public static void main(String[] args) throws Exception {
			Frame quizWindow = new Frame();
			quizWindow.setVisible(true);

			
			// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select ÒCopy Image URLÓ)
			String Pic = "http://i.imgur.com/3Kf5e.png";
			// 2. create a variable of type "Component" that will hold your image
			Component cd = createImage(Pic);
			// 3. use the "createImage()" method below to initialize your Component
			
			
			// 4. add the image to the quiz window
			quizWindow.add(cd);
			
			// 5. call the pack() method on the quiz window
quizWindow.pack();
			// 6. ask a question that relates to the image
		String Question =	JOptionPane.showInputDialog("Does The Person Look Constapated? Yes or No?");
			// 7. print "CORRECT" if the user gave the right answer
if (Question.equalsIgnoreCase("Yes")) {
	JOptionPane.showMessageDialog(null, "Correct!");
}
			// 8. print "INCORRECT" if the answer is wrong
else{
	JOptionPane.showMessageDialog(null, "Wrong! He Is Constapated!");
}
			// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(cd);
			// 10. find another image and create it
quizWindow.add(createImage("http://t4.rbxcdn.com/5defe80f45c619be912590e97477ca1c"));
		

			// 11. add the second image to the quiz window
		
			// 12. pack the quiz window
quizWindow.pack();

			// 13. ask another question
String Question2 = JOptionPane.showInputDialog("How Does This Person feel? Very Happy, Happy, In Shock, Excited, Or Very Excited?");
			// 14+ check answer, say if correct or incorrect, etc.
if (Question2.equalsIgnoreCase("Very Excited")) {
	JOptionPane.showMessageDialog(null, "Correct!");
}

else{
	JOptionPane.showMessageDialog(null, "Wrong! He Is Very Excited!");
}
}
		private static Component createImage(String imageUrl) throws MalformedURLException {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			return imageLabel;
		}
	}




