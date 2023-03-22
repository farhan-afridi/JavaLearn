package hackerrank;
import java.util.Scanner;
// to print in a form          java         100
//                             cpp          065
//                             python       002
class hackerank_problem1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();         //    n ka matlab new line
            System.out.printf("%-15s"+"%03d"+"%n",s1,x);     //IMPORTANT
        }       //                      03 matlab 3 digit krna hi hai
        System.out.println("================================");

    }
}
