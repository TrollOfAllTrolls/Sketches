import java.util.HashMap;
import java.util.Stack;

public class MoreTestPractice {
	public static void main(String[] args) {
		HashMap<String, String> index = new HashMap<String, String>();

		index.put("sdog2000", "$526,523");
		index.put("friedfool1980", "$2,435,423,453");

		for (String s : index.keySet()) {
			System.out.println("Password:[" + s + "] Value:[" + index.get(s) + "]");
		}

		Stack<String> stackOfStrings = new Stack<String>();

		stackOfStrings.add("e");
		stackOfStrings.add("i");
		stackOfStrings.add("P");

		int initialStackSize = stackOfStrings.size();

		for (int i = 0; i < initialStackSize; i++) {
			System.out.print(stackOfStrings.pop());
		}
	}
}
