package Battleships;

public class Model {
	boolean[][] pAlives;
	boolean[][] eAlives;
	int x;
	int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean fire(int x, int y) {
		return eAlives[x][y];
	}
}
