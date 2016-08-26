
public class ShapeCalculator {
	public int cSquareP(int sLength) {
		return sLength * 4;
	}

	public int cRectP(int sLength, int sWidth) {
		return (sLength * 2) + (sWidth * 2);
	}

	public double cCircleA(double radius) {
		return Math.PI * (radius * radius);
	}

	public double cCircleC(double radius) {
		return Math.PI * (radius * 2);
	}
}
