import org.code.neighborhood.*;
public class BearPainter extends MuralPainter {

//Final method that contains all methods called
public void drawBear(){
drawOutline();
drawFace();
drawBody();
finishEars();
}

//method containing instructions to draw the outline of the bear's body
//fills it in using another method created
//uses 1 color for the entirety
public void drawOutline(){
  move();
  move();
  move();
  paintLine("chocolate", 2);
  turnRight();
  move();
  turnLeft();
  paintLine("chocolate", 5);
  turnLeft();
  move();
  turnRight();
  paintLine("chocolate", 2);
  turnRight();
  move();
  paintLine("chocolate", 2);
  turnRight();
  move();
  turnLeft();
  paintLine("chocolate", 1);
  turnLeft();
  turnLeft();
  move();
  turnLeft();
  paintLine("chocolate", 9);
  drawBearLine();
  drawBearLine();
  drawBearLine();
  drawBearLine();
  drawBearLine();
  drawBearLine();
  turnRight();
  move();
  move();
  move();
  move();
  move();
  move();
  move();
  move();
  move();
  move();
  move();
  move();
  move();
  paintLine("chocolate", 2);
  turnLeft();
  turnLeft();
  move();
  move();
  turnLeft();
  paintLine("chocolate", 10);
  turnLeft();
  move();
  turnLeft();
  paintLine("chocolate", 10);

}

//method containing instructions to draw the eyes, snout, and nose of the bear
//uses 2 different colors
public void drawFace(){
  turnLeft();
  move();
  turnLeft();
  move();
  turnRight();
  move();
  turnLeft();
  move();
  move();
  paintLine("black", 1);
  move();
  move();
  move();
  paintLine("black", 1);
  turnRight();
  move();
  move();
  turnRight();
  move();
  move();
  paintLine("tan", 1);
  paintLine("black", 1);
  paintLine("tan", 1);
turnLeft();
  move();
  turnLeft();
  paintLine("tan", 5);
  turnRight();
  move();
  turnRight();
  move();
  move();
  paintLine("tan", 3);


}

//method containig instructions to draw the stomach of the bear
//contains two different colors for contrast
public void drawBody(){
  turnLeft();
  move();
  move();
  move();
  paintLine("tan", 6);
  turnLeft();
  move();
  move();
  move();
  move();
  turnLeft();
  paintLine("tan", 6);
  turnLeft();
  turnLeft();
  move();
  turnRight();
  paintLine("tan", 4);
  turnLeft();
  turnLeft();
  move();
  turnRight();
  move();
  paintLine("tan", 5);
  turnLeft();
  move();
  turnLeft();
  paintLine("tan", 5);
  turnRight();
  move();
  turnRight();
  paintLine("tan", 6);
  }

//finishes the ears of the bear
//final method called in the main method: drawBear();
public void finishEars(){
  turnLeft();
  move();
  move();
  move();
  move();
  turnLeft();
  //while loop to avoid repetition with move(); methods
  while(canMove()){
    move();
  }
  paintLine("chocolate", 1);
  turnLeft();
  move();
  turnLeft();
  move();
  paintLine("tan", 1);
  turnRight();
  turnRight();
  move();
  move();
  turnLeft();
while(canMove()){
    move();
}
  turnRight();
  turnRight();
  move();
  move();
  paintLine("chocolate", 1);
  turnRight();
  move();
  paintLine("tan", 1);
}
//method containing instructions to draw lines along the bear's body
//used to fill in the bear's outline
//used in drawOutline(); method
public void drawBearLine(){
  turnLeft();
  move();
  turnLeft();
  move();
  paintLine("chocolate", 9);
  turnRight();
  move();
  turnRight();
  move();
  paintLine("chocolate", 9);
}

  
}