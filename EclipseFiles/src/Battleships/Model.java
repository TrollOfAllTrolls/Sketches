package Battleships;

import java.util.Random;

public class Model {
	boolean[][] pAlives = new boolean[10][10];
	boolean[][] eAlives = new boolean[10][10];
	int randX;
	int randY;
	int x;
	int y;

	public Model() {
		for (int i = 0; i < 10; i++) {
			randX = new Random().nextInt(9);
			randY = new Random().nextInt(9);

			if (pAlives[randX][randY] == false) {
				pAlives[randX][randY] = true;
			} else {
				i--;
			}
		}
		for (int j = 0; j < 10; j++) {
			randX = new Random().nextInt(9);
			randY = new Random().nextInt(9);

			if (eAlives[randX][randY] == false) {
				eAlives[randX][randY] = true;
			} else {
				j--;
			}
		}
	}

	public boolean getEAlive(int x, int y) {
		return pAlives[x][y];
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

	public boolean pFire(int x, int y) {
		boolean holder = pAlives[y][x];
		eAlives[y][x] = false;
		return holder;
	}

	public boolean eFire(int x, int y) {
		boolean holder = eAlives[y][x];
		eAlives[y][x] = false;
		return holder;
	}

}
