class SampleInheritance
{
    public static void main (String[] args)
    {
        Base b = new Base();
        b.setX(4);
        System.out.println("X from object of Base class = "+b.getX());

        //calling method of derived class from base class
        //b.setY(1);
        //System.out.println ("Y from object of Base class = " +d.getY());
        //  Method of derived class(child class) cannot be called from object of Base class.(parent class)
        
        Derived d = new Derived();
        d.setY(6);
        System.out.println ("Y from object of Derived class = "+d.getY());
        
        // method of base class (parent class) can be called from object of derived class(child class)
        
        System.out.println ("Calling method of Base class from Derived class = ");
        d.setX(8);
        d.printMe();
        System.out.println ("X from object of Derived class = "+d.getX());
    }
}

class Base   // PARENT CLASS
{
    public int x ;
    
    public void setX(int a)
    {
        x=a ;
    }
    public int getX()
    {
        return (x);
    }
    public void printMe()
    {
        System.out.println ("I am a Base class");
    }
}

class Derived extends Base      // CHILD CLASS
{
    int y;
    
    public void setY(int b)
    {
        y = b;
    }
    public int getY()
    {
        return (y);
    }
}