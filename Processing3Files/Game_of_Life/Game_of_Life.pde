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

int getNeibhors(Cell cell) {
  int neibhors = 0;

  for (int i = cell.cellX - 1; i < cell.cellX + 1; i++) {
    for (int j = cell.cellY - 1; j < cell.cellY + 1; j++) {
      if (i - 1 > 0 && i + 1 < cellAmount && j - 1 > 0 && j + 1 < cellAmount && cells[i][j].isAlive() == true) {
        neibhors++;
      }
    }
  }

  return neibhors;
}

void setup() {
  int cellSize = 25;
  cellAmount = 10;

  cells = new Cell[cellAmount][cellAmount];
  for (int i = 0; i < cellAmount; i++) {
    for (int j = 0; j < cellAmount; j++) {
      cells[i][j] = new Cell(true, cellSize, i, j);
    }
  }
  surface.setSize(cellSize * cellAmount, cellSize * cellAmount);
}
void draw() {
  for (Cell[] c : cells) {
    for (Cell cell : c) {
      cell.display();
    }
  }
}