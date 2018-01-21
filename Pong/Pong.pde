import ddf.minim.*;
Minim minim;
AudioSample sound;

int x = 0; 
int xspeed = 10; 
int yspeed = 10;
int y = 250;

void setup() {
 size(500,500); 
  minim = new Minim (this);
  sound = minim.loadSample("BD.mp3", 128);
}
void draw() {
  background(4,241,252);
  ellipse(x,y,50,50); 
  fill(255,0,0); 
  stroke(20,134,54);
  rect(mouseX, 475, 75, 10);
  if(x==0) {
xspeed = 10;
 sound.trigger();
  }
  if (x==500){
    xspeed = -10;
     sound.trigger();
  }
  x+=xspeed; 
if (y==0){
  yspeed = 10;
  sound.trigger();  
}
if (y==500){
}
y+=yspeed;
if (intersects(x,y,mouseX,475,75)){
yspeed=-10;
}
}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
return true;
else 
return false;
}