int numDrops = 15;
float speedMin = 25;
float speedMax = 30;
int size = 10;
int red = 0;
int green = 0;
int blue = 250;
int xValues[] = new int[numDrops];
float yValues[] = new float[numDrops];
float speedValues[] = new float[numDrops];

void setup(){
  size(750,500);
  for(int i = 0; i < numDrops; i++){
    xValues[i] = (int)random(750 - size) + size;
    yValues[i] = -30;
    speedValues[i] = random(speedMax) + speedMin;
  }
}

void draw(){
  background(0,50,100);
  for(int j = 0; j < numDrops; j++){
    if(yValues[j] > 500){
      yValues[j] = -30;
      xValues[j] = (int)random(750 - size) + size;
    }
    fill(red, green, blue);
    ellipse(xValues[j], yValues[j], size, size);
    yValues[j] += speedValues[j];
  }
  fill(200,200,200);
  rect(-2, -2, 760, 25);
  fill(0,200,50);
  rect(-2, 480, 760, 25);
}