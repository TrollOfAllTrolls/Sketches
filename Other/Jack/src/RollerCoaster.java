import javax.swing.JOptionPane;


public class RollerCoaster {
public static void main(String[] args) {
String Lol =	JOptionPane.showInputDialog("How Tall Are You In Inches?");
int integer = Integer.parseInt(Lol);
if (integer > 40) {
	JOptionPane.showMessageDialog(null, "Have Fun!");	
}
else {
	JOptionPane.showMessageDialog(null, "NO RIDE FOR YOU! YOU TOO YOUNG!");
}
}
}