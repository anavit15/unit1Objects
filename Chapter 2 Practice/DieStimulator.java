import java.util.Random;
public class DieStimulator
{
    public static void main (String[] args)
    {
        Random generator = new Random ();
        int dieValue=generator.nextInt(6);
        dieValue=dieValue+1;
        System.out.println(dieValue);
        
        //System.out.println(generator.nextInt(6)+1);
        
        //Option B
        Math.random();
        double dieValue2=Math.random();
        dieValue2*=6;
        dieValue2+=1;
        System.out.println((int)dieValue2);
    }
}