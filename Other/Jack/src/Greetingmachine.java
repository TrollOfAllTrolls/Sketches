import javax.swing.JOptionPane;
public class Greetingmachine {
public static void main(String[] args) {
	String Name = JOptionPane.showInputDialog("What Is Your name?");
	JOptionPane.showMessageDialog(null, "Hi "+Name+"!");
}
}
