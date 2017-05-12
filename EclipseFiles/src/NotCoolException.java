
public class NotCoolException extends Exception {
	public NotCoolException() {
		super("Please no");
	}

	public NotCoolException(String exception) {
		super(exception);
	}
}
