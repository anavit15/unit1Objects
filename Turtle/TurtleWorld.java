import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.GREEN);
        turtle.speed(0);
        turtle.setPenWidth(25);
        turtle.penDown();
        for(int i=0;i<4;i++) 
        {
            turtle.forward(50);
            turtle.turnRight();
        }
        
        
    }
}
