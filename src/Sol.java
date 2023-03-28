// question from hacker rank                contains query related to STRING
import java.io.*;
import java.util.*;
public class Sol
{
    public static void main(String[] args) 
    {
        Sol sc = new Sol();
        Scanner in = new Scanner (System.in);
        String q1="",q2="",q3="";
        String s1 = in.nextLine();
        int a1 = in.nextInt();
        in.nextLine();      //String input need change in line after any other input
        String s2 = in.nextLine();
        int a2 = in.nextInt();
        in.nextLine();
        String s3 = in.nextLine();
        int a3 = in.nextInt();
        
        q1 = sc.correction(a1);
        q2 = sc.correction(a2);
        q3 = sc.correction(a3);
        
        System.out.println (s1+"\t"+q1);
        System.out.println (s2+"\t"+q2);
        System.out.println (s3+"\t"+q3);
    }
    public String correction(int a)
    {
        int i ,c=0;
        String s = "";
        if (a>=100 && a<=999)
        {
            s=""+a;
            return (s);
        }
        else
        {
            for (i = a ; i>0 ; i=i/10)
            {
                c++;
            }
            s=""+a;
            for (i = (3-c) ; i>0 ; i--)
            {
                s = "0"+s;
            }
            return(s);
        }
    }
}