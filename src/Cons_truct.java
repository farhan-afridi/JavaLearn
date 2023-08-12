class Cons_truct      // Constructor and Constructor overloading
{
    public static void main(String[] args)
    {
        MyEmployee far = new MyEmployee("Farhan",4);      //automatically calls the constructor, when the object id created
                                                            //if parameter given, initialises the class variables(Attributes)
        //far.setName ("Zoya");
        //far.setId (55);
        System.out.println("Nsme of the employee = "+far.getName());
        System.out.println ("Id of the employee = "+far.getId());
    }
}

class MyEmployee
{
    int id ;
    String name;
    public MyEmployee(String myName,int myId)
    {
        id = myId;
        name = myName;
    }
    public MyEmployee(String myName)
    {
        name = myName;
        id = 0;
        System.out.println ("Id not entered");
    }
    public MyEmployee(int myId)
    {
        name = "null";
        id = myId ;
        System.out.println ("Name not entered");
    }
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