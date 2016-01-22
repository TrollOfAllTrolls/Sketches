import java.util.ArrayList;

import junit.framework.TestCase;

/* Use the internets to figure out how to use ArrayLists. Try not to use autocomplete. */

public class ArrayListQuiz extends TestCase {

	public void testInitialize() throws Exception {
		assertNotNull(LearningArrayLists.createArrayList());
	}

	public void testAddToArrayList() throws Exception {
		ArrayList testList = new ArrayList();
		LearningArrayLists.addToArrayList(testList, new String());
		LearningArrayLists.addToArrayList(testList, new String());
		assertEquals(2,testList.size());
	}
	
	public void testGetNumberOfItems() throws Exception {
		ArrayList testList = new ArrayList();
		testList.add(new String());
		testList.add(new String());
		testList.add(new String());
		assertEquals(3, LearningArrayLists.getNumberOfItems(testList));
	}
	
	public void testGetSomethingFromList() throws Exception {
		ArrayList testList = new ArrayList();
		testList.add(new String());
		testList.add("Natch");
		testList.add(new String());
		assertEquals("Natch", LearningArrayLists.getItem(testList, 1));
	}
	
	public void testListIteration() throws Exception {
		ArrayList testList = new ArrayList();
		testList.add("Rad");
		testList.add("Natch");
		testList.add("Bounce");
		assertEquals("RadNatchBounce", LearningArrayLists.iterateOver(testList));
	}
	
	public void testFindItem() throws Exception {
		ArrayList testList = new ArrayList();
		testList.add("Rad");
		testList.add("Natch");
		testList.add("Bounce");
		assertEquals(2, LearningArrayLists.findItemOnList(testList, "Bounce"));
	}
	
	public void testReplaceItem() throws Exception {
		ArrayList testList = new ArrayList();
		testList.add("Rad");
		testList.add("Natch");
		testList.add("Bounce");
		LearningArrayLists.replaceItem(testList, 1, "Sweet");
		assertEquals("Rad", testList.get(0));
		assertEquals("Sweet", testList.get(1));
		assertEquals("Bounce", testList.get(2));
	}
	
	public void testInsertItem() throws Exception {
		ArrayList testList = new ArrayList();
		testList.add("Rad");
		testList.add("Natch");
		testList.add("Bounce");
		LearningArrayLists.insertItem(testList, 1, "Sweet");
		assertEquals("Rad", testList.get(0));
		assertEquals("Sweet", testList.get(1));
		assertEquals("Natch", testList.get(2));
		assertEquals("Bounce", testList.get(3));
	}

	
	/****************************and now for something much cooler********************************/
	
	public void testTypedArrayLists() throws Exception {
		ArrayList<Integer> testList = LearningArrayLists.createTypedArrayList();
	}
	
	public void testAddStuff() throws Exception {
		ArrayList<Integer> testList = LearningArrayLists.createTypedArrayList();
		testList.add(new Integer(6));
		testList.add(new Integer(6));
		testList.add(new Integer(6));
		assertEquals(new Integer(18),  LearningArrayLists.addAllInteger(testList));
	}
	
	public void testConcatenateStrings() throws Exception {
		ArrayList<String> testList = LearningArrayLists.createStringTypedArrayList();
		testList.add("9");
		testList.add("0");
		testList.add("0");
		testList.add("1");
		assertEquals("9001",  LearningArrayLists.addAllString(testList));
	}

	/* now do this puzzle: http://apcomputersciencetutoring.com/exam-review/candidatepool-free-response-practice-question/ */
	
}

