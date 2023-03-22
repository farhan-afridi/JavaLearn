class MyException extends Exception
{
    @Override
    public String toString()
    {
        return "I am ToString()";
    }
    @Override
    public String getMessage()
    {
        return "I am GetMessage";
    }
}
public class Exception_class_custom // custom exception is used to detect errors that computer can't detect
{           //a program to divide a no by a given no
    public static void main(String[] args)
    {
        int a = 5 ;
        int b =0;
        if (b==0)       //this is where the  error/exception is checked
        {       //the exception handling follows
            try
            {
                throw new MyException();
//                throw  new ArithmeticException("I am a Exception");    //in bracket , it overrides to getMessage, toString,,,this becomes the reason for error/exception that gets printed
            }
            catch(Exception e)
            {
//                System.out.println(e.getMessage());
//                System.out.println(e.toString());   // same output as given below
                System.out.println(e);              //In general, this prints the 'exception' and reason, the error is occurred
                e.printStackTrace();                //use to track the error
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }
    }
}
