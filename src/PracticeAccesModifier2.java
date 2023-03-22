class PracticeAccesModifier2
{
    public static void main(String[] args)
    {
        Rectangle1 rec = new Rectangle1(5,10);
        
        System.out.println ("Length = "+rec.getLength());
        System.out.println ("Breath = "+rec.getBreath());
        System.out.println ("Area = "+(rec.getLength()*rec.getBreath()));
    }
}

class Rectangle1
{
    private int length;
    private int breath;
    
    public Rectangle1 ()        //Constructor overloading
    {
        length = 4 ; 
        breath = 2 ;
    }
    public Rectangle1(int a , int b )        //Constructor overloading
    {
        length = a ; 
        breath = b ;
    }
    public Rectangle1 (int c)        //Constructor overloading
    {
        System.out.println ("Either Lenght or Breath not entered");
    }
    
    public int getLength()
    {
        return (length);
    }
    public int getBreath()
    {
        return (breath);
    }
}