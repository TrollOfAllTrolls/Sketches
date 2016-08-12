import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class FindRange {
	public static void main(String[] args) {
		ArrayList<Integer> Numbers = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		int userInput;
		int range;
		do {
			userInput = getUserInput(s);
			if (userInput != 0) {
				Numbers.add(userInput);
			}
		} while (userInput != 0);
		range = FindMax(Numbers) - FindMin(Numbers);
		System.out.println("Numbers you typed: " + Numbers);
		System.out.println("The lowest number that you typed was " + FindMin(Numbers) + ".");
		System.out.println("The largest number that you typed was " + FindMax(Numbers) + ".");
		System.out.println("The range of the numbers that you typed is " + range + ".");
	}

	public static int getUserInput(Scanner s) {
		int userInput;
		while (true) {
			try {
				System.out.println("Please input a number. Type 0 to end the program and get your results.");
				s = new Scanner(System.in);
				userInput = s.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("The char that you input is invalid. Please type a proper number.");
			}
		}

		return userInput;

	}

	static int FindMin(ArrayList<Integer> input) {
		int lowNum = 999999999;
		int currentNum;
		for (int o : input) {
			currentNum = o;
			if (currentNum < lowNum) {
				lowNum = currentNum;
			}
		}
		return lowNum;
	}

	static int FindMax(ArrayList<Integer> input) {
		int highNum = -999999999;
		int currentNum;
		for (int o : input) {
			currentNum = o;
			if (currentNum > highNum) {
				highNum = currentNum;
			}
		}
		return highNum;
	}
}
