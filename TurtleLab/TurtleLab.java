import java.awt.Color;

public class TurtleLab
{
    public static void main(String[] args)
    {
        World turtleWorld= new World();
        turtleWorld.setSize(500,500);
        Turtle turtle1=new Turtle(turtleWorld);
        Turtle turtle2=new Turtle(turtleWorld);
        Turtle turtle3=new Turtle(turtleWorld);
        Turtle turtle4=new Turtle(turtleWorld);
        Turtle turtle5=new Turtle(turtleWorld);
        Turtle turtle6=new Turtle(turtleWorld);
        
        turtle1.setPenColor(Color.RED);
        turtle1.setPenWidth(25);
        turtle1.penUp();
        turtle1.moveTo(250,250);
        turtle1.penDown();
        
        turtle2.setPenColor(Color.ORANGE);
        turtle2.setPenWidth(25);
        turtle2.penUp();
        turtle2.moveTo(225,275);
        turtle2.penDown();
        
        turtle3.setPenColor(Color.YELLOW);
        turtle3.setPenWidth(25);
        turtle3.penUp();
        turtle3.moveTo(200,300);
        turtle3.penDown();
        
        turtle4.setPenColor(Color.GREEN);
        turtle4.setPenWidth(25);
        turtle4.penUp();
        turtle4.moveTo(175,325);
        turtle4.penDown();
        
        turtle5.setPenColor(Color.BLUE);
        turtle5.setPenWidth(25);
        turtle5.penUp();
        turtle5.moveTo(150,350);
        turtle5.penDown();
        
        turtle6.setPenColor(Color.MAGENTA);
        turtle6.setPenWidth(25);
        turtle6.penUp();
        turtle6.moveTo(125,375);
        turtle6.penDown();
        for(int i=0;i<4;i++) 
        {
            turtle1.forward(50);
            turtle2.forward(100);
            turtle3.forward(150);
            turtle4.forward(200);
            turtle5.forward(250);
            turtle6.forward(300);
            
            turtle1.turnRight();
            turtle2.turnRight();
            turtle3.turnRight();
            turtle4.turnRight();
            turtle5.turnRight();
            turtle6.turnRight();
        }
       
        
    }
}

