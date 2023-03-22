class Polymorphism_Intro
{
    public static void main (String[] args)
    {
        MyCamera1 cm = new MySmartPhone1();
        // the reference 'cm' can only be used to call methods of Interface-MyCamera1    and not any other interface or class
        cm.record4kVideo();
        //cm.sampleMeth();
        //cm.connectToNetwork(hdgh);
        ///\this cannot be called because sampleMeth and connectToNetwork is not a method of interface 'MyCamera1'
        
        /*object of MySmartPhone can call methods of MySmartPhone and MyCellPhone1*/
    }
}

interface MyCamera1
{
    void takeSnap();        //This is a/the way of making abstract method
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
interface MyWifi1
{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone1
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

class MySmartPhone1 extends MyCellPhone1 implements MyWifi1, MyCamera1
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
    public void sampleMeth()    //method of smartphone only
    {
        System.out.println ("A method of smartphone");
    }
    
//    public void record4kVideo()
//    {
//        System.out.println ("Overriden in implemennting class");
//    }
}