import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String s = in.nextLine();
        String s1="" ;
        char ch;
        int l = s.length();
        int i = 0 ;
        for (i = 0 ; i<l ; i++)
        {
            ch = s.charAt(i);
            s1 = ch+s1;
        }
        System.out.println (s1);
    }
}