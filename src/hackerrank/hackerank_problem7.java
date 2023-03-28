package hackerrank;
import java.util.*;

public class hackerank_problem7
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int a = A.length();
        int b = B.length();
        int c = a + b;
        char e = A.charAt(0);
        char d = B.charAt(0);
        int l1 = e;
        int l2 = d;
        System.out.println(c);
        if (l1>l2)
            System.out.println("Yes");
        else
            System.out.println("No");
        e = Character.toUpperCase(e);
        d = Character.toUpperCase(d);

        System.out.print(e+(A.substring(1,a))+" ");
        System.out.println(d+(B.substring(1,b)));
    }
}
