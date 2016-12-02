void setup(){
  int brickWidth = 20;
  int brickHeight = 10;
  int bricksInBase = 10;
  int bricksOnLayer = bricksInBase;
  int x = 0;
  int y = (brickHeight * bricksInBase) + ((brickHeight * bricksInBase)/5);
  
  size((brickWidth * bricksInBase) + 1,(brickHeight * bricksInBase) + ((brickHeight * bricksInBase)/5) + brickHeight);
  background(255,255,255);
  fill(255,255,255);
  
  for(int i = 0; i < bricksInBase; i++){
    for(int j = 0; j < bricksOnLayer; j++){
      rect(x, y, brickWidth, brickHeight);
      x += brickWidth;
    }
    x = 0;
    x += (brickWidth/2) * (i + 1);
    y =  y - brickHeight;
    bricksOnLayer--;
  }
}
