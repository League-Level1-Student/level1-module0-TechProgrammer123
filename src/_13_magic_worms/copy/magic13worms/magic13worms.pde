int maxValue=5;
void setup(){ 
   size(500, 500);
    background(0, 200, 255);
}
void draw() {
   random(maxValue);
  for (int I = 1; I <=300; I++) {   
    ellipse(I++, I++, 50, 50);
  }


}
