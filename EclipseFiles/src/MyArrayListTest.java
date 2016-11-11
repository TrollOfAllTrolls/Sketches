import static org.junit.Assert.*;

import org.junit.Test;

public class MyArrayListTest {

	@Test
	public void test() {
		MyArrayList object = new MyArrayList();

		object.add(5);
		object.add(7);
		object.add(4);
		object.add(9);

		assertEquals(5, object.get(0));
		assertEquals(7, object.get(1));
		assertEquals(4, object.get(2));
		assertEquals(9, object.get(3));
	}

}
