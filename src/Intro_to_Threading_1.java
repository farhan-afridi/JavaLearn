class Intro_to_Threading_1          //creating a thread by exending thread class 
{
    public static void main (String[] args)
    {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        
        t1.start();         //In using any thread, first we need to start the thread and it will execute the methods by itself
        t2.start();
    }
}

class MyThread1 extends Thread
{
    @Override
    public void run()       //there is a run method in a thread which needs to be overriden , when we want to execute something specific
    {
        int i = 0;
        while (i<40000)
        {
            System.out.println ("Cooking Thread is running ");
            System.out.println ("I am  HAPPY");
            
            i++;
        }
    }
}

class MyThread2 extends Thread
{
    @Override
    public void run ()
    {
        int i = 0;
        while (i<40000)
        {
            System.out.println ("Chatting Thread is RUNNING");
            System.out.println ("I am SAD");
            
            i++;
        }
    }
}