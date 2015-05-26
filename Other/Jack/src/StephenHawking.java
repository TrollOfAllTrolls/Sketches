import java.io.IOException;

import javax.swing.JOptionPane;

public class StephenHawking 



{
	 static void speak(String words) {
	   	 try {
	   		 Runtime.getRuntime().exec("say " + words);
	   	 } catch (IOException e) {
	   		 e.printStackTrace();
	   	 }
	    }
	 
	 
	 
public static void main(String[] args) {
	for (int i = 0; i < 10; i++) {
		
	
  String words = JOptionPane.showInputDialog("Talk");
  speak(words);

	}

}
}

