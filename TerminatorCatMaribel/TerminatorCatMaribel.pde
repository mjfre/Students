int x=494;
int y=180;

PImage catPic;
void setup(){
size(800,600);
catPic=loadImage("cat.jpg");
catPic.resize(800,600);
background(catPic);

}
void draw(){
  if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" +
"Mouse’s y-position: " + mouseY + "\n");
  }
  fill(3,5,4);
  ellipse(494,180,50,50);
  ellipse(125,4,50,50);


}