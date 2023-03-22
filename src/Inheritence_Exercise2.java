class Inheritence_Exercise2
{
    public static void main(String[] args)
    {
        Cuboid cu = new Cuboid();
        
        cu.setSides(4,2);
        System.out.println ("Length = "+cu.getL());
        System.out.println ("Breath = "+cu.getB());
        System.out.println ("Area = "+cu.area());
        cu.setH(3);
        System.out.println ("Height = "+cu.getH());
        System.out.println ("Volume = "+cu.volume());
    }
}

class Rectangle
{
    int l;
    int b;
     
    public void setSides(int a,int b)
    {
        l=a;
        this.b = b;
    }
    public int getL()
    {
        return(l);
    }
    public int getB()
    {
        return(b);
    }
    public int area()
    {
        int a = l*b;
        return(a);
    }
}
class Cuboid extends Rectangle
{
    int h ;
    
    public void setH(int a )
    {
        h = a;
    }
    public int getH()
    {
        return(h);
    }
    public int volume()
    {
        int v = (area())*h ;
        return(v);
    }
}