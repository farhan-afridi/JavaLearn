import java.util.*;
public class Tset
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner (System.in);
        int a = 9;

        int i = in.nextInt();
        //in.nextLine();      //Needs a change in line after an int input, As the control remains in the int line (for the next String input)

        double d = in.nextDouble();
        in.nextLine();
        String s = in.nextLine();

        //Change in line is required When string input is used after any other input .
        
        System.out.println ("String: "+s);
        System.out.println ("Double: "+d);
        System.out.println ("Int: "+i);
    }
}