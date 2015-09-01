import java.util.Random;
public class DieStimulator
{
    public static void main (String[] args)
    {
        Random generator = new Random ();
        
        System.out.println(generator.nextInt(6)+1);
    }
}