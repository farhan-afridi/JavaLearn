import java.util.Scanner;

public class Custom_calculator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter query (***Keep space between no. and symbol***)");
        String s = in.nextLine();

        int c = s.lastIndexOf(' ');
        double a = Double.parseDouble(s.substring(0,s.indexOf(' ')));
        double b = Double.parseDouble(s.substring(c+1,s.length()));

        String sym = s.substring(s.indexOf(' ')+1, c);

        if (a>100000 || b>100000)
        {
            try
            {
                throw new MaxInputException();
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
            }
        }
        else
        if (sym.equals("+"))
        {
            addition(a,b);
        }
        else if (sym.equals("-"))
        {
            subtraction(a,b);
        }
        else if (sym.equals("/"))
        {
            if (b==0)
            {
                try
                    {
                        throw new DividebyZeroException();
                    }
                catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                        System.out.println(e.toString());
                    }
            }
            else
            divide(a,b);
        }
        else if (sym.equals("*"))
        {
            if (a>7000 || b>7000)
            {
                try
                {
                    throw new MaxMultiplierReachedException();
                }
                catch(Exception e)
                {
                    System.out.println(e.getMessage());
                    System.out.println(e.toString());
                }
            }
            else
                multiply(a,b);
        }
        else
        {
            try {
                throw new WrongInputException();
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
            }
        }
    }

    public static void multiply(double a , double b)
    {
        double r = a*b;
        System.out.println("Result = "+r);
    }
    public static void divide(double a , double b)
    {
        double r = a/b;
        System.out.println("Result = "+r);
    }
    public static void addition(double a , double b)
    {
        double r = a+b;
        System.out.println("Result = "+r);
    }
    public static void subtraction(double a , double b)
    {
        double r = a-b;
        System.out.println("Result = "+r);
    }
}

class DividebyZeroException extends Exception
{
    @Override
    public String getMessage()
    {
        return "Enter valid no.";
    }
    @Override
    public String toString()
    {
        return "Cannot divide by zero";
    }
}

class WrongInputException extends Exception
{
    @Override
    public String getMessage()
    {
        return "Enter valid symbol";
    }
    @Override
    public String toString()
    {
        return "Cannot process this";
    }
}

class MaxInputException extends Exception
{
    @Override
    public String getMessage()
    {
        return "Enter small no.";
    }
    @Override
    public String toString()
    {
        return "Cannot process this big no.";
    }
}

class MaxMultiplierReachedException extends Exception
{
    @Override
    public String getMessage()
    {
        return "Enter small no.";
    }
    @Override
    public String toString()
    {
        return "Cannot multiply this big no.";
    }
}