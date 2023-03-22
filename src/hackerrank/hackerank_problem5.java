package hackerrank;
import java.util.Scanner;

public class hackerank_problem5
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int c = 1 ;
        while(in.hasNext())
        {
            String s = in.nextLine();
            System.out.println(c+" "+s);
            c++;
        }
    }
}