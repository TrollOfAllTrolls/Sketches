
public class MyArrayList<obj> {
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

	public int remove(int place) {
		int[] tempArray;
		int removed = 0;
		int rD = 0;

		if (array != null) {
			tempArray = new int[array.length - 1];

			for (int i = 0; i < array.length; i++) {
				if (array[i] != array[place]) {
					tempArray[i - rD] = array[i];
				}

				else {
					rD++;
					removed = array[i];
				}

			}

			array = new int[tempArray.length];

			for (int j = 0; j < tempArray.length; j++) {
				array[j] = tempArray[j];
			}
		}

		return removed;
	}

	public int getSize() {
		return array.length;
	}

	public int get(int e) {
		return array[e];
	}
}
