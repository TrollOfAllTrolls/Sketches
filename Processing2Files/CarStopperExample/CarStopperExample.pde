//First value is the frames that have passed, and the rest of the values are separate delays
int[] times = {0, 50, 200, 300, 390, 415, 500};

//0 means that the barrier is down, 1 means that the barrier is up
int[] barriers = {0, 0};

//First value is X, Second value is Y, Third value is vital state (1 = alive, 0 = dead)
int[] person = {295, 295, 1};

//First value is X, Second value is Y
int[] car = {135, 600};

//The stoplight's state
int stoplight = 0;

void setup(){
  frameRate(50);
  size(400,400);
  noStroke();
}

void draw(){
  times[0]++;
  
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
  fill(110+(175*barriers[0]),110,110);
  ellipse(162.5,340,10,10);
  ellipse(237.5,340,10,10);
  
  //The stoplight
  fill(255 * stoplight, 255 * (1 - stoplight), 0);
  ellipse(193,200,10,10);
  ellipse(207, 200, 10, 10);
  ellipse(200, 193, 10, 10);
  ellipse(200, 207, 10, 10);
  fill(75,75,75);
  rect(190,190,20,20);
  
  //The person
  fill(255, 235*person[2], 150*person[2]);
  ellipse(person[0], person[1], 16, 16);
  
  //The Car
  fill(255, 100, 100);
  rect(car[0], car[1], 50, 75);
  
  
  if(times[0] >= times[1] && times[0] <= times[2]){
    textSize(20);
    text("This is Bill", 290, 340);
  }
  
  //Timer for person to start walking
  if(times[0] >= times[2]){
    stoplight = 1;
  }
  
  //Timer for car to crash into person
  if(times[0] >= times[3] && times[0] < times[5]){
    person[0] -= 1;
  }
  
  if(times[0] >= times[4]){
    car[1] -= 12;
  }
  
  if(times[0] >= times[5]){
    person[1] -= 12;
    person[2] = 0;
  }
  
  if(times[0] >= times[6]){
    textSize(20);
    text("He is now", 290, 340);
    textSize(30);
    fill(255, 0, 0);
    text("dead", 290, 370);
  }
}