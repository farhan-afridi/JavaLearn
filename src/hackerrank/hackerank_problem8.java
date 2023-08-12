package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class hackerank_problem8
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        int start = in.nextInt();
        int end = in.nextInt();
        String a = S.substring(start,end);
        System.out.println (a);
    }
}