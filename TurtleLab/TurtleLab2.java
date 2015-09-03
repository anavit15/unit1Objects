import java.awt.Color;



public class TurtleLab2
{
    public static void main(String[] args)
    {
        World turtleWorld=new World();
        Turtle turtle1=new Turtle (turtleWorld);
        Turtle turtle2=new Turtle (turtleWorld);
        turtle1.setPenColor(Color.CYAN);
        turtle1.hide();
        turtle2.setPenColor(Color.GRAY);
        turtle2.hide();
    
    for (int a=1; a<90; a++)
    {
        for (int b=0;b<6;b++)
        {
        turtle1.forward(100);
        turtle1.turn(60);
    }
    turtle1.turn(a);
    
}

turtle2.penUp();
turtle2.moveTo(100,100);
turtle2.penDown();
    for (int c=1; c<90; c++)
    {
        for (int d=0;d<4;d++)
        {
        turtle2.forward(50);
        turtle2.turn(90);
        turtle2.setPenColor(Color.GRAY);
    }
    turtle2.turn(c);
    turtle2.setPenColor(Color.darkGray);
    
}
turtle2.penUp();
turtle2.moveTo(515,400);
turtle2.penDown();
for (int e=1; e<90; e++)
    {
        for (int f=0;f<4;f++)
        {
        turtle2.forward(50);
        turtle2.turn(90);
        turtle2.setPenColor(Color.GRAY);
    }
    turtle2.turn(e);
    turtle2.setPenColor(Color.darkGray);
    
}
}
}



/*for (int c=1; c<90; c++)
    {
        for (int d=0;d<4;d++)
        {
        turtle1.forward(100);
        turtle1.turn(90);
    }
    turtle1.turn(c);
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





        