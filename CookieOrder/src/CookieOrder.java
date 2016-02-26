
public class CookieOrder {
	String Variety;
	int numBoxes;

	public CookieOrder(String variety, int numboxes) {
		this.Variety = variety;
		this.numBoxes = numboxes;
	}

	public String getVariety() {
		return Variety;
	}

	public void setVariety(String variety) {
		Variety = variety;
	}

	public int getNumBoxes() {
		return numBoxes;
	}

	public void setNumBoxes(int numBoxes) {
		this.numBoxes = numBoxes;
	}
}
