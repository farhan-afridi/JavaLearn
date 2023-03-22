package hackerrank;
import java.util.Scanner;
//  To print series (a+2power0*b),(a+2power0*b+2power1*b),(a+2power0*b+2power1*b+2power2*b)
class hackerank_problem2
{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int s = a ;
            for (int j = 0 ; j<n ; j++)
            {

                int d = power(2,j);
                s = s+d*b;
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
    public static int power(int a,int b)
    {
        int i = 0,s=1;
        for (i = 0;i<b ; i++)
        {
            s = s*a;
        }
        return(s);
    }
}
