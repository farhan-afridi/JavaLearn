class Intro_to_threading_2          //creating thread by implementing runnable interface
{
    public static void main(String[] args)
    {
        MyThreadClass1 bullet1 = new MyThreadClass1();
        Thread gun1 = new Thread(bullet1);
        
        MyThreadClass2 bullet2 = new MyThreadClass2 ();
        Thread gun2 = new Thread (bullet2);
        
        gun1.start();
        gun2.start();
    }
}

class MyThreadClass1 implements Runnable
{
    @Override
    public void run()
    {
        int i = 0 ;
        for(i = 0 ; i<400 ; i++)
        {
            System.out.println ("I am thread 1 and not threat 1");
        }
    }
}
class MyThreadClass2 implements Runnable
{
    @Override
    public void run()
    {
        int i = 0 ;
        for(i = 0 ; i<400 ; i++)
        {
            System.out.println ("I am thread 2 and not threat 2");
        }
    }
}