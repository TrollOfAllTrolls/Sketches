package LinkedList;

public class ListObj implements LinkedListInterface {
	Node first;

	public void add(Node node) {
		Node placeholder;
		if (first == null) {
			first = node;
			placeholder = node;
		} else {
			placeholder = node;
			while (placeholder.getNext() != null) {
				placeholder = placeholder.getNext();
			}
		}
	}

	public void print() {

	}

	public Node remove(int num) {
		Node removedNode = null;
		Node placeholder = first;
		Node placeholder2 = null;
		int place = 0;
		if (num == 0) {
			first = null;
		} else {
			while (place < num) {
				place++;
				placeholder = placeholder.getNext();
			}
			
		}
		return removedNode;
	}

	public Node get(int num) {
		return null;
	}

}
