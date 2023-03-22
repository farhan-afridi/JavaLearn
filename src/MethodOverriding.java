class MethodOverriding
{
    public static void main (String[] args)
    {
        A a = new A();
        a.meth2();
        
        B b = new B();
        b.meth2();
        //b.meth1();
        //b.meth3();
    }
}

class A
{
    public int a ;
    
    public int Return()
    {
        return (4);
    }
    public void meth1()
    {
        System.out.println ("I am 1st method of class A");
    }
    public void meth2()
    {
        System.out.println ("I am 2nd method of class A");
    }
}
class B extends A
{   @Override               //should add override (recommended), as it will tell (that overriding is not being done) when the overriding methods are changed
    public void meth2()     //overriding meth2 of class A and executing meth2 of class B
    {
        System.out.println ("I am 2nd method of class B");
    }
    public void meth3()
    {
        System.out.println ("I am 3rd method of class B");
    }
}