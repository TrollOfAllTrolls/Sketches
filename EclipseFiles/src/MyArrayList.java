
public class MyArrayList {
	int[] array;

	public MyArrayList() {
		array = null;
	}

	public void add(int i) {
		int[] tempArray;

		if (array == null) {
			array = new int[1];
			array[0] = i;
		}

		else {
			tempArray = new int[array.length];

			for (int j = 0; j < array.length; j++) {
				tempArray[j] = array[j];
			}

			array = new int[array.length + 1];

			for (int l = 0; l < tempArray.length; l++) {
				array[l] = tempArray[l];
			}
			array[array.length - 1] = i;
		}

	}

	public int get(int e) {
		return array[e];
	}
}
