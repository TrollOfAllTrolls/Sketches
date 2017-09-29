int[] barriers = {0, 0};

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
}
