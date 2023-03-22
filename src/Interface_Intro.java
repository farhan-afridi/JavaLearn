class Interface_Intro
{
    public static void main(String[] args)
    {
        AvonCycle farhan = new AvonCycle();
        farhan.applyBrake(1);
        // we can create properties in interfaces
        System.out.println(farhan.a);
        
        System.out.println(farhan.b);
        // properties in interfaces cannot be modified as they are final
        //farhan.a = 234;       NOT ALLOWED
        
        farhan.print();
        farhan.blowHorn1();
        farhan.blowHorn2();
    }
}
class AvonCycle implements Bicycle,HornBicycle              //more than 1 interfaces can implemented
{
    //public int b = 5;     //interface properties can be overriden
    public void applyBrake(int decrement)
    {
        System.out.println ("Applying Breaks");
    }
    public void speedUp(int increment)
    {
        System.out.println ("Applying SpeedUp");
    }
    public void blowHorn1 ()
    {
        System.out.println ("Peeeeeee,...........");
    }
    public void blowHorn2()
    {
        System.out.println ("Poooooooo...........");
    }
}
interface Bicycle           //all methods in interface are abstract, whether it is mentioned or not
{
    final int a = 45;       //it is final , even if its not mentioned
    void applyBrake(int decrement);//interfaces methods are public by default, no need to mention
    void speedUp(int increment);
    //interface abstract methods cannot have body
    default void print()            // to have body, it should be declared default or private
    {
        System.out.println ("Print in interface Bicycle");
    }
}
interface HornBicycle   //each and every method of an interface has to be called
{                       //compulsory to call all methods of an interface
    int b = 35;             //it is a final variable, even when 'final' keyword is not used
    void blowHorn1();
    void blowHorn2();
}