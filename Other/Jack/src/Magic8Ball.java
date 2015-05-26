import java.util.Random;

import javax.swing.JOptionPane;


public class Magic8Ball {
public static void main(String[] args) {
	JOptionPane.showInputDialog("What Yes Or No Question Do You Have To Ask?");
	int number = new Random().nextInt(4);
	if(number==(0))
	{
		JOptionPane.showMessageDialog(null, "Nawwwwwwwww. That's A Big Fat No!");
	}
	if(number==(1))
	{
		JOptionPane.showMessageDialog(null, "Eh, Thats A Medium.");
	}
	if(number==(2))
	{
		JOptionPane.showMessageDialog(null, "Totally! It Is A Big Fat Yes!");
	}
	if(number==(4))
	{
		JOptionPane.showMessageDialog(null, "Ummmmmmmmmm, I Don't Know.");
	}
	}
}

