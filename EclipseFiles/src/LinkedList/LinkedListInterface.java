package LinkedList;

public interface LinkedListInterface {
	void add(String nodeText);

	void addNode(String nodeText, int nodePlace);

	void print();

	Node remove(int num);

	String get(int num);
}
