class Dynamic_Method_Dispatch
{
    public static void main (String[] args)
    {
        //Phone obj = new Phone();
        //SmartPhone obj2 = new SmartPhone();
        //obj.name();
        
        // reference of Super CLass (Parent class) can be used in making object of Sub-class (Daughter Class)
        Phone obj = new SmartPhone();       //THIS IS ALLOWED
        // COMMON methods and super class methods can be called in this
        //SmartPhone obj2 = new Phone();          NOT ALLOWED
        
        //obj.music();    NOT ALLOWED               // refernce of Phone is used but, \/
        obj.on();       // object is being created of SmartPhone, so on() is being called of SmartPhone
        obj.showTime();
    }
}

class Phone
{
    public void showTime()
    {
        System.out.println("Time = 8:00 AM");
    }
    public void on()
    {
        System.out.println ("Turning on Phone.......");
    }
}
class SmartPhone extends Phone
{
    public void music()
    {
        System.out.println ("Playing Music.....");
    }
    public void on()
    {
        System.out.println ("Turning on SmartPhone.........");
    }
}