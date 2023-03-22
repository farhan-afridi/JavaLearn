import java.util.*;
public class handling_specific_Exceptions
{
    public static void main(String[] args)
    {
        int[] marks = new int [3];
        marks[0] = 80;
        marks[1] = 56;
        marks[2] = 33;
        Scanner in = new Scanner (System.in);

        System.out.println("Enter the index of array you want to divide.");
        int ind = in.nextInt();

        System.out.println("Enter the value you want to divide with.");
        int d = in.nextInt();

        try
        {
            System.out.println("The Result of the division is = "+(marks[ind]/d));
        }
        catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException occurred");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException occurred");
            System.out.println(e);
        }
        catch (InputMismatchException e)
        {
            System.out.println("Some exception occurred");
            System.out.println(e);
        }
    }
}
