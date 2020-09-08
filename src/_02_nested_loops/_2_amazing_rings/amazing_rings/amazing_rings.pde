int x=0;
int x1=500;
int d = 1;
void setup() {
  size(500,500);
}

void draw() {
  background(#C4C4C4);
  for (int i = 0; i<30; i++) { 
    noFill();
ellipse(x,250,240-8*i,240-8*i);
  }
    for (int i = 0; i<30; i++) { 
    noFill();
    ellipse(x1,250,240-8*i,240-8*i);
  }
  
 x=x+1*d;
 x1=x1-1*d;
 if (x==250 || x1==250) {
   d=-1;
 }
 if (x==0 || x1==500) {
   d=1;
 }
  // Go to the recipe to run the demonstration before starting this program
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */
}
