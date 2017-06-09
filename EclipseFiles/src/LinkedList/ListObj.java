package LinkedList;

public class ListObj implements LinkedListInterface {
	Node first = new Node();
	int Size = 1;

	public void add(String nodeText) {
		Node placeholder = first;

		if (first.getData() == null) {
			first.setData(nodeText);
		} else {
			Node newNode = new Node();
			newNode.setData(nodeText);

			while (placeholder.getNext() != null) {
				placeholder = placeholder.getNext();
			}

			placeholder.setNext(newNode);

		}

		Size++;
	}

	public void addNode(String nodeText, int nodePlace) {
		Node placeholder = first;

		if (nodePlace == 0) {

		}
	}

	public void print() {
		Node placeholder = first;
		String finalText = "";
		finalText += "[" + placeholder.getData() + "]";

		while (placeholder.getNext() != null) {
			placeholder = placeholder.getNext();
			finalText += " -> [" + placeholder.getData() + "]";
		}

		System.out.println(finalText);
	}

	public Node remove(int num) {
		Node removedNode = null;

		if (Size >= 1 && num <= Size - 1) {
			Node placeholder = first;
			Node placeholder2 = null;
			Node placeholder3 = null;
			int place = 0;

			if (num == 0) {
				first = null;
				Size = 0;
			} else {
				while (place < num) {
					place++;
					placeholder2 = placeholder;
					placeholder = placeholder.getNext();
				}
				if (placeholder.getNext() != null) {
					placeholder3 = placeholder.getNext();
				}

				placeholder2.setNext(placeholder3);
				Size--;
			}
		}

		return removedNode;
	}

	public String get(int num) {
		String finalText = null;
		int place = 0;

		if (num <= Size - 1) {
			Node placeholder = first;

			while (place < num) {
				place++;
				placeholder = placeholder.getNext();
			}

			finalText = "[" + placeholder.getData() + "]";
		}

		return finalText;
	}

}
