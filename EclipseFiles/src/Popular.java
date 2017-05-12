import java.util.Scanner;

public class Popular {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Popular pop = new Popular();
		pop.hipThings(scan.nextLine());
	}

	public void hipThings(String item) {
		if (item.equalsIgnoreCase("Spinner") || item.equalsIgnoreCase("Spinners")) {
			try {
				throw new NotCoolException();
			} catch (NotCoolException e) {
				e.printStackTrace();
			}
		}
		if (item.equalsIgnoreCase("Vine")) {
			try {
				throw new OutOfStyleException();
			} catch (OutOfStyleException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("I applaud your capability to input tolerable content into the console.");
		}

	}
}
