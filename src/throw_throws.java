public class throw_throws
{
    public static void main(String[] args)
    {
        // Some programmer using functions divide and area
        try
        {
            int result1 = divide(4,2);      //if error ocuurs in this line, then the next three lines will not run, the control will directly go to catch block
            System.out.println("result = "+result1);
            double arr = area(6);
            System.out.println("Area = "+arr);
        }
        catch (Exception e)
        {
            System.out.println("Exception");
        }
    }
    public static int divide(int a ,int b) throws ArithmeticException
    {
        int c = a/b;
        return c;
    }
    public static double area(int a)throws RadiusNegativeException
    {
        if(a<0)
        {
            throw new RadiusNegativeException();
        }
        double r = Math.PI*a*a;
        return r;
    }
}
class RadiusNegativeException extends Exception
{
    @Override
    public String toString()
    {
        return "Radius cannot be negative";
    }
    @Override
    public String getMessage()
    {
        return "Radius cannot be negative";
    }
}
