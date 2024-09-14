import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

//Instantiates a new painter from the MuralPainter.java file
MuralPainter mp = new MuralPainter();
    mp.paintBackground("violet", 16);

//Instantiates a new painter from the BearPainter.java file
    BearPainter bear = new BearPainter();
bear.drawBear();
  }
}