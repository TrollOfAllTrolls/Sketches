
public class Bubble {
	String name;
	int size;

	public Bubble(String Name, int Size) {
		size = Size;
		name = Name;
	}

	public void pop() {
		System.out.println(name + " has been Popped!");
	}
}
