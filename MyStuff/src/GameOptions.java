import java.util.HashMap;

public class GameOptions {
	static HashMap<String, String> options = new HashMap<String, String>();

	public static void addOption(String Option, String Value) {
		options.put(Option, Value);
	}

	public String getOption(String Option) {
		return options.get(Option);
	}

	public static void main(String[] args) {
		addOption("Cole", "CS:GO");
		addOption("Shiva", "No Man's Sky");
		addOption("DJ", "Stuff");
		System.out.println(options.get("Shiva").equals("No Man's Sky"));
	}
}