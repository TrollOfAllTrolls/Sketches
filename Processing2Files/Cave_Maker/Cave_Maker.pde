int width = 300;
int height = 300;
int[] x = new int[width];

void setup(){ 
  size(300,300);
  for(int i = 0; i < width; i++){
    x[i] = (int)random(width - 149);
  }
  noStroke();
}
void draw(){
  background(150,100,50);
  fill(100,100,100);
  for(int i = 0; i < x.length; i++){
    rect(i, height, 1, x[i] * -1);
    rect(width-i, 0, 1, x[i]);
  }
  
  for(int j = 0; j < width - 1; j++){
    int holder;
    if(x[j] > x[j+1]){
      holder = x[j];
      x[j] = x[j+1];
      x[j+1] = holder;
    }
  }
  if(mousePressed){
     for(int i = 0; i < width; i++){
    x[i] = (int)random(width -149);
  }
  }
}
