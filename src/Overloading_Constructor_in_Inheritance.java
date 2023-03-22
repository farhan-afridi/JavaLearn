class Overloading_Constructor_in_Inheritance
{
    public static void main(String[] args)
    {
        //Base1 b = new Base1 ();
        
        //Derived1 e = new Derived1();
        
        //Derived1 d = new Derived1(4);
        
        //Derived1 f = new Derived1(5,10);
        
        //Child_Of_Derived ch = new Child_Of_Derived();
        
        Child_Of_Derived ch = new Child_Of_Derived(1,2,3);
    }
}

class Base2
{
    Base2()
    {
        System.out.println ("Constructor in Base class");
    }
    Base2(int a)
    {
        System.out.println ("I am Overloaded Constructor of Base Class with value of a = "+a);
    }
}

class Derived2 extends Base2
{
    Derived2()
    {           //  this is where the control goes to Base class        |||in this also, base overloaded cons. can be called for a fixed value using    "super(4);"
        System.out.println ("Constructor in Derived class");
    }
    Derived2(int x)     //x goes to base class
    {
        super(x);
        System.out.println ("I am a Overloaded Constructor of Derived class");
    }
    Derived2(int a, int b)      //a goes to base class and b is used in derived class
    {
        super (a);              //if a is not sent to base, then it will call simple base constructor
        System.out.println ("I am a 2nd Overloaded Constructor of Derived class with b = "+b);
    }
}

class Child_Of_Derived extends Derived2
{
    Child_Of_Derived ()
    {
        System.out.println ("I am a child of Derived class constructor");
    }
    Child_Of_Derived (int a, int b, int c)
    {
        super (a,b);
        System.out.println ("I am a overloaded constructor of Child_of_derived class with value of c = "+c);
    }
}

class Student
{
    public Student()
    {
        System.out.println ("Rank According to Marks");
    }
}