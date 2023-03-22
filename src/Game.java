import java.util.Random;
import java.util.Scanner;

public class Game
{
    public static void main (String[] args)
    {
        Work gus = new Work();
        
        gus.isCorrectNumber();
        System.out.println ("Random No. = "+gus.ran);
        System.out.println ("No. of Tries = " +gus.c);
        System.out.println ("Final No. entered by User = " +gus.input);
    }
}

class Work
{
    int input;
    int c = 0 ;
    Boolean isCorrect = false;
    int ran ;
    public Work()
    {
        Random in = new Random();
        ran = in.nextInt (10);
    }
    public void takeUserInput()
    {
        Scanner in = new Scanner (System.in);
        input = in.nextInt();
    }
    public void isCorrectNumber()
    {
        takeUserInput();
        if (input==ran)
        {
            c++;
            isCorrect = true;
        }
        else
        {
            if (input<ran)
            {
                System.out.println ("Too Low....");
            }   
            if (input>ran)
            {
                System.out.println ("Too High....");
            }
            {
            //System.out.println (ran);
            c++;
            isCorrect = false;
            isCorrectNumber();
            }
        }
    }
}