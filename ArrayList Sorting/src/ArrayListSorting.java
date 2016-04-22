import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSorting {
	public static void main(String[] args) {
		Integer[] a = { 3480, 84, 243, 76, 679, 2 };
		List<Integer> myArray = Arrays.asList(a);
		System.out.println(sort(myArray));
	}

	private static List sort(List<Integer> myArray) {
		List<Integer> sortedArray = new ArrayList<Integer>();
		for (int d : myArray) {
			sortedArray.add(findMin(myArray));
		}
		return sortedArray;
	}

	private static int findMin(List<Integer> myArray) {
		int minimum = 999999999;
		for (int c : myArray) {
			if (c < minimum) {
				minimum = c;
			}
		}
		myArray.set(myArray.indexOf(minimum), 999999999);
		return minimum;
	}

	private static void swapSort(List<Integer> list, int indexOne, int indexTwo) {
		int nOne = list.get(indexOne);
		int nTwo = list.get(indexTwo);
		list.set(indexOne, nTwo);
		list.set(indexTwo, nOne);
	}
}
