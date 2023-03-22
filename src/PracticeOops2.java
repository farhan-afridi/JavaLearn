class PracticeOops2
{
    public static void main(String[] args)
    {
        CellPhone realme = new CellPhone();
        realme.callFriend();
        realme.vibrate();
        realme.ring();
    }
}

class CellPhone
{
    int salary;
    
    public void ring()
    {
        System.out.println ("Ringing...");
    }
    public void vibrate()
    {
        System.out.println ("Vibrating...");
    }
    public void callFriend()
    {
        System.out.println ("Calling Friend");
    }
}