class Interface_Example
{
    public static void main (String[] args)
    {
        MySmartPhone ms = new MySmartPhone();
        int i ;
        String[] ar = ms.getNetworks();
        for (i = 0 ; i<ar.length ; i++)
        {
            System.out.println (ar[i]);
        }
        ms.record4kVideo();
        //ms.greet(); ---> greet() is a private and cannot be called here
    }
}

interface MyCamera
{
    void takeSnap();
    void recordVideo();
    default void record4kVideo()        //can be overriden when in class in which it is implemented 
    {                                   //overriden method will be executed
        greet();
        System.out.println ("Recording in 4k");
    }
    private void greet()
    {
        System.out.println ("Good Morning ");
    }
}
interface MyWifi
{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone
{
    void callNumber(int phoneNumber)
    {
        System.out.println ("Calling"+phoneNumber);
    }
    void pickCall()
    {
        System.out.println ("Connecting.....");
    }
}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera
{
    public void takeSnap()
    {
        System.out.println ("Taking Snap");
    }
    public void recordVideo()
    {
        System.out.println("Recording Video");
    }
    public String[] getNetworks()
    {
        System.out.println("Getting List of Networks");
        String[] networkList = {"Harry","Horror","redmi","realme 8"};
        return (networkList);
    }
    public void connectToNetwork(String network)
    {
        System.out.println ("Connecting to "+network);
    }
    
    // public void record4kVideo()
    // {
        // System.out.println ("Overriden in implemennting class");
    // }
}