import processing.core.PApplet;

public class Sketch extends PApplet {


  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	  // put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */

  int intStillNum = 250;
  double dblMoveAngle = 0.06;
  int intScalar = 150;
  double dblSpeed = 0.01;

  int intMoonNum = 250;
  double dblMoonAngle = 0.05;
  int intMoonScalar = 150;

  boolean Sun = true;
  boolean Moon = false;

  public void setup() {
    background(210, 255, 173);
  }

  
  public void draw() {
    float SunHori = intStillNum + sin((float) dblMoveAngle) * intScalar;
    float SunVert = intStillNum + cos((float) dblMoveAngle) * intScalar;

    float MoonHori = intMoonNum + sin((float) dblMoonAngle) * intMoonScalar;
    float MoonVert = intMoonNum + cos((float) dblMoonAngle) * intMoonScalar;

    if (Sun == true){
      background(39, 182, 214);
    
      fill(217, 171, 54);
      ellipse(SunHori, SunVert, 75, 75);
      dblMoveAngle = dblMoveAngle + dblSpeed;
      
      fill(52, 186, 61);
      rect(0,350,500,500);

      if (SunVert > 350){ 
        Sun = false;
        Moon = true;
      }
    }
    
    if (Moon == true){
      background(0);
      
      fill(255,255,255);
      ellipse(MoonHori, MoonVert, 75, 75);
      dblMoonAngle = dblMoonAngle + dblSpeed;
   
      fill(52, 186, 61);
      rect(0,350,500,500);

      if (MoonVert > 350){
        Sun = true;
        Moon = false;
      }

    }


  }  
}