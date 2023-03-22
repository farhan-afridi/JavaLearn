public class thread_priorities
{
    public static void main(String[] args)
    {
        MyThrea t1 = new MyThrea("1");
        MyThrea t2 = new MyThrea("2");
        MyThrea t3 = new MyThrea("3");
        MyThrea t4 = new MyThrea("4");
        MyThrea t5 = new MyThrea("5 most important");

        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }
}
class  MyThrea extends Thread
{
    public MyThrea (String name)
    {
        super(name);
    }
    public void run()
    {
        int i = 500;
        while (i>0)
        {
            System.out.println("Hello Friends " + this.getName());
            i--;
        }
    }
}
