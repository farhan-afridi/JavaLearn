import java.sql.SQLOutput;

class UseOfThis
{
    public static void main(String[] args)
    {
       EkClass e = new EkClass(56);
       System.out.println (e.getA());
        System.out.println(e.ReturnOne());
    }
}
class EkClass
{
    int a;
    
    public EkClass(int a)
    {
        this.a = a ;        // 'this' is used to refer to particular class that is in use (or the object that is passed to the method for operation)
    }                       // in this case it referring to the variable a of object "e" of class EkClass
    public int ReturnOne()  // it can be used when name of both variables is same
    {                         // it has the ability to differ between the two variables
        return (1);
    }
    public int getA()
    {
        return (a);
    }
}