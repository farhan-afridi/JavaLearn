public class Constructors_of_Thread2
{
    public static void main(String[] args)
    {
        MyHtr d1 = new MyHtr();
        Thread g1 = new Thread(d1, "Zoya");

        System.out.println("The ID of the thread is = " + g1.threadId());
        System.out.println("The Name of the thread is = " + g1.getName());
    }
}
class MyHtr implements Runnable
{
    public void run()
    {
        System.out.println("Thank YOU");
    }
}