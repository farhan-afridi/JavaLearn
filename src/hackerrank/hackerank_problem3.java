package hackerrank;
import java.util.Scanner;
    //to print table of Entered no.
class hackerank_problem3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        int N = in.nextInt();
        int i = 0;
        for (i=1 ; i<=10 ; i++)
        {
            System.out.println (+N+" x "+i+" = "+(N*i));
        }
    }
}