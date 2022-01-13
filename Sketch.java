import processing.core.PApplet;

public class Sketch extends PApplet {

  boolean background = true;

  public void settings() {
	  // put your size call here
    size(500, 500);
  }

  
  public void draw() {   
    updateBackground();
    ellipse(100,100,400,400);
    
    rect(300,250,150,50);
    rect(300,325,150,50);
    rect(300,400,150,50);
  }

   

  public void updateBackground(){
    if(background){
      background(236, 171, 237);
    }
    else{
      background(255);
    }
  }

boolean isMouseOver(int x, int y, int w, int h){
  if(mouseX >= x && mouseX <= x + w && mouseY >= y && mouseY <= y +h){
    return true;
  }
  return false;
}

public void mousePressed(){
  if(isMouseOver(100,100,400,400) == true){
    background = !background;
  }
}
}



