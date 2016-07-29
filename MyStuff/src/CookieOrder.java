
public class CookieOrder {
	String variety;
	int numBoxes;

	public CookieOrder(String Variety, int NumBoxes) {
		variety = Variety;
		numBoxes = NumBoxes;
	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	public int getNumBoxes() {
		return numBoxes;
	}

	public void setNumBoxes(int numBoxes) {
		this.numBoxes = numBoxes;
	}
}
