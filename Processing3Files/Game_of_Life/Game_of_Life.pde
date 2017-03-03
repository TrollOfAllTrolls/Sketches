Cell[][] cells;
int cellAmount;

class Cell {
  boolean isAlive;
  int size;
  int cellX;
  int cellY;
  Cell(boolean isAlive, int size, int cellX, int cellY) {
    this.isAlive = isAlive;
    this.size = size;
    this.cellX = cellX;
    this.cellY = cellY;
  }

  void setAlive(boolean alive) {
    isAlive = alive;
  }

  boolean isAlive() {
    return isAlive;
  }

  void display() {
    fill(255, 255, 255);
    if (isAlive == true) {
      fill(0, 0, 0);
    }
    rect(cellX * size, cellY * size, size, size);
  }
}

int getNeighbors(Cell cell) {
  int neighbors = 0;

  for (int x = cell.cellX - 1; x < cell.cellX + 2; x++) {
    for (int y = cell.cellY - 1; y < cell.cellY + 2; y++) {
      if (x - 1 >= 0 && x + 1 < cellAmount && y - 1 >= 0 && y + 1 < cellAmount && cells[x][y].isAlive() == true) {
        neighbors++;
        if (cell.cellX == x && cell.cellY == y) {
          neighbors--;
        }

        println(cells[x][y].isAlive());
      }
    }
  }

  return neighbors;
}

void setup() {
  int cellSize = 25;
  cellAmount = 10;

  cells = new Cell[cellAmount][cellAmount];
  for (int i = 0; i < cellAmount; i++) {
    for (int j = 0; j < cellAmount; j++) {
      cells[i][j] = new Cell(false, cellSize, i, j);
    }
  }
  surface.setSize(cellSize * cellAmount, cellSize * cellAmount);
  cells[1][2].setAlive(true);
  cells[2][2].setAlive(true);
  println(getNeighbors(cells [0][2]));
}
void draw() {
  ArrayList<Cell> birth = new ArrayList<Cell>();
  ArrayList<Cell> kill = new ArrayList<Cell>();

  for (Cell[] c : cells) {
    for (Cell cell : c) {
      if (getNeighbors(cells[cell.cellX][cell.cellY]) == 3) {
        birth.add(cell);
      } else if (getNeighbors(cells[cell.cellX][cell.cellY]) > 3 || getNeighbors(cells[cell.cellX][cell.cellY]) < 2) {
        kill.add(cell);
      }
      for (int i = 0; i < birth.size(); i++) {
        birth.get(i).setAlive(true);
      }

      for (int j = 0; j < kill.size(); j++) {
        kill.get(j).setAlive(false);
      }
      cell.display();
    }
  }
}