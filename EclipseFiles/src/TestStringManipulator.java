import static org.junit.Assert.*;

import org.junit.Test;

public class TestStringManipulator {

	@Test
	public void testStringManipulator() {
		StringManipulator sm = new StringManipulator();
		assertEquals("sdrawkcab", sm.reverseWord("backwards"));
		assertEquals("CAPITAL", sm.capitalizeWord("capital"));
	}

}
