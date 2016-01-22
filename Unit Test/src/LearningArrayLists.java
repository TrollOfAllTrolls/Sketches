import java.util.ArrayList;

public class LearningArrayLists {

	public static Object createArrayList() {
		ArrayList<String> Thing = new ArrayList<String>();
		return Thing;
	}

	public static void addToArrayList(ArrayList testList, String string) {
		testList.add(string);
	}

	public static Object getNumberOfItems(ArrayList testList) {

		return testList.size();
	}

	public static Object getItem(ArrayList testList, int i) {

		return testList.get(i);
	}

	public static String iterateOver(ArrayList testList) {
		String result = "";
		for (Object s : testList) {
			result = result + (String) s;
		}
		return result;
	}

	public static Object findItemOnList(ArrayList testList, String string) {

		return testList.indexOf(string);
	}

	public static void replaceItem(ArrayList testList, int i, String string) {
		testList.set(i, string);
	}

	public static void insertItem(ArrayList testList, int i, String string) {
		testList.add(i, string);
	}

	public static ArrayList<Integer> createTypedArrayList() {

		return new ArrayList<Integer>();
	}

	public static Object addAllInteger(ArrayList<Integer> testList) {
		int result = 0;
		for (Object s : testList) {
			result = result + (int) s;
		}
		return result;
	}

	public static ArrayList<String> createStringTypedArrayList() {

		return new ArrayList<String>();
	}

	public static String addAllString(ArrayList<String> testList) {
		String result = "";
		for (Object s : testList) {
			result = result + (String) s;
		}
		return result;
	}

}
