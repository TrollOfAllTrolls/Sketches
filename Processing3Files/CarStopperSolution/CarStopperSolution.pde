//First value is the frames that have passed, and the rest of the values are separate delays
int[] times = {0, 50, 200, 300, 390, 411, 490, 590};

//First value is the barrier's status (Up or down), Second value is the barrier's integrity (Good or damaged)
int[] barrier = {0, 0};

//First value is X, Second value is Y, Third value is vital state (1 = alive, 0 = dead)
int[] person = {295, 295, 1};

//First value is X, Second value is Y
int[] car = {135, 600};

//The stoplight's state
int stoplight = 0;

void setup(){
  frameRate(30);
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
  fill(100+(100*barrier[0])-(40*barrier[1]),100+(100*barrier[0])-(40*barrier[1]),100+(100*barrier[0])-(40*barrier[1]));
  ellipse(162.5,344,10,10);
  fill(100+(100*barrier[0]),100+(90*barrier[0]),100+(100*barrier[0]));
  ellipse(237.5,344,10,10);
  
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
  
  //Timer for intro text
  if(times[0] >= times[1] && times[0] <= times[2]){
    textSize(20);
    text("This is Bill", 290, 340);
  }
  
  //Timer for light to turn red
  if(times[0] >= times[2]){
    stoplight = 1;
    barrier[0] = 1;
  }
  
  //Timer for person to start walking
  if(times[0] >= times[3] && times[0] < times[6]){
    person[0] -= 1;
  }
  
  //Timer for car to move
  if(times[0] >= times[4] && times[0] < times[5]){
    car[1] -= 12;
  }
  
  //Timer for barrier to deform
  if(times[0] >= times[5]){
    barrier[1] = 1;
  }
  
  //Timer for aftermath text to show up
  if(times[0] >= times[7]){
    textSize(20);
    text("He is still", 290, 340);
    textSize(30);
    fill(0, 255, 0);
    text("alive", 290, 370);
  }
}