class Inheritance_Exercise1
{
    public static void main (String[] args)
    {
        Cylinder1 C = new Cylinder1(4,5);
        int a;
        System.out.println ("Radius = "+C.getR());
        System.out.println ("Area of Circle = "+C.area());
        System.out.println ("Circumference = "+C.circum());
        System.out.println ("Height = "+C.getH());
//        a = C.h ;
//        System.out.println ("Height = " +a);
        System.out.println ("Curved Surface Area = "+C.curveArea());
        System.out.println ("Volume of Cylinder = "+C.volume());
    }
}

class Circle
{
    int r; 
    
    public Circle(int a)
    {
        r = a;
    }
    public int getR()
    {
        return r;
    }
    public int area()
    {
        int ar = 3*r*r;
        return(ar);
    }
    public int circum()
    {
        int cir = 6*r;
        return(cir);
    }
}
class Cylinder1 extends Circle
{
    public int h ; 
    
    public Cylinder1(int r,int a)
    {
        super (r);
        h = a;
    }
    public int getH()
    {
        return(h);
    }
    public int curveArea()
    {
        int arr = (circum())*h;
        return(arr);
    }
    public int volume()
    {
        int v = (area())*h;
        return(v);
    }
}