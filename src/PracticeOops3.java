class PracticeOops3
{
    public static void main (String[] args)
    {
        Square first =new Square();
        double s1,s2;
        first.setSide(4.6);  
        s1 = first.calculateArea();
        s2 = first.calculatePeri();
        System.out.println ("Side = " +first.side);
        System.out.println ("Area = "+s1);
        System.out.println ("Perimeter = "+s2);
    }
}

class Square
{
    double side;
    
    public void setSide(double n)
    {
        side = n ;
    }
    public double calculateArea()
    {
        double area = side*side;
        return(area);
    }
    public double calculatePeri()
    {
        double p = 4*side;
        return(p);
    }
}
