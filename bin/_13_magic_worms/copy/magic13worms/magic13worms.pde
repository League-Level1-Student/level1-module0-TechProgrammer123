int maxValuex=400;
int maxValuey=400;
void setup(){ 
   size(500, 500);
    background(0, 200, 255);
}
void draw() {
  for (int I = 0; I <300; I++) {   
    ellipse(random(maxValuex), random(maxValuey), 10, 10);
  }


}
