class Constructor_in_Inheritance
{
    public static void main(String[] args)
    {
        Base1 b = new Base1 ();     // Sirf apna hi constructor call krega
        
        Derived1 d = new Derived1();        //when objected is created    First     1)Constructor of Base class is called (kyuki vo parent class hai,  parent first)
    }                                                                   //Second    2)Constructor of Derived clas is called 
}

class Base1
{
    Base1()
    {
        System.out.println ("Constructor in Base class");
    }
}

class Derived1 extends Base1
{
    Derived1()
    {       // This is where control goes to Parent class and comes back to execute, following code
        System.out.println ("Constructor in Derived class");
    }
}