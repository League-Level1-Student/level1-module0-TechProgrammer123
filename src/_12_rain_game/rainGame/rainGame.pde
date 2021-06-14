int randomNumber = () random();
int y = 0;
void setup() {
  size(500, 500);
  
  
}
void draw() {
  background(0,255,0);
  fill(0, 255, 255);
    stroke(0, 255, 255);
    ellipse(250, y, 20, 20);
 y+=10;
 if (y>480){
   y=0;
 }
}
