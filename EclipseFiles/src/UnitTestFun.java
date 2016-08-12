import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class UnitTestFun {

	@Test
	public void test1() {
		ArrayList<Integer> numList = new ArrayList<Integer>();

		numList.add(5);
		numList.add(17);
		numList.add(32);
		numList.add(6);
		numList.add(13);

		assertEquals(32, getHighestValue(numList));
	}

	public int getHighestValue(ArrayList<Integer> numbers) {
		int highestNum = -999999999;

		for (int currentNum : numbers) {
			if (currentNum > highestNum) {
				highestNum = currentNum;
			}
		}

		return highestNum;

	}

	@Test
	public void test2() {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		list1.add(3);
		list1.add(6);
		list1.add(9);
		list1.add(12);
		list1.add(15);

		list2.add(4);
		list2.add(7);
		list2.add(10);
		list2.add(13);
		list2.add(16);

		assertEquals(list2, incrementList(list1));
	}

	public ArrayList<Integer> incrementList(ArrayList<Integer> list) {
		ArrayList<Integer> iArrayList = new ArrayList<Integer>();

		for (int currentNum : list) {
			iArrayList.add(currentNum + 1);
		}

		return iArrayList;

	}

}
