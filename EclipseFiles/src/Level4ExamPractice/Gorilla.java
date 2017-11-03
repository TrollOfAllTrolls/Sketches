package Level4ExamPractice;

public class Gorilla extends Ape {
	public Gorilla() {

	}

	public static void main(String[] args) {
		Gorilla monkey = new Gorilla();
		monkey.eat("food", monkey);
	}

	public void eat(String food, Ape monkey) {
		System.out.println("Nom nom om nom (" + food + ")");
		super.eat(monkey);
	}

	public void speak(String sentence) {
		System.out.println("Hooga Booga (" + sentence + ")");
	}
}
