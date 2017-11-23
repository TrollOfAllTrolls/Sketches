#include <Adafruit_NeoPixel.h>

#define ARDUINO_PIN_NUMBER 6
#define NUM_JEWEL_PIXELS 7

// initialize neopixel jewel object
Adafruit_NeoPixel jewel = Adafruit_NeoPixel(NUM_JEWEL_PIXELS, ARDUINO_PIN_NUMBER, NEO_RGBW + NEO_KHZ800);

// colors 
const uint32_t RED = jewel.Color(0, 255, 0);
const uint32_t GREEN = jewel.Color(255, 0, 0);
const uint32_t BLUE = jewel.Color(0, 0, 255);
const uint32_t PINK = jewel.Color(79, 236, 100);
const uint32_t YELLOW = jewel.Color(255, 255, 0);
const uint32_t WHITE = jewel.Color(255, 255, 255);
const uint32_t ORANGE = jewel.Color(165, 255, 0);
const uint32_t PURPLE = jewel.Color(44, 91, 86);
const uint32_t INDIGO = jewel.Color(0, 75, 130);
const uint32_t VIOLET = jewel.Color(130, 238, 238);
const uint32_t OFF = 0;
// add more colors here! 
// use http://www.colorpicker.com/ to find RGB values for a color using a color wheel
// use http://cloford.com/resources/colours/500col.htm to find the RGB values for a color by name

// jewel "frame" states
const uint32_t ALL_OFF[7] = {OFF, OFF, OFF, OFF, OFF, OFF, OFF};
const uint32_t RAINBOW[7] = {VIOLET, RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO};
// add more frame states here!

void setup() {
  jewel.begin();
  jewel.show(); // initialize all pixels to 'off'
}

void loop() {
  // experiment with the brightness value here! 
  // you can also tinker with different brightness values in your animations
  jewel.setBrightness(20);
  // call your animations here!
  int colors[3] = {0,255,0};
  
  arrayRotate(RAINBOW,250);
}

// -------------------------------------------------------------------------------------
// I. Warm up

// 1. Turn all pixels the color that was passed in
void setPixelsSingleColor(uint32_t color) {
  for(int i = 0; i < 7; i++){
    jewel.setPixelColor(i, color);
  }
  jewel.show();
}

// 2. Make all the pixels blink once 
void allBlink(uint32_t color, long delayTimeInMs) {
  setPixelsSingleColor(OFF);
  delay(delayTimeInMs);
  setPixelsSingleColor(color);
  delay(delayTimeInMs);
  setPixelsSingleColor(OFF);
}

// -------------------------------------------------------------------------------------
// II. Utility Function

// 1. Display a single frame of an animation (this utility function will be useful for building more complicated animations)
//    - set all of the colors on the neopixel using the colors parameter
//    - pause for the amount of time given by the delayTimeInMs parameter
void setPixelColors(const uint32_t colors[], long delayTimeInMs) {
  for(int i = 0; i < 7; i++){
    jewel.setPixelColor(i, colors[i]);
  }
  jewel.show();
  delay(delayTimeInMs);
}

// -------------------------------------------------------------------------------------
// III. Heartbeat

// 1. Display a heart shape with the pixels and make them blink once
void heartBlink(uint32_t color, long delayTimeInMs) {
  for(int i = 0; i < 6; i++){
    jewel.setPixelColor(i, color);
  }
  jewel.setPixelColor(6, OFF);
  jewel.show();
  delay(delayTimeInMs);
  
  setPixelsSingleColor(OFF);
  delay(delayTimeInMs);
}

// 2. Use the heartBlink() function to simulate a heartbeat 
//    - two beats each lasting a third of the given delay time
//    - pause for the full delay time
void heartbeat(uint32_t color, long delayTimeInMs) {
  heartBlink(color, delayTimeInMs/3);
  heartBlink(color, delayTimeInMs/3);
  delay(delayTimeInMs);
}


// -------------------------------------------------------------------------------------
// IV. Explosion!

// 1. Blink the center pixel to animate the initial part of an explosion
void centerBlink(uint32_t color, long delayTimeInMs) {
  jewel.setPixelColor(0,color);
  jewel.show();
  delay(delayTimeInMs);
}

// 2. Make the pixels blink alternately to animate the end of the explosion
//    - blink 3 alternating pixels on the outer ring, once
//    - blink the remaining 3 pixels on the outer ring and the middle pixel, once
void alternateBlink(uint32_t color, long delayTimeInMs) {
  uint32_t listOne[7] = {OFF,color,OFF,color,OFF,color,OFF};
  uint32_t listTwo[7] = {OFF,OFF,color,OFF,color,OFF,color};
  setPixelColors(listOne, delayTimeInMs);
  setPixelColors(listTwo, delayTimeInMs);
}

// 3. Use centerBlink() and alternateBlink() to create an explosion animation!
void explosion(uint32_t color) {
  centerBlink(color,75);
  alternateBlink(color,50);
  setPixelsSingleColor(OFF);
}


// -------------------------------------------------------------------------------------
// V. Create an exploding heart animation! 

// Use your heartbeat() and explosion() functions in the main execution loop to create
// a heartbeat that increases in tempo until it explodes!
void explodingHeart(int firstTimeInMs, int finalTimeInMs, float timeMod){
  for(int i = firstTimeInMs; i > finalTimeInMs; i = i / timeMod){
    heartbeat(RED,i);
  }
  explosion(YELLOW);
  delay(1000);
}

// -------------------------------------------------------------------------------------
// Other things to try

// Tinker with your animations:
// - experiment with changing brightness values during your animations!
// - try modifying the speeds of your animations
// - mix and match different animations in the main execution loop()

// Create your own animations!! Here are some ideas:
// - blink a single pixel all the way around the ring of the jewel
void blinkAround(uint32_t color, int delayTimeInMs){
  jewel.setPixelColor(0,color);
  jewel.show();
  for(int i = 1; i < 7; i++){
    delay(delayTimeInMs);
    jewel.setPixelColor(i-1, OFF);
    jewel.setPixelColor(i, color);
    jewel.show();
  }
  delay(delayTimeInMs);
}
// - do the 'wave': blink 2 adjacent pixels on the outside, then the 3 next to them, and then the 2 on the opposite side.
void wave(uint32_t color, int delayTimeInMs){
  uint32_t laneOne[7] = {OFF,color,color,OFF,OFF,OFF,OFF};
  setPixelColors(laneOne,delayTimeInMs);
  uint32_t laneTwo[7] = {color,OFF,OFF,color,OFF,OFF,color};
  setPixelColors(laneTwo,delayTimeInMs);
  uint32_t laneThree[7] = {OFF,OFF,OFF,OFF,color,color,OFF};
  setPixelColors(laneThree,delayTimeInMs);
}
// - tricolor wave: same as the wave function above, but with 3 colors that wrap after they move through the jewel to the other side.
void triColorWave(uint32_t color[], int delayTimeInMs){
  uint32_t laneOne[7] = {OFF,color[0],color[0],OFF,OFF,OFF,OFF};
  setPixelColors(laneOne,delayTimeInMs);
  uint32_t laneTwo[7] = {color[1],OFF,OFF,color[1],OFF,OFF,color[1]};
  setPixelColors(laneTwo,delayTimeInMs);
  uint32_t laneThree[7] = {OFF,OFF,OFF,OFF,color[2],color[2],OFF};
  setPixelColors(laneThree,delayTimeInMs);
}
// - rotate the RAINBOW array (or an array defined with your colors of choice) around the jewel ring (hint: the modulo operator helps!)
void arrayRotate(const uint32_t colors[], int delayTimeInMs){
  
  for(int i = 0; i < 7; i++){
    uint32_t exampleArray[7] = {colors[i % 7], colors[(i+1) % 7], colors[(i+2) % 7], colors[(i+3) % 7], colors[(i+4) % 7], colors[(i+5) % 7], colors[(i+6) % 7]};
    setPixelColors(exampleArray, delayTimeInMs);
  }
}

void colorBlend(int rgb[], int steps, int delayTimeInMs){
  for(int i = 1; i < steps+1; i++){
    setPixelsSingleColor(jewel.Color(rgb[0]/(steps/i),rgb[1]/(steps/i), rgb[2])/(steps/i));
    delay(delayTimeInMs/steps);
  }
}

