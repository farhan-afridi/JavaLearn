class AccessModPrivate
{
    public static void main (String[] args)
    {
        PriTest sam = new PriTest();
        
        //sam.id = 45 ;      causes error because id and name has private access
        //sam.name = "Sam" ; and cannot be called in other class
                       //   Solution = we use getters and Setters (method)
        
        sam.setName("FARHAN");
        System.out.println (sam.getName());
        
        sam.setId(45);
        System.out.println (sam.getId());
    }
}

class PriTest
{
    private int id;
    private String name;
    
    public void setName(String n)      //we use getters and setters to edit and access(print) private variables
    {
        name = n;           // can use 'this.name=n'  will have same effect
    }
    public String getName()
    {
        return name;
    }
    public void setId(int a)
    {
        id = a ;
    }
    public int getId()
    {
        return id;
    }
}