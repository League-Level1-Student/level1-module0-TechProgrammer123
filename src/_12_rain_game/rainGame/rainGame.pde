int randomNumber;
int y = 0;
int x = 0;
void setup() {
  size(500, 500);
 randomNumber = (int) random(width);
  
}
void draw() {
  background(0,255,0);
  fill(0, 255, 255);
    stroke(0, 255, 255);
    ellipse(randomNumber, y, 20, 20);
    fill(77, 79, 76);
     stroke(77, 79, 76);
    rect(mouseX, 440, 50, 60);
    
 y+=10;
 if (y>480){
   y=0;
   randomNumber = (int) random(width);
 }
 void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
}
