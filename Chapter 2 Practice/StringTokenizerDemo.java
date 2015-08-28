/*public class String1
{
    public static void main(String[] args)
    {
        String greeting="Hello, World!";
        int n=greeting.length();
        
        System.out.println("length of string: "+n);
        
        String river="Mississippi";
        String bigRiver=river.toUpperCase();
        System.out.println("river: "+river+" big river: "+bigRiver);
    }
}


public class ConcatDemo
{
    public static void main(String[]args)
    {
      String animal1 = "quick brown fox ";
      String animal2 = "lazy dog ";
      String article = "the ";
      String action = "jumps over ";
      String message=(article+animal1+action+article+animal2);
      System.out.println(message);
    }
}

public class ConcatDemo
{
    public static void main(String[]args)
    {
      String animal1 = "quick brown fox ";
      String animal2 = "lazy dog ";
      String article = "the ";
      String action = "jumps over ";
      String message=(article.concat(animal1).concat(action).concat(article).concat(animal2));
      System.out.println(message);
    }
}

public class TrimIt
{
    public static void main(String[] args)
    {
      String sentence1 = "      abc   ";
      String sentence2 = "   def";
      String sentence3 = "ghi         ";
      String message=(sentence1.trim()+sentence2.trim()+sentence3.trim());
      System.out.println(message);
    }
}
*/
import java.util.StringTokenizer;
public class StringTokenizerDemo
{
    public static void main (String[] args)
    {
      String sentence="Mary had a little lamb.";
      StringTokenizer mystery =new StringTokenizer (sentence);
      System.out.println(mystery);
      System.out.println(mystery.countTokens());
      System.out.println(mystery.nextToken());
      System.out.println(mystery.nextToken());
   }
}
      
        