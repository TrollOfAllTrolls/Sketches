import java.net.URL;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class ABCencrypt {
	
	public static void main(String[] args) {
		/* Your mission: use the tryCode method to crack the safe by trying all possible combinations of letters*/

		//1. Create a string with letters a-z called "characters"
String Characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 ./_-=+";
String Password = "";
String Check = "";
		//for{
	//3. create a random integer between 0 and 25
	
	//2. Use a for loop to print each letter at a time
for (int i = 0; i < 6; i++) {
//4. print 4 random letters
	double index = Math.random() * 68;
//5. create a secret code 4 letters long 
	Password = Password+Characters.charAt(((int)index));
		}
		//6. Create a loop to print every combination of letters
for(int j = 0; j < 68; j++){
	for(int k = 0; k < 68; k++){
		for(int l = 0; l < 68; l++){
			for(int m = 0; m < 68; m++){
				for(int n = 0; n < 68; n++){
					for(int o = 0; o < 68; o++){
						Check = "";
						Check = Check + Characters.charAt(((int)j))+Characters.charAt(((int)k))+Characters.charAt(((int)l))+Characters.charAt(((int)m))+Characters.charAt(((int)n))+Characters.charAt(((int)o));
						System.out.println(Check);
						if(Check.equals(Password)){
							System.out.println("Password Found! Password: "+Password);
							System.exit(1);
						}	
					}
				}
					
			}
		}
	}
}
	
//System.out.println("Password Found! Password: "+Password);
		//7. Store these combinations into a string and test to the secret code
		//8. If a match is found display a message with the final code
	}
}

