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
  if(x==0) {
xspeed = 10;
  }
  if (x==500){
    xspeed = -10;
  }
  x+=xspeed; 
if (y==0){
  yspeed = 10;
  sound.trigger();  
}
if (y==500){
  yspeed=-10;
}
y+=yspeed;
}