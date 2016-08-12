
public class FibonacciSequence {

	public static void main(String[] args) {
		long currentNum = 0;
		long previousNum = 0;
		long totalNum = 1;
		for (int i = 0; i < 50; i++) {
			previousNum = currentNum;
			currentNum = totalNum;
			System.out.println(previousNum + " and " + currentNum);
			totalNum = currentNum + previousNum;
		}
	}
}
