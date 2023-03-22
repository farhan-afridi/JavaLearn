public class Constructors_of_Thread
{
    public static void main(String[] args)
    {
        MyThr t1 = new MyThr("Farhan");
        MyThr t2 = new MyThr("Afridi");
        t1.start();
        t2.start();
        System.out.println("The ID of the Thread1 is = "+t1.getId());
        System.out.println("The name of the Thread1 is = "+t1.getName());
        System.out.println("The ID of the Thread2 is = "+t2.getId());
        System.out.println("The name of the Thread2 is = "+t2.getName());
    }
}
class MyThr extends Thread
{
    public MyThr(String name)
    {
        super(name);
    }
    public void run()
    {
        int i= 21;
        System.out.println("Thank You");
//        while(true)
//        {
//            System.out.println("I am a Thread");
//        }
    }
}