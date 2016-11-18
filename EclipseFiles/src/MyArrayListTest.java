import static org.junit.Assert.*;

import org.junit.Test;

public class MyArrayListTest {

	@Test
	public void intTest() {
		MyArrayList object = new MyArrayList();

		object.add(5);
		object.add(7);
		object.add(4);
		object.add(9);

		assertEquals(5, object.get(0));
		assertEquals(7, object.get(1));
		assertEquals(4, object.get(2));
		assertEquals(9, object.get(3));

		assertEquals(5, object.remove(0));
		assertEquals(7, object.remove(0));
	}

	@Test
	public void stringTest() {
		MyArrayList<String> object = new MyArrayList<String>();
	}

}
