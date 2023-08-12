class Employee
{
    int id;
    String name;
    int salary;
    public void PrintDetails()
    {
        System.out.println ("My ID is = " +id);
        System.out.println ("My name is = "+name);
    }
    
    /*public void GetSalary()
    {
        System.out.println ("My salary is = " +salary);
    }*/
}

public class PracticeOops1   //only one public class in a package
{
    public static void main (String[] args)
    {
        System.out.println ("This is our custom class");
        Employee farhan = new Employee();      //individual identities   (1st) == Object
        int s1,s2;
        farhan.id = 12;                         //properties
        farhan.name= "Sharoz Farhan Afridi";
        farhan.salary = 34;                 //recommended to store in a variable and then use with string
//        System.out.println (" My new ID in direct print = "+farhan.id);    //'farhan.id' can be called separately, called with String inside SOPln can cause error
        //System.out.println (farhan.name);
        farhan.PrintDetails();
        s1=farhan.salary;
//        System.out.println ("Salary Farhan = "+s1);
//        farhan.GetSalary();
        
        Employee zoya = new Employee ();       // Individual 2
        zoya.id = 17;                         //properties
        zoya.name= "Zoya Afridi";
        zoya.salary = 35;                   //values from Employee class can be read in this class
        //System.out.println (zoya.id);
        //System.out.println (zoya.name);
        zoya.PrintDetails();
        s2=zoya.salary;
        System.out.println ("Salary Zoya ="+s2);
    }
}