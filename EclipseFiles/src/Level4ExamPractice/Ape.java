package Level4ExamPractice;

public abstract class Ape {
	public void eat(Ape ape) {
		ape.speak("Hi");
	}
	
	public void speak(String sentence) {
		System.out.println("Said, '" + sentence);
	}
	
}
