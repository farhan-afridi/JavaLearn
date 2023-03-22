import jdk.jshell.spi.ExecutionControl;

public class try_catch
{
    public static void main(String[] args)
    {
        int a = 6000;
        int b = 0;
        int c = 0;
        try
        {
            c = a / b;
            System.out.println("Result is = " + c);
        }
        catch(Exception e)
        {
            System.out.println("We failed to divide. Reason :");
            System.out.println(e);
        }
    }
}
