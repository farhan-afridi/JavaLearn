public class nested_try__catch
{
    public static void main(String[] args)
    {
        int[] marks = new int[3];
        marks[0] = 56;
        marks[1] = 4;
        marks[2] = 58 ;
        try {
            System.out.println ("Welcome to nested try catch class");
            try {
                System.out.println ("Marks = "+marks[4]);
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Exception in 2nd Level");
            }
        }
        catch(Exception e)
        {
            System.out.println ("Exception in 1st Level");
        }
    }
}
