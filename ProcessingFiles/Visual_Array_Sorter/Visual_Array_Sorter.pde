int width = 100;
int height = 100;
int[] x = new int[width];

void setup(){ 
  size(300,300);
  for(int i = 0; i < width; i++){
    x[i] = (int)random(width + 1);
  }
  noStroke();
}
void draw(){
  background(255,255,255);
  
}
