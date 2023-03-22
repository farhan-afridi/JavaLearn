public class thread_Exercise1
{
    public static void main(String[] args)
    {
        Mor m = new Mor();
        Wel n = new Wel();

        m.setPriority(Thread.MAX_PRIORITY); //value of priority can be between 1 to 10(1 and 10 inncluded)
        n.setPriority(Thread.MIN_PRIORITY);

        System.out.println("State of the thread 1 = "+m.getState());
        System.out.println ("State of the thread 2 = "+n.getState());

        System.out.println ("Priority of First Thread  = "+m.getPriority());
        System.out.println("Priority of Second Thread = "+n.getPriority());

        m.start();
        n.start();
        // state of a thread
        System.out.println("State of the thread 1 = "+m.getState());
        System.out.println ("State of the thread 2 = "+n.getState());

        //state of current thread
        System.out.println(Thread.currentThread().getState());
    }
}
class Mor extends Thread
{
    public void run()
    {
        int i = 0 ;
        System.out.println("Good");
//        while (i<5000)
//        {
//            System.out.println("Good Morning");
//            i++;
//        }
    }
}
class Wel extends Thread
{
    public void run()
    {
        int i = 0 ;
        System.out.println("Bad");
//        while (i<5000)
//        {
//            System.out.println("Welcome");
//            i++;
//            try
//            {
//                Thread.sleep(200);
//            }
//            catch(InterruptedException e)
//            {
//                e.printStackTrace();
//            }
    }
}