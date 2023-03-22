class PracticeAccesModifier1
{
    public static void main(String[] args)
    {
        Cylinder pr = new Cylinder(9,12);
        
        //pr.setRadius(5);
        //pr.setHeight(10);
        // System.out.println("radius = "+ pr.radius());         Cannot be Called because radius has a private access.
        System.out.println ("Radius = " +pr.getRadius());       // Therefore we use getters
        System.out.println ("Height = " +pr.getHeight());
        System.out.println ("Surface Area = "+pr.calcSurfaceArea());
        System.out.println ("Voume = " +pr.calcVolume());
    }
}

class Cylinder
{
    private int radius;
    private int height;
    
    public Cylinder(int a,int b)
    {
        radius = a;
        height = b;
    }
    //     SETTERS
    /*public void setRadius(int a)
    {
        radius = a;
    }
    public void setHeight(int b)
    {
        height = b;
    }*/
    
    public int getRadius ()
    {
        return (radius);
    }
    public int getHeight()
    {
        return (height);
    }
    public double calcSurfaceArea()
    {
        double s = (2*Math.PI*radius*radius)+(2*Math.PI*radius*height);
        return(s);
    }
    public double calcVolume()
    {
        double v = Math.PI*radius*radius*height;
        return (v);
    }
}