public class thread_methods
{
    public static void main(String[] args)
    {
        NewThre1 t1 = new NewThre1();
        NewThre2 t2 = new NewThre2();

        t1.start();
        try
        {
            t1.join();  // to priorities in a way that when t1 is completed only then t2 will start.
        }
        catch(Exception e)
        {
            System.out.println (e);
        }

        t2.start();
    }
}
class NewThre1 extends Thread
{
    public void run ()
    {
        int i = 0 ;
        while(i<5000)
        {
            System.out.println("My new thread");
            try
            {
                Thread.sleep(2000);     //it causes a delay, goes to sleep for 2 seconds and then comes alive to run
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            i++;
        }
    }
}
class NewThre2 extends Thread
{
    public void run ()
    {
        int i = 0 ;
        while(i<5000)
        {
            System.out.println ("22222");
            i++;
        }
    }
}