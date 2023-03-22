public class try_catch_finally
{
    // code in the finally block will be executed either exception occurs or not
    public static void main(String[] args)
    {
        int a = 4;
        int b = 3;
        for (int i =1 ; i<5 ; i++)
        {
            try
            {
                int c = a/b;
                b--;
                System.out.println("inside try block ---------------");
            }
            catch(Exception e)
            {
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("Iniside the finally block");
            }
        }
    }
}
