package hackerrank;
import java.util.*;

class hackerank_problem4
{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        long x = 0 ;

        for(int i=0;i<t;i++)
        {
            x=0;
            try
            {
                System.out.println ("Enter Number");
                x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)
                    System.out.println("* byte");
                if (x>=-32768 && x<=32767)
                    System.out.println ("* short");
                if (x>=-2147483648 && x<=2147483647)
                    System.out.println ("* int");
                if (x>=-9223372036854775808L && x<=9223372036854775807L)    //in long data type use 'L' after the no.
                    System.out.println ("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
                //If according to question a number cannot be stored in 'long' data type, So it will not get stored in the(Long) variable x
                // If this occurs then Exception Handler (catch block) will treat it as a string
            }

        }
    }
}
