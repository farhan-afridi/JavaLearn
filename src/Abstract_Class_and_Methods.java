class Abstract_Class_and_Methods        //abstract class = tool with the help of which new classes can be made
{                                   //object can be made of concrete class
    public static void main(String[] args)
    {
        Child1 ch = new Child1 ();
        //Child2 cg = new Child2 ();     NOT ALLOWED    because it is an abstract class
        
        ch.sayHello();
        ch.greet1();
        ch.greet2();
    }
}
abstract class Parent       //abstract=khayali      
{       //So an abstract class is not real, and an object cannot be made of this class
    public Parent()
    {
        System.out.println ("Mai base ka constructor hoon");
    }
     public void sayHello()
    {
        System.out.println ("Hello");
    }
    abstract public void greet1();
    abstract public void greet2();
}
class Child1 extends Parent      //making a concrete/real class using abstract class
{
    @Override
    public void greet1()
    {
        System.out.println ("Good Morning");
    }
    @Override
    public void greet2()
    {
        System.out.println ("Good Night");
    }
}
abstract class Child2 extends Parent    //if we extend abstract class , then either we have to override all abstract methods
{                                       //or we have to declare the child class(derived) abstract.
    /*@Override
    public void greet1()        //if we don't declare the class abstract, then we have to call/use every abstract method of parent class
    {
        System.out.println ("I am Bad");
    }*/
    @Override
    public void greet2()
    {
        System.out.println ("I am good");
    }
}