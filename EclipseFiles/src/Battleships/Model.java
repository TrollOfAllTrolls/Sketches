package Battleships;

public class Model {
	boolean[][] pAlives = new boolean[10][10];
	boolean[][] eAlives = new boolean[10][10];
	int x;
	int y;

	public Model() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				pAlives[i][j] = true;
				eAlives[i][j] = true;
			}
		}
	}

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
		boolean holder = eAlives[y][x];
		eAlives[y][x] = false;
		return holder;
	}
}
