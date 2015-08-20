import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.GREEN);
        turtle.
        setPenWidth(25);
        turtle.penDown();
        for i in range(4):
            turtle.forward(50);
            turtle.turnRight();
        
        
        
    }
}
