import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitShapes {

	@Test
	public void test() {
		ShapeCalculator shape = new ShapeCalculator();
		assertEquals(20, shape.cSquareP(5));
		assertEquals(16, shape.cRectP(3, 5));
		assertEquals(50.265, shape.cCircleA(4), 0.001);
		assertEquals(25.132, shape.cCircleC(4), 0.001);

	}

}
