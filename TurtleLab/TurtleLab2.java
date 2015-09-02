import java.awt.Color;

public class TurtleLab2
{
    public static void main(String[] args)
    {
        World turtleWorld=new World();
        Turtle turtle1=new Turtle (turtleWorld);
        Turtle turtle2=new Turtle (turtleWorld);
        turtle1.setPenColor(color.cyan);
        turtle2.setPenCOlor(Color.magenta);
   
    
    for (int a=1; a<90; a++)
    {
        for (int b=0;b<6;b++)
        {
        turtle1.forward(50);
        turtle1.turn(60);
    }
    turtle1.turn(a);
}
for (int a=1; a<90; a++)
    {
        for (int b=0;b<8;b++)
        {
        turtle1.forward(100);
        turtle1.turn(60);
    }
    turtle1.turn(a);
}
    
    /*for (int length=100;length>1;length--)
    {
        createHexagon(length);
        turtle1.turn(90);
        turtle1.forward(5);
        turtle1.turn(-90);
}
    
    for (int b=0;b<6;b++)
        {
        turtle1.forward(95);
        turtle1.turn(60);*/
}
}




        