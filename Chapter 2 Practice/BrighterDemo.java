import java.awt.Color;
import javax.swing.JFrame;
public class BrighterDemo
{
    public static void main(String[] args)
    {
        JFrame frame=new JFrame();
        frame.setSize(200,200);
        Color color1=new Color(50,100,150);
        color1=color1.brighter();
        System.out.println(color1);
        frame.getContentPane().setBackground(color1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
}
 