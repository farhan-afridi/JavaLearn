import java.util.Scanner;
class Error_Exception_problem
{
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
        int c = 0 ;
        boolean b = false ;
        while (b==false)
        {
            System.out.println ("Enter array index to retrieve data!");
            int a = in.nextInt();
            c++;
            try
            {
                if (a>10)
                {
                    if (c==5)
                    {
                        System.out.println("ERROR !!!");
                        break;
                    }
                    throw new LimitExceedException();
                }
                else
                {
                    System.out.println("Data = "+arr[a]);
                    b=true;
                }
            }
            catch(Exception e)
            {
                    System.out.println(e.toString());
                    System.out.println(e.getMessage());
            }
        }
    }
}
class LimitExceedException extends Exception
{
    @Override
    public String getMessage()
    {
        return ("Enter valid Array Index !!");
    }
    @Override
    public String toString()
    {
        return ("Array index out of bound");
    }
}