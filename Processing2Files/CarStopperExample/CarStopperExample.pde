int 

//0 means that the barrier is down, 1 means that the barrier is up
int[] barriers = {0, 0};

//First value is X, Second value is Y, Third value is vital state (1 = alive, 0 = dead)
int[] person = {295, 295, 1};

//First value is X, Second value is Y
int[] car = {175, 600};

void setup(){
  size(400,400);
  noStroke();
}

void draw(){
  background(110,110,110);
  
  //The four corner squares
  fill(160,160,160);
  rect(0,0,125,125);
  rect(0,275,125,125);
  rect(275,0,125,125);
  rect(275,275,125,125);
  
  //The yellow lines
  fill(255,255,0);
  rect(197.5,5,5,30);
  rect(197.5,50,5,30);
  rect(197.5,320,5,30);
  rect(197.5,365,5,30);
  rect(5,197.5,30,5);
  rect(50,197.5,30,5);
  rect(365,197.5,30,5);
  rect(320,197.5,30,5);
  
  //The sidewalks
  fill(175,175,175);
  rect(125,87,150,3);
  rect(125,122,150,3);
  rect(125,310,150,3);
  rect(125,275,150,3);
  rect(87,125,3,150);
  rect(122,125,3,150);
  rect(310,125,3,150);
  rect(275,125,3,150);
  
  //The barriers
  fill(30+(175*barriers[0]),30,30);
  ellipse(162.5,340,10,10);
  ellipse(237.5,340,10,10);
  
  //The person
  fill(255, 235*person[2], 150*person[2]);
  ellipse(person[0], person[1], 16, 16);
  
  //The Car
  fill(255, 100, 100);
  rect(car[0], car[1], 50, 75);
  
  
  
  
}