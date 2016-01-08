import java.util.ArrayList;

public class DuckQuiz {
	public static void main(String[] args) {
		ArrayList<Duck> Duckie = new ArrayList<Duck>();
		Duckie.add(new Duck("Daffy"));
		Duckie.add(new Duck("Waddles"));
		for (Duck duck : Duckie) {
			duck.feed();
		}
	}
}
