import processing.core.PApplet;

public class Sketch extends PApplet {

    public void settings() {
        size(400, 400);
    }

    public void setup() {
        background(51, 204, 255);
    }

    public void draw() {

        strokeWeight(4);
        stroke(0, 0, 0);
        fill(117, 73, 41);
        triangle(width / 2 , height / 4, (float) (width / 1.06), (float) (height / 1.66), width / 16, (float) (height / 1.66));

        strokeWeight(3);
        fill(222, 158, 113);
        rect(width / 16, (float) (height / 1.66), (float) (width/1.14), (float) (height / 1.05));

        strokeWeight(2);
        fill(60, 189, 222);
        rect((float) (width / 6.66) , (float) (height / 1.6) , (float) (width / 5.3) , (float) (height / 5.3));

        strokeWeight(2);
        fill(117, 73, 41);
        rect((float) (width / 2.66) , (float) (height / 1.45) , width / 4, (float) (height / 1.45));

        fill(247, 237, 40);
        ellipse((float) (width / 26.66) , height / 8, (float) (width / 5.33) , (float) (height / 4.44));

        fill(102, 255, 102);
        rect(0, (float) (height / 1.05) , width / 1, (float) (height / 1.33));


    }
}