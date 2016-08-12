void setup(){
  int boxesPerSide = 5;
  int boxSize = 100;
  int boxSpacing = 25;
  
  int x = boxSpacing;
  int y = boxSpacing;
  
  size((boxSize * boxesPerSide)
  + ((boxSpacing * boxesPerSide) + boxSpacing),
  (boxSize * boxesPerSide)
  + ((boxSpacing * boxesPerSide) + boxSpacing));
  background(255,255,255);
  fill(100,100,100);
  noStroke();
  
  for(int i = 0; i < boxesPerSide; i++){
    for(int j = 0; j < boxesPerSide; j++){
      rect(x, y, boxSize, boxSize);
      x += (boxSpacing + boxSize);
    }
    y += (boxSpacing + boxSize);
    x = boxSpacing;
  }
}
