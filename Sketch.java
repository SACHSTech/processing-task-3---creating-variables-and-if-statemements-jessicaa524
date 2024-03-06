import processing.core.PApplet;

public class Sketch extends PApplet {

  float flowerX = random(100,150);
  float flowerY = random(100, 150);
  float petalSize = random(25, 150);
  float petalDistance = petalSize / 2;

  public void settings() {

    size(300, 300);
  }

  public void setup() {

    if (flowerX >= 125) {
      background(210, 255, 173);
    }
    else {
      background(182, 240, 238);
    }
  }

  public void draw() {

    // petals
    fill(255, 99, 99);
    // upper-left petal
    ellipse(flowerX - petalDistance, flowerY - petalDistance, petalSize, petalSize);
    // upper-right petal
    ellipse(flowerX + petalDistance, flowerY - petalDistance, petalSize, petalSize);
    // lower-left petal
    ellipse(flowerX - petalDistance, flowerY + petalDistance, petalSize, petalSize);
    // lower-right petal
    ellipse(flowerX + petalDistance, flowerY + petalDistance, petalSize, petalSize);

    // center petal
    fill(233, 235, 155);
    ellipse(flowerX, flowerY, petalSize, petalSize);

  }

}