int maxValuex=400;
int maxValuey=400;
boolean once=true;
void setup(){ 
   size(500, 500);
    background(0, 200, 255);
}
void draw() {
 if(once){
  for (int I = 0; I <300; I++) {   
    fill(255,0,0);
    ellipse(random(maxValuex), random(maxValuey),10, 10);
  }
 }
once=false;
}
float frequency = .001;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
