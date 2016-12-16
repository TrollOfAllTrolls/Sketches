
public class Patient {
	boolean caredFor = false;
	boolean alive = true;

	public Patient() {

	}

	public void checkPulse() {
		caredFor = true;
	}

	public boolean feelsCaredFor() {
		return caredFor;
	}

	public void kill() {
		alive = false;
	}

	public boolean isAlive() {
		return alive;
	}
}
