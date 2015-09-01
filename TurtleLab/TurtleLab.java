import java.awt.Color;

public class TurtleLab
{
    public static void main(String[] args)
    {
        World turtleWorld= new World();
        turtleWorld.setSize(500,500);
        Turtle turtle1=new Turtle(turtleWorld);
        Turtle turtle2=new Turtle(turtleWorld);
        
        
        turtle1.setPenColor(Color.GREEN);
        turtle1.setPenWidth(25);
        turtle1.penDown();
        turtle1.moveTo(225,225);
        /*for(int i=0;i<4;i++) 
        {
            turtle1.forward(50);
            turtle1.turnRight();
        }
       */
        
    }
}

