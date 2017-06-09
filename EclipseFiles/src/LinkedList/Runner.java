package LinkedList;

public class Runner {
	public static void main(String[] args) {
		ListObj newList = new ListObj();
		newList.add("1");
		newList.add("2");
		newList.add("3");
		System.out.println(newList.get(1));
		newList.remove(1);
		newList.print();
		System.out.println(newList.get(1));
	}
}
