import java.util.Random;

import javax.swing.JOptionPane;
public class m8b {
	public static void main(String[] args) {
		
	
Random m8bN = new Random();
int m8bN2 = m8bN.nextInt(4);
System.out.println(m8bN2);
String m8bN3 = JOptionPane.showInputDialog("Enter A Yes Or No Question");
if(m8bN2 == 0){
	JOptionPane.showMessageDialog(null, "Yes!");
}
if(m8bN2 == 1){
	JOptionPane.showMessageDialog(null, "No!");
}
if(m8bN2 == 2){
	JOptionPane.showMessageDialog(null, "Maybe");
}
if(m8bN2 == 3){
	JOptionPane.showMessageDialog(null, "Doubt It");
}

}
}
