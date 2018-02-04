import ddf.minim.*;
Minim minim;
AudioSample sound;
AudioSample song;
int x = 0; 
int xspeed = 10; 
int yspeed = 10;
int y = 250;
float secs = 0;
int lives = 3;
void setup() {
 size(500,500); 
  minim = new Minim (this);
  sound = minim.loadSample("BD.mp3", 100);
  song = minim.loadSample("file.wav",128);
  song.trigger();
}
void draw() {
  secs+=.016666666;
  background(4,241,252);
  fill(0,0,0);
  text((int) secs+"",15,75);
  text(lives+"",450,75);
  textSize(75);
  ellipse(x,y,50,50); 
  fill(255,0,0); 
  stroke(20,134,54);
  rect(mouseX, 450, 110, 10);
  if(x==0) {
xspeed = 10;
 
  }
  if (x==500){
    xspeed = -10;
     
  }
  x+=xspeed; 
if (y==0){
  yspeed = 10;
    
}
if (y==500){
  lives-=1;
yspeed = -10;
sound.trigger();
}
  y+=yspeed;
if (intersects(x,y+45,mouseX,475,110)){
yspeed=-10;
}
if(lives==0){
System.exit(0);
}
}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
return true;
else 
return false;
}